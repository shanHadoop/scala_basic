package ayush.sessions

import java.util.concurrent.Executors

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

object FutureDemo extends App {
  //This is the second way of creating a execution context
  //EC allocate thread to execute,
  // Here execution context decide in which thread this future will be executed, we donot have
  //control over it
  implicit val ec = ExecutionContext.fromExecutor(Executors.newFixedThreadPool(1000))
  val f = Future(("Hello Future"))(ec)

  f.onComplete( x =>  x match {
    case  Success(myVal) => println("------"+myVal)
    case Failure(e)  => println(e)
  })
  f.map(println(_))
  println("waiting for future")
 // Thread.sleep(1000)

case class Person(id:String, name:String) {
  def ping(anotherPerson:Person) = println(s"$name pinged to ${anotherPerson.name}")
}


  object SocialWorker {
    val names = Map("id1" -> "Shantanu",
    "id2" -> "Amit",
    "id3" -> "Madhava")

    val friends = Map("id1" -> "id2",
    "id2" -> "id3")

// APIS
    def fetchProfile(id:String) = Future{
      // fetching from database
      Thread.sleep(100)
      Person(id,names(id))
    }

    def fetchFriend(person:Person) = Future{
      Thread.sleep(100)
      val friendsId = friends(person.id)
      Person(friendsId,names(friendsId))
    }
  }

  // clients Application
  // Shantanu wants to ping Amit

//  val shantanuF:Future[Person] = SocialWorker.fetchProfile("id1")
//  shantanuF.onComplete {
//    case Success(shantanuProf) =>
//        val amitProf = SocialWorker.fetchFriend(shantanuProf)
//         amitProf.onComplete{
//           case Success(amitProf) => shantanuProf.ping(amitProf)
//           case Failure(ex) => ex.printStackTrace()
//         }
//    case Failure(exception) => exception.printStackTrace()
//  }

// functional composition nature
  // 1. Map
  // flatMap
  // filter


  val operation = for {
    shan <- SocialWorker.fetchProfile("id1")
    amit <- SocialWorker.fetchFriend(shan)
  } yield shan.ping(amit)
  //

 val id11Profile = SocialWorker.fetchProfile("id11")
   id11Profile.onComplete(x =>
  x match {
    case Success(x) => println(s"profile is $x")
    case Failure(exception) => exception.printStackTrace()
  })

  // here if futue retrun any exception that exception we catch with withRecover and return another Future
  val id11ProfileWithRecovery = SocialWorker.fetchProfile("id11").recoverWith{
    case ex:Throwable => SocialWorker.fetchProfile("id3")
  }

  id11ProfileWithRecovery.onComplete{case Success(value) => println(s"profile is $value") }

  Thread.sleep(1000)

}

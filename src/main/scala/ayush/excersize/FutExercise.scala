//package ayush.excersize
//
//import scala.concurrent.duration._
//import scala.concurrent.{Await, Future, Promise}
//import scala.concurrent.ExecutionContext.Implicits.global
//import scala.util.Success
//
//object FutExercise extends App {
//
//
//  //1. create a future from a value
//  def immediate[A](value: A): Future[A] = Future{
//   value
//  }
//
//  //2. run the  two futures in sequence, first followed by second
//  def inSeq[A,B](first: Future[A], second: Future[B]) : Future[B]  = {
//    for {
//      fa <- first
//      fb <- second
//    }  yield fb
//
//    //or
//  // first.flatMap( fa => second)
//
//    }
//
//
//
//  //3. create a new Future with the value of the future that completes FIRST
//  // hint : use promise, create a promise and fullfill it on completion of futures
////  def first[A](one: Future[A], two: Future[A]) : Future[A] = ???
//  def first[A](one: Future[A], two: Future[A]) : Future[A]= {
//    val promise = Promise[A]
//
//    one.onComplete(promise.tryComplete(_))
//  }
//
//  //4. create a new Future with the value of the future that completes LAST
//  // hint : use 2 promises
//  def last[A](one: Future[A], two: Future[A]) : Future[A] = ???
//
//
//  //5. retry until
//  // run the  action until the condition is satisfied
//  // when the condition is met return the future as a result
//  def retryUntil[A](action: () => Future[A], condition : A => Boolean): Future[A] = ???
//}

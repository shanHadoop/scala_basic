package skd.com.scalaLearning.HOFandCurring

object CurryingComposeMethodDemo extends App {

  def toCurrying(f:(Int,Int) => Int) : Int => Int => Int =    x => y => f(x,y)
  def fromCurrying(f:(Int=>Int=>Int)):((Int,Int) => Int) =  ((x,y) => f(x)(y))
  def compose[A,B,C](f:A=>B , g:C=>A) = {
    x:C => f(g(x))
  }

  def andThen[A,B,C](f:A=>B,g:B=>C):A=>C ={
    x => g(f(x))
  }


  def superAdd2:(Int=>Int=>Int)= toCurrying(_ + _ )
  println(superAdd2(10)(20))
  val add2 = (num:Int) => num + 2
  val times5 = (num:Int) => num * 5

  val compsed = compose(add2,times5)
  val andthened = andThen(add2,times5)

  println(compsed(2))
  println(andthened(2))

}

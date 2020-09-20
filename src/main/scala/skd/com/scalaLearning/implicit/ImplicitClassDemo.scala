package skd.com.scalaLearning.`implicit`


object ImplicitClassDemo extends App {

  // Our interface
  trait Monoid[A] {
    def zero: A
    def plus(a: A, b: A): A
  }

  // Implementation for integers
  implicit object IntegerMonoid extends Monoid[Int] {
    override def zero: Int = 0
    override def plus(a: Int, b: Int): Int = a + b
  }

  // Implementation for strings
  implicit object StringMonoid extends Monoid[String] {
    override def zero: String = ""
    override def plus(a: String, b: String): String = a.concat(b)
  }

  implicit object BolleanMonoid extends Monoid[Boolean] {
    override def zero: Boolean = true
    override def plus(a: Boolean, b: Boolean): Boolean = a.&&(b)
  }

  // Could be implementation for custom classes, etc..

  // Our generic function that knows which implementation to use based on type parameter 'A'
  def sum[A](values: Seq[A])( implicit ev: Monoid[A]): A = values.foldLeft(ev.zero)(ev.plus)

  val l = List(1,2,3,4,5,6,7,8)
  val lb = List(true,true,true)
  val lStr = List("1","2","3","four" ,"five six","dd","Shan")
  //val intMonad:Monoid[Int]= IntegerMonoid
  val intSum= sum(lb)

  println(intSum)

}

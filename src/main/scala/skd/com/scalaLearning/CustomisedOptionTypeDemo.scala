package skd.com.scalaLearning

object CustomisedOptionTypeDemo extends App {
  val myOption = SomeSKD(10)
  println(myOption.map(_*20))

  val afterFlat= myOption.flatMap(x => SomeSKD(x+" 20"))

println(afterFlat)


  println(myOption.filter(x => x >10))
}


abstract class OptionSkd[+T] {
  def map[B](f: T => B): OptionSkd[B]

  def flatMap[B](f: T => OptionSkd[B]): OptionSkd[B]

  def filter[B](f: T => Boolean): OptionSkd[T]
}

case object NoneSKD extends OptionSkd[Nothing] {
  override def map[B](f: Nothing => B): OptionSkd[B] = NoneSKD

  override def flatMap[B](f: Nothing => OptionSkd[B]): OptionSkd[B] = NoneSKD

  override def filter[B](f: Nothing => Boolean): OptionSkd[Nothing] = NoneSKD
}

case class SomeSKD[+T](values: T) extends OptionSkd[T] {
  def map[B](f: T => B): SomeSKD[B] = SomeSKD(f(values))

  def flatMap[B](f: T => OptionSkd[B]): OptionSkd[B] = f(values)

  def filter[B](f: T => Boolean): OptionSkd[T] = {
    if (f(values)) this
    else NoneSKD

  }
}
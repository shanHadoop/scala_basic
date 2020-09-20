package skd.com.scalaLearning.hof

object HighOrderReturnFunDemo extends App {

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)


  def sumInt(a:Int,b:Int) = sum(x => x, a, b)

}

package fp

object PolyMorphicDemo extends App {

  def findAInArrayofA[A](arr: Array[A], p: A => Boolean): Int = {
    def loop(n: Int):Int = {
    if (n >= arr.length) -1
    else if (p (arr (n) ) ) n
    else loop (n - 1)
  }
  loop(0)
  }

}

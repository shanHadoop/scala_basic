package fp

import scala.annotation.tailrec

object TailRecurssionDemo extends App {

  // find the factorial of a number n

  def factorial(n: Int): Int = {
    @tailrec
    def go(n: Int, acc: Int): Int = {
      if (n <= 1) acc
      else go(n - 1, n * acc)
    }

    go(n, 1)
  }

  println(s"Factorial of n is ${factorial(5)}")


  def fibonancySeries(n: Int) = {
    def go(n: Int, previos: Int, current: Int): Int = {
      n match {
        case 0 => current
        case _ => go(n - 1, (previos + current), current = previos)
      }

    }

    go(10, 1, 0)

  }
  println(fibonancySeries(10))

}

package skd.com.scalaLearning.pattern.matching

import scala.util.Random

object PatternMatchingDemo  extends App{



  def matchCase(x: Int): String =
    x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "Three"
      case _ => "other"

    }
 println(matchCase(2))  // other




}

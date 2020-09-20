package skd.com.scalaLearning.day1

import java.sql.SQLException
import java.util.Date

import scala.util.Try

object HelloWorld extends  App {
  //  println("Hello World")
  //  println(new Date(1080193800722L))
  def toIntVale(myVal: String) = {
    try {
      println(myVal.toInt + 1)
    } catch {
      case e: myException => println("Exception occured with myException")
      case e: Exception => println("Exception occured")
      case e: SQLException => println("SQL  is not the correct value")
      case e: NumberFormatException => println("There is not the correct value")

    } finally {
      println("calculation Success")
    }
  }

  def toIntV(myVal: String) = {
    Try {
      println(myVal.toInt + 1)
    }

  }
val x = 10
  if (x == 10) {throw new myException}
}


class myException extends NumberFormatException
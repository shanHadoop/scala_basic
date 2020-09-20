package skd.com.scalaLearning.day1

object ValueVariableClass extends App {
  val x:String = "Shantanu ";

  val y = "Shantanu"
  // Scala compiler can infer it's type from values assigned
  // Val are Immutable



  // Data Type STRING
  val aString: String = "hello"
  val anotherString = "goodbye"

  // Other datatype
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = 1000000000
  val aShort: Short = 4613
  val aLong: Long = 5273985273895237L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables   mutable
  var aVariable: Int = 4

  aVariable = 5 // side effects

}

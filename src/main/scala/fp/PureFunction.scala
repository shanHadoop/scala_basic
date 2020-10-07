package fp

object PureFunction extends App{

  val x = "Hello World"
  val r1 = x.reverse
  var r2 = x.reverse
  // r1 and r2 would be same

  // Suppose we replace x with value
  val r11 = "Hello World".reverse
  val r22 = "Hello World".reverse
  // r11 and r22 would be same

  /// SO x is pure/referential transparent

  val x1 = new StringBuilder("Hello")
  val y = x1.append(", World")
  val r111 = y.toString()
  val r222 = y.toString()

  // So far r111 and r222 will have same value.

  //but

  val rx1 = x1.append(", World").toString()
  val rx2 = x1.append(", World").toString()

  println(rx1)
  //Hello, World, World

  println(rx2)
//Hello, World, World, World


  //So StringBuilder  append() function is not a fure function as it is not a referntial transparent.

}

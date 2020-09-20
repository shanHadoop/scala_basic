package skd.com.scalaLearning

object OptionDemo extends App {

  def unSafeVale = null

  def safeValue = 4

  // Some always keep some valid value


  println(Option(unSafeVale))
  println(Option(safeValue))

  // chained method
  val safeResult = Option(unSafeVale).orElse(Option(safeValue))
  def unSafeValue = None
  def inUnSafeValue = Some(10)
  val chainedSafeValue = unSafeValue.orElse(inUnSafeValue)
  println(chainedSafeValue)









}

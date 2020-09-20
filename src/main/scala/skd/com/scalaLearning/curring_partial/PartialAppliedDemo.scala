package skd.com.scalaLearning.curring_partial

object PartialAppliedDemo extends App{

  def validateNumberInRange(leftBound: Int, num: Int, rightBound: Int): Boolean = {
    if (leftBound < num && num < rightBound) true
    else false
  }


  val sendUpandLower = validateNumberInRange(_:Int,5,_:Int)
  println(sendUpandLower(4,9))
  println(sendUpandLower(16,4))

}

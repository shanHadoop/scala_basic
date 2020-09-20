package skd.com.scalaLearning.pattern.matching

object PatMat_CaseClass extends App {
  sealed abstract class CardType

  case class Spike(size:Int,col:String) extends CardType

  case class Diamond() extends CardType

  case class Heart() extends CardType

  case class Club() extends CardType

  def getCardType(cardSuit: CardType): String = {
    cardSuit match {
      case Spike(a,b) => s"Card is spike with Size $a  $b"
      case Club() => "Card is club"
      case Heart() => "Card is heart"
      case Diamond() => "Card is diamond"
    }
  }

  val x:Spike = Spike(10,"RED")


  println(getCardType(x))
  println(getCardType(Heart()))
  println(getCardType(Club()))

}

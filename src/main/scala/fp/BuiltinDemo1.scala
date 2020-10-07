package fp

object BuiltInDemo1 extends App {
  val exp = new Exponentiator(2)
  println(exp.handle(exp.expo1))
}


//trait InstantiatingDemo {
//  trait Frag {
//    def render:String
//  }
////HTML constructor
//  def div(child:Frag*):Frag
//  def p(child:Frag*):Frag
//  def h1(child:Frag*):Frag
//  implicit def stringFrag(s:String):Frag
//}

class Exponentiator(val x:Int){

  def exponentiate(d:Double) = Math.pow(d,x)
  val expo = (d:Double) => Math.pow(d,x)
  val expo1 :(Double => Double) = (d) => Math.pow(d,x)

  def handle(op: Double => Double ) = op(x)


}



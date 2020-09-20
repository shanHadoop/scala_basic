package skd.com

object TraitExample extends App{

  trait Performance {
    def act(x:Int):Int;


  }

  val x :Performance = (num:Int) => (num + 1)
  println(x.act(20))

}

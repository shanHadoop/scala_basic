package fp

class  SayHello(f: String => Unit){

  def printLog(msg:String)={
    f(msg)
  }

}

object testSayHello extends App {
  val say= new SayHello(System.out.println)
    say.printLog("Shantanu Kumar Dutta")


}
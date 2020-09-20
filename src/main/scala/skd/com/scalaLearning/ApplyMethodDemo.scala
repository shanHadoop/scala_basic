package skd.com.scalaLearning

object ApplyMethodDemo extends App{
println(Connection("",""))
}


class Connection{

  val config = Map(
    "host" -> "10.1.1.0",
    "port" -> "8080"
  )

}

object Connection {

  def apply(host:String, port:String) ={
    Option(new Connection)
  }
}

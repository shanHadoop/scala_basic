package skd.com.scalaLearning

object DemoHelloWorld extends App{

  new Demo
  new Demo()
  new Demo
  new Demo()

  println(Demo.counter)


}


object Demo{
  var counter = 0
}
class Demo {
  Demo.counter += 1
}


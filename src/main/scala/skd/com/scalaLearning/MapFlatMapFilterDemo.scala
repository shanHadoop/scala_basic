package skd.com.scalaLearning

object MapFlatMapFilterDemo extends App{
 //map and flatMap
  val l1 = List(1,2,3,4)
  val l2 = List('a','b','c','d')
  val l3 =List("white","black")

  val combine = l1.flatMap(x=>l2.flatMap(y => l3.map("" + x + y + _)))
  println(combine)

  //for comprehensive
  val combined = for {
    a1 <- l1 if (a1 % 2) ==0
    a2 <- l2
    a3 <- l3
  } yield "" + a1+a2+a3

  println(combined)


}


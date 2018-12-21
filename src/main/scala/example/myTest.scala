package example
import myTest._
//Companion objects and classes

object myTest {
  private var n = 100
  var o = new myTest
  println(o.r) //companion objects and classes share the private stuff between them
}

class myTest{
  private val r = 2
  println(n)
}



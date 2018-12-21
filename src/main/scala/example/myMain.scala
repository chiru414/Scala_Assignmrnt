package example

object myMain {
  //This is a singleton object, like a static class in Java
  def main(args: Array[String]): Unit = {
    val obj = new myClass
    obj.inc
    println(obj.curr)
    obj.add()

    var o = new myClass(3,4)
    println(o.getA)
    o.setA(5)
    println(o.getA)
    o.add()


  }
}

package example
//Interface kind in Java
//but traits can have partial implementations
trait one {
  def show()
  //def see()
}

trait newone{
  var x:Int //abstract
  var y = 2 //concrete
  def fun1() //abstract method
}

trait two {
  def fun2() // abstract method
}

class three extends newone with two {

  def fun1={println("fun1 method")}
  def fun2 = {println(("fun2 method"))}

  var x = 1
}

//abstract
class traits extends one{ //like implementing the interface
  //here abstract keyword is useful to implement only what i want from the trait
  def show()={
    println("Implementing show method from trait")
  }
}

object newmain
{
  def main(args: Array[String]): Unit = {
    var o = new traits
    o.show()
    var o1 = new three
    o1.fun1
    o1.fun2
  }
}
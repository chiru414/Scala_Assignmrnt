package example

//this explains simple  inheritence
class employee {
  var salary = 10000
}
class programmer extends employee{
  var bonus = 1000
  println("Salary is " + salary)
  println("Bonus is "+ bonus)
}

//this explains multi level inheritance
class A{
  var sal = 10000
}
class B extends A{
  var sal1 = 20000
}
class C extends B{
  def show()={
    println("salary of A" + sal)
    println("salary of B" + sal1)
  }
}

object mymain{
  def main(args: Array[String]): Unit = {
    new programmer
    var x = new C
    x.show()
  }
}



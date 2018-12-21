package example

//function within a function is an higher order function
object higherorder {
  def main(args: Array[String]): Unit = {

    def myfun(x : Int => String,y : Int) = x(y) //higher order function

    val x = 1 to 10
    val y = x.map(_+2)
    println(y)

    println((1 to 10).filter(_ % 2 == 0)) //lambda expression

    genRange(1,4,halver)

    println(transfermoney(10000,providerA))
    println(transfermoney(2000,m => m / 10)) //m => m / 10 is the anonymous/ lambda function


  }

//a function which accepts another function as argument and can return a function is a higher oder function
  def halver(a : Int):Double={
    a.toDouble / 2
  }

  def addfive(b:Int): Int = {
    b + 5
  }

  def genRange(start:Int, end:Int, f : Int => Any)={
    for(i <- start to end){
      println(f(i))
    }

  }

  //Money transfer function which is higher order function
  def transfermoney(amount: Double,providerfee: Double => Double ): Double ={
    amount + 10 + providerfee(amount)
  }
  //Provider A fee
  def providerA(amount: Double) : Double={
    amount * 0.05}



}

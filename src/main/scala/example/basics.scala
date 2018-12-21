package example

object basics{
  def main(args: Array[String]): Unit = {
    var x = -3
    val s = if(x < 0){
      "Negative"
    }
    else{
      1
    }

    println(s)

    //foreach
    val st = "Hello!"
    st.foreach(a => println(a))

    //for loop
    for(i <- 1 to 10){
      println(i)
    }

    val st1 = "My String"
    var sum = 0
    for(i <- 0 until st1.length){
      sum += i
    }
    println(sum)

    //multiple generators in for
    for(i <- 1 to 5;j <- 6 to 10){
      println(i * j)
    }

    //conditional multiple generator
    for(i<-1 to 5;j <- 1 to 5;if i==j){
      println(i + j)
    }

    for(i<- 1 to 5;j <- x to 5; x = 4*i -4){
      println(10 * i + j)
    }

    val dummy = for(i <- 1 to 5) yield i * 0.5
    println(dummy)

    var x1 = 5
    while (x1 > 0){
      println(x1)
      x1 -= 1
    }


    println(max(1,3))

    def factorial(n:Int):Int={
      if(n==0) 1
      else n * factorial(n-1)
    }

    println(factorial(5))

    //Procedure (This wont return anything)
    def area(a:Int){println(a*a)}

    println(area(2))



  }

  //functions
  def max(a:Int=0,b:Int=0)={
    if(a < b){b}
    else {a}
  }
}

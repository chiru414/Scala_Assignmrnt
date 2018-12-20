object factorial {
  private val num:Int = 4
  def main(args: Array[String]): Unit = {
    var fact = (1 to num).reduceLeft(_ * _)
    println("Factorial of number "+num+ " is "+fact)
  }
}

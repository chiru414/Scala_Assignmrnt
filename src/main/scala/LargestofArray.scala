//The reduceLeft method words by applying the function/operation you give it, and applying it to successive elements in the collection. The result of the first comparison is used in the second comparison, and so on. It works from left to right, beginning with the first element in the collection.
object LargestofArray {
  def main(args: Array[String]): Unit = {
    var arr = Array(2,5,8,4,9)
    println(arr.reduceLeft(_ max _))
  }
}

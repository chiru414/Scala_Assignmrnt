import scala.io.Source

object Reverse {
  def main(args: Array[String]): Unit = {
    val file = "tmp.txt"
    val lines = Source.fromFile(file).getLines().toList
    val reversed_file = lines.reverse
    reversed_file.foreach(println)
  }
}

import scala.io.Source

object ReadnPrint {
  def main(args: Array[String]): Unit = {
    println(Source.fromFile("copyTmp.txt").mkString.split(" ").filter(_.length > 3).toList.foreach(println))


  }
}

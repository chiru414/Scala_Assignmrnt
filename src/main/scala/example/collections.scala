package example

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object collections {
  def main(args: Array[String]): Unit = {
    //collections may be mutable and non-mutable. By default scala collections are immutable

    var a = Array(1,2,3)
    a.foreach(a => println(a))
    println(a(2))

    var b = new Array[Int](4) //defining an array of size 4
    println(b.length)
    b(1) = 1
    b(2) = 2
    println(b.head)

    //Array buffer
    val c = ArrayBuffer[Int]()

    c += 1
    c += (2,3,4)
    c ++= Array(5,6)
    c.foreach(x => println(x))

    //Lists
    val list = 1 :: 2 :: 3 :: Nil
    println(list)
    val list1 = List(1,2,3)
    println(list1)

    val x = List(1,2.0,33D,4000L)
    println(x)
    val y = List.range(1,5)
    println(y)
    val z = List.fill(4)("chiru")
    println(z)
    val u = List.tabulate(5)(n => n * n)
    println(u)
    val v = new ListBuffer[String]()
    v += "chiru"
    v += ("ram","robert","rahim")
    v -= "chiru"
    println(v)

    var w = List(3)
    w = 1 :: 2 :: w
    w = -1 :: w
    println(w)

    val x1 = List(1,3,5,7,8)
    val x2 = x1.filter(_ < 4) // x1 is a immutable list , hence we cannot delete the elements but we can filter them out
    println(x2)

    println(w ++ x2); println(w ::: x2); println(List.concat(w,x2))//merge two lists, three diff process

    //Tuples
    val x3 = (1,4,"xyz","abc")
    println(x3._4)

    x3.productIterator.foreach(args => println("value =" + args))

    //sets
    var s = Set(1,2,3,3)
    var s1 = Set(1,2,8,9)
    println(s)
    println(s.&(s1)) // intersection

    //Maps
    val mapping = Map("emp" -> "chiru","id" -> 43)
    println(mapping("emp"))
    mapping.keys.foreach(i => println(i+" "+mapping(i)))





  }
}

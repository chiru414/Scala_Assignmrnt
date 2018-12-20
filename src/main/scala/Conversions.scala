class Conversions {
  def inchestoFeet(inch:Double):Double={
    return inch / 12
  }
  def milestoKMs(mile:Double):Double={
    return mile * 1.609
  }
  def poundstoKilos(pound:Double):Double={
    return pound / 2.205
  }
}

object main2{
  def main(args: Array[String]): Unit = {
    val conv = new Conversions
    println(f"33.4 inches = ${conv.inchestoFeet(33.4)}%1.2f feet")
    println(f"21 miles = ${conv.milestoKMs(21)}%1.2f KMs")
    println(f"221 pounds = ${conv.poundstoKilos(221)}%1.2f Kg")
  }
}

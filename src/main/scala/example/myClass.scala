package example

class myClass(val x:Int,val y:Int) { // Primary constructor
  private var a = 0
  private var age = 0
  def inc()={a+=1}
  def curr()={a}

  def getA = a // getter
  def setA(n: Int) = {if(n > a){a = n}} // setter

  def add()={print(x + y)}
  def this(){this(0,0)} //auxiliary constructor


}

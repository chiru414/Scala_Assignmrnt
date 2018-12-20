class BankAccount (initBal: Double) {
  private var balance = initBal
  def deposit(amount: Double) = {
    balance += amount;  balance }
  def withdraw(amount: Double) = {
    balance -= amount;  balance }
}
class CheckingAccount(initBal: Double) extends BankAccount(initBal) {
  private val fee:Double = 1
  private var balance:Double = initBal
  override def deposit(amount: Double): Double = {
    balance = balance + amount - fee;balance
  }

  override def withdraw(amount: Double): Double = {
    if(balance > 0){
    balance = balance - amount - fee;balance}
    else{
    println("Insufficient funds");balance}
  }

  def getBalance():Double={
    return balance
  }
}

object main3{
  def main(args: Array[String]): Unit = {
    val acct = new CheckingAccount(100)
    println("Opening balance: USD "+acct.getBalance())
    println(acct.deposit(34.56))
    println(acct.withdraw(13.45))
    println("Closing balance: USD "+acct.getBalance())
  }
}

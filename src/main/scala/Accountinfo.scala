class Accountinfo {
  private var balance:Double = 0
  def deposit(amount: Double)={
    balance += amount
    println("An amount of USD "+amount+" has been deposited successfully. Your current balance is USD "+balance)
  }
  def withdraw(amount:Double)={
    if(balance <= 0) {
      println("Insufficient funds")
    }
    else{
      balance -= amount
      println("An amount of USD "+amount+" has been withdrawn successfully. Your current balance is USD "+balance)
    }
  }
  def getBalance():Double={
    return balance
  }
}

object main1{
  def main(args: Array[String]): Unit = {
    val acct = new Accountinfo
    println("Opening balance : USD "+acct.getBalance())
    acct.withdraw(23)
    acct.deposit(100)
    acct.withdraw(13.24)
    println("Closing balance : USD "+acct.getBalance())
  }
}

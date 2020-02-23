package day40;

public class BankAccount {

    String accountType;
    String accountHolder ;
    long accountNum ;
   public double balance ;

    //setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber,double newBalance){
        accountType = newAccountType;
        accountHolder=newAccountHolder;
        accountNum = newAccountNumber;
        balance=newBalance;

    }

    //showAccountBalance
  public    void showAccountBalance(){
        System.out.println("current balance = " +balance);
    }
    //showAccountHolderAccountType
    public void showAccountHolderAccountType(){
        System.out.println("accountType = " + accountType + "accountHolder = " +accountHolder);
    }

    // get balance return the balance
    public double getBalance(){
        // after doing a lot validation to make sure you have correct credential to view the balance
        return balance;
    }
    //deposit(amount)

    public void deposit (double amount){
        balance = balance + amount ;
    }
    //withdraw(amount)

    public void withdraw(double amount){
        balance -= amount ; // decreasing
    }
    //withdraw100$cash()
    public void withDraw100$Cash(){
        withdraw(100); //reusing the functionality we already have
    } // or balance = balance -100

    //purchaseProdcut(ProductPrice, count)
    public void purchaseProdcut(double productPrice, int count){
        double totalPrice = productPrice*count ;
        balance -=totalPrice;
        // or with withdraw(totalPrice);
    }


    //toString

        // in here generate the method it always the same.
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}

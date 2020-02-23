package day46;

public class BankAccount {

    // attributes for bankaccount class (super class )

    String accountHolder ;
    long accountNum ;
    double balance ;

    // always do no arg constructor in super class
    //// to avoid error in sub class because of super() call
    public BankAccount(){

    }

    public BankAccount(String accountHolder, long accountNum, double balance) {
        //super();
        // first line of constructor is super unless you saw otherwise
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit (int amount){
        balance += amount ;

    }
    public void withDraw (int amount){
        balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}

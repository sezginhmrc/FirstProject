package day46;

public class SavingAccount extends BankAccount {

    //    String accountHolder ;
    //    long accountNum ;
    //    double balance ;
    double interestRate ;
    // i have 4 fields


    public SavingAccount (String accountHolder, long accountNum, double balance, double interestRate){
        super(accountHolder,accountNum,balance);
        this.interestRate = interestRate ;
    }
    // in our savingaccount , if we withdraw amount you withdraw
    // you get 30 $ penalty
    // so we will overRide the withDraw method to reflect this requirement

    // this is real life senario real life requirement
    // i overrided the methods to USE DIFFERENT IMPLEMANTATION !
    @Override
    public void withDraw (int amount){
       super.withDraw(amount);
       // I used the super keyword here and get the method from super class
        // this is code reusablility2
     balance -= (amount+30);
      //  balance = balance - amount - 30 ;
    }

    // in my saving account
    // if i deposit 100 my interest rate is 4,2/100 then your actual balance will increase withh added interest

    @Override
    public void deposit (int amount){
        super.deposit(amount);
        if(amount==100){
            interestRate = 0.42 ;
            balance += (amount + (100 * 0.042));
        }
    }


    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }


    // to bad idea to have main here. this is my template(recipe) , cook in the kitcehn
    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount("Sezgin",12345678,804.5,0.99);
        System.out.println("s1.toString() = " + s1.toString());

        s1.withDraw(100);
        System.out.println("s1 = " + s1);

        SavingAccount s2 = new SavingAccount("Cristin",123456789,1000,2.4);
        System.out.println("\ns2 = " + s2);
        s2.deposit(100);
        System.out.println("s2 = " + s2);


    }


}

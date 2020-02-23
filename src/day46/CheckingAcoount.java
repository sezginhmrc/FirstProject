package day46;

public class CheckingAcoount extends BankAccount{

    // no additional field in ckecking account




    public CheckingAcoount(String accountHolder, long accountNum, double balance) {
        //  super to have parent class constructor !
        super(accountHolder, accountNum, balance);
    }

    // this is override ;
    // if you deposit 3000$ will give you 200$ ;
    public void deposit (int amount){
        if(amount>=3000){
            super.deposit(amount+200);
        } else {
            super.deposit(amount);
        }
    }
   public void withDraw ( int amount){
        if(amount>=1000){
            balance = balance -  amount - 200 ;
        } else {
            balance = balance - amount ;
        }
   }


    @Override
    public String toString() {
        return "CheckingAcoount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {

        CheckingAcoount c1 = new CheckingAcoount("Sezo",1235667,1000);
        c1.deposit(3000);
        System.out.println("c1.toString() = " + c1.toString());

        BankAccount b1 = new BankAccount("rana",123125,1000);
        b1.deposit(3000); // not overridden reference object belong to  Bank account class
        System.out.println("b1 = " + b1.toString());


        BankAccount c2 = new CheckingAcoount("RAna",123125,2000);
        c2.deposit(3000); // overridden reference object belong inherit class
        System.out.println("c2.toString() = " + c2.toString());
        c2.withDraw(1000); //overridden
        System.out.println("c2 = " + c2);

        CheckingAcoount c3 = new CheckingAcoount("Ozzy",1234567789,1000);
        c3.deposit(300);
        System.out.println(c3);

    }

}

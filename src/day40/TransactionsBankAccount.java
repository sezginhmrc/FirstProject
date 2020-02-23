package day40;

public class TransactionsBankAccount {
    public static void main(String[] args) {
        //String accountType;
        //    String accountHolder ;
        //    long accountNum ;
        //    double balance ;
        BankAccount user1 = new BankAccount();
        user1.setAllTheValue("Savings","Sezgin",41384700,100000);

        user1.showAccountBalance();
        user1.showAccountHolderAccountType();
        user1.deposit(3000);
        System.out.println("user1 balance = " +user1);
        user1.withDraw100$Cash();
        System.out.println("user1 = " + user1);
        user1.withdraw(12000);
        System.out.println("user1 = " + user1);
        user1.purchaseProdcut(1200,3);
        System.out.println("user1 = " + user1);


    }
}

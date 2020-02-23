package day52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountAction {

    public static void main(String[] args) {

        Account a1 = new Account("Sezgin",10000);
        a1.deposit(5000);
        System.out.println(a1);
        a1.withdraw(5000);
        System.out.println(a1);

        Account a2 = new Account("Ozlem",10000);
        System.out.println(a2);

        Account a3 = new Account("Hannah",2000);

        a1.transferAll(a2);
        System.out.println("a1 after transfer = " +a1);
        System.out.println("a2 after transfer = " +a2);

        a2.transferAll(a1);
        System.out.println(a2);
        System.out.println(a1);

        System.out.println("Does a3 has polindrome name : " +a3.isPolindrome());
        System.out.println("Does a2 has polondrome name : " + a2.isPolindrome());

        List<Account> accountList = new ArrayList<>();
        accountList.add( new Account("John Snow",10000) );
        accountList.add( new Account( "Ece",20000) );
        accountList.add( new Account("Ata",14000));


        System.out.println("\n"+ accountList);
        Collections.sort(accountList); // type is Account we chose the data type here
        // with compareTo method implemented Comparable <t>

        System.out.println("\n" + accountList);

        // Create another account with your name ;
        // transfer everyone's money to your account;

        Account myAccount = new Account("Sezgin",0);

        for (Account each : accountList){
            each.transferAll(myAccount);
        }
        System.out.println(myAccount);
        System.out.println(accountList);
        // all accounts 0 we tranferd all monet to sezgin :)


    }
}

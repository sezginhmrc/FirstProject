package day18;

import java.util.Scanner;

public class SmartLockOpener {

    public static void main(String[] args) {

        // smart lock door has password
        //unless you enter correct paassword
        // it keep locking you out
        // assuming corrrect password is b15
        //keep asking until user enter correct one
        Scanner scan = new Scanner(System.in);

        System.out.println("KNOCK KNOCK !!");
        System.out.println("What is the password");

        String password = scan.next();

         while( ! password.equals("B15")) {
           //  while( ! password.equalsIgnoreCase("B15"))
             System.out.println("WRONG PASSWORD !! TRY AGAIN!!");
             password  = scan.next();
         }
        System.out.println("OPEN THE DOOR !! ");



    }
}

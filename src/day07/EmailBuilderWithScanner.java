package day07;

import java.util.Scanner;

public class EmailBuilderWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in) ;

        System.out.println("Enter your first name , last name , company seperated by spcae");

        String firstName ,lastName, company, email ;
        firstName = scan.next() ;      // "Banega" ;
        lastName  = scan.next() ;      //"Enver" ;
        company   = scan.next() ;       //"Verizon" ;
        // firstName_lastName@company.com Banega_Enver@Verizon.com

        email = firstName+"_"+lastName+"@"+company+".com" ;

        System.out.println("My name is " + firstName + " " + lastName + " and i work for " + company + " and My email is : " + email );
    }
}

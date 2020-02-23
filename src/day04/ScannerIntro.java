package day04;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {


        // i want to save user input after asking some question
        // and i want to save this input so i can do something with it.

        // Step 1 ; Use Scanner class to create scanner object
                    //that have this functionality


       Scanner scan = new Scanner (System.in);

        //ask user to enter name
        System.out.println("Enter your first name please");

        //capture what user typed on keybord in console
        String firstName = scan.next();
        //scan.next() is capturing single word that user entered

        //print the result of what we saved from user input
        System.out.println("You have entered : " +firstName);


        System.out.println("what is your age:");
       int age = scan.nextInt();
       System.out.println("Your age is " + age);











    }
}

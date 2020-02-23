package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {

    public static void main(String[] args) {

        Scanner saturday = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = saturday.next();
        System.out.println("You have entered " + name );


        System.out.println("What is your age ? ") ;
        int age = saturday.nextInt();
        System.out.println("You have entered age " + age );

        //string anotherWord = saturday.next();
        //Sytem.out.println("Another word is " + anotherWord) ;




    }
}

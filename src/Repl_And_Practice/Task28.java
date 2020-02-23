package Repl_And_Practice;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        //In this assignment, you need to do couple of things ;
        //Create an object of Scanner class named scanner.
        //Create int variable named day.
        //Write an if statement that will print day of the week based on value of the day variable.

        Scanner scanner = new Scanner(System.in);
       // System.out.println("What is the day of the week ?");
        int day = scanner.nextInt();


        if (day==1) {
            System.out.println("It's a Monday");
        } else if (day==2){
            System.out.println("It's a Tuesday");
        } else if (day==3){
            System.out.println("It's a Wednesday");
        } else if (day==4){
            System.out.println("It's a Thursday");
        } else if (day==5){
            System.out.println("It's a Friday");
        } else if (day==6){
            System.out.println("It's a Saturday");
        } else if (day==7){
            System.out.println("It's a Sundy");
        } else {
            System.out.println("There is no such a day");
        }













    }

}

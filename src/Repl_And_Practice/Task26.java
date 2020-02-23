package Repl_And_Practice;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {

        //in this assignment you are given an int num.
        //you need to check if num is positive negative or equals to zero.
        //use 3 if statements to do this .
        //output if num is positive negative or zero

        Scanner s = new Scanner(System.in);
        System.out.println("What is your number ?");
        int num = s.nextInt();


        if(num>0){
            System.out.println(num + " is POSITIVE"); //don't print num because statement does not mentoin it
        } else if (num<0){
            System.out.println(num + " is NEGATIVE");
        } else if (num==0){
            System.out.println(num + " is ZERO");
        }



    }
}

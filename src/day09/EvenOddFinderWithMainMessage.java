package day09;

public class EvenOddFinderWithMainMessage {
    public static void main(String[] args) {
        /* Task 1
        Create a class called EvenOddFinder with main method


                Write a program to find out a number is even or odd
                Create a int variable called myNumber and assign a value
                divide by 2
        If the number is even then says  this is a even number
        If the number is odd then says  this is a odd number
         */

        int myNumber = 300 ;

        System.out.println( myNumber / 2 );

        System.out.println( myNumber % 2 );

        int remainder = myNumber%2 ;

        if ( myNumber%2==0) {
        //if (remainder == 0) {
            System.out.print(" THIS IS A EVEN NUMBER");
        } else
            System.out.println("THIS IS A ODD NUMBER");


    }
}

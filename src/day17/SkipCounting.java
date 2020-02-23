package day17;

public class SkipCounting {
    public static void main(String[] args) {

        // int counter = 0 ;
        //   while (counter<30){
        // counter = counter + 3 ;

        //   counter +=3 ;
        // System.out.print(counter + " ");

    //}
        // write a program to print out a even number from 0 to 50 ;
        // write a program to print out a odd number from 0 to 50 ;

        int number = 0 ;
        while (number<50) {
            number += 2;   // it means nunmber = number + 2
                            // if you put this number after printing number 0 will be including
                            // debug shows everything obviously !!
            System.out.print(number + " ");

        }
        System.out.println();
        int oddNumber = 0 ; //  if i wanna include '0' for odd number we put after printing
        while (oddNumber<50){
            System.out.print(oddNumber + " ");
            oddNumber += 3 ;

        }



    }
}

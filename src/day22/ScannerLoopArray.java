package day22;

import java.util.Scanner;

public class ScannerLoopArray {
    public static void main(String[] args) {


        // if i wanna capture the input from user
        // numbers will be ask with scanner

        Scanner scan = new Scanner (System.in);

        int[] numbers = new int[10] ;

        for (int i = 0; i < numbers.length ; i++) {

            System.out.println("Enter your number " + i );
            numbers[i] =scan.nextInt();


        }
        // printing out what's inside the array
        for (int x = 0 ; x < numbers.length ; x++ ) {
            System.out.print(numbers[x] + " ");
        }

    }
}

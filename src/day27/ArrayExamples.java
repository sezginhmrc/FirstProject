package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples {

    public static void main(String[] args) {

        double[] prices = new double[]{1.99, 2.00, 1.99, 3.45, 2.45, 6.89, 3.55};
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i]+" ");

        }
        System.out.println();
        int num = 10 ;
        int [] arr = {10,20,30,40,50} ;
        int num1 = arr[arr.length-1];

        System.out.println(num1);
        System.out.println();

        for (int i = 0; i <arr.length ; i ++ ) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("\n=====");
        String str = Arrays.toString(arr);
        System.out.println(str);
        // or
        System.out.println(Arrays.toString(arr));
        // we need Arrays.toString method in order to print Array !!

        // Task01 write a program that ask user to enter a number 5 times , store those numbers into array

        int [] numbers = new int [5] ;
        System.out.println(Arrays.toString(numbers)); // if you dont assign in array it turns 0 in int !

        System.out.println("\n======");

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <numbers.length ; i++) {
        System.out.println("Enter a number");
         int input =  scan.nextInt();
         numbers[i] = input ; // because we did not assign the value we want user to assign value with Scanner

        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n========");

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int largestNumber = numbers[numbers.length-1];
        int minNumber = numbers[0];
        System.out.println("Largest number is = " + largestNumber);
        System.out.println("minNumber = " + minNumber);




    }
}
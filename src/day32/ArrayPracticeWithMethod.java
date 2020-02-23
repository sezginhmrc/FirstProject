package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void printArrayItems(int[]nums){

        System.out.println("Arrays has itmes: " + Arrays.toString(nums));
    }

    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array

    public static void printMaxOfIntArray(int [] numbers){
        int max = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(max<numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("max = " +max);

    }

    //// printMinOfIntArray
    //// this method has one int array as parameter
    //// and it will print the min number inside the array


    public static void printMinOfIntArray(int[]numbers){
        int min = numbers[0];
        for (int i = 0; i <numbers.length; i++) {
            if(min>numbers[i]){
                min = numbers[i];
            }

        }
        System.out.println("min = " +min);
    }
    // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers

    public static void printSumOfIntArray(int[]numbers){
        int sum = 0 ;
        for (int i = 0; i <numbers.length ; i++) {
            sum = sum + numbers[i];

        }
        System.out.println("Sum = " +sum);
    }

    //// OPTIONALLY
    //// checkScoresAllMoreThan60
    //// this method has one int array as parameter
    //// and it will check whether each and every numbers are more than 60
    //// if so print everyone passed
    //// if not print someone has failed


        // compare wtih 2 array size

    public static void compare2arraySize(String[] arr1, String []arr2){
        if (arr1.length>arr2.length){
            System.out.println("array 1 has more item");
        } else if (arr2.length>arr1.length){
            System.out.println("array 2 has more item");
        } else {
            System.out.println("They have same item count!");
        }


    }

    public static void main(String[] args) {
        printArrayItems(new int []{1,2,3,4,5});
        printMaxOfIntArray(new int []{10,50,60,70,100});
        printMinOfIntArray(new int [] {200,300,400,100,350});
        printSumOfIntArray(new int []{50,150,700,100});
        //checkScoresAllMoreThan60(new int []{12,33,44,55,11,23,});
        compare2arraySize(   new String[]   {"Sezgin"},  new String[]{"Poyraz"} );

    }
}

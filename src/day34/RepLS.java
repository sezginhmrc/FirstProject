package day34;

import java.util.Scanner;

public class RepLS {

// Create a method called next3 .
// This method gets an int argument and prints the next 3 numbers after that number.
// Call the method from main method and pass num to it.

    public static void next3(int n) {
        System.out.println((n + 1) + " " + (n + 2) + " " + (n + 3));
    }

    //// printStringWithDashInBetween
    //    // it has one String parameter called name
    //    // it will do following in method body
    //    // print each and every character of a String with dash in between
    //    // excluding the last one Akbar -->> A-k-b-a-r
    //    // logic : keep concatenating - after each character
    //    // when it comes to last character don't add it
    public static void printStringWithDash(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i != name.length() - 1){
                System.out.print("-");
            }
        }
        System.out.println();
    }
        // print Z to A
        // psecodoku is i want looping from a to z in order to print all letters from a to z
        // this method has no parameter at all
        // and i want you to print it without vowel letter
    public static void aToz(){
        for ( char icahar = 'Z' ; icahar>='A'; icahar--){
            System.out.print(icahar+" ");
        }
        System.out.println();
    }
    // printMaxOfIntArray
    // this method has one int array as parameter
    // and it will print the max number inside the array
    public static void printMaxOfIntArray (int[] numbers){
        int max = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
    }
   // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers
    public static void printSumOfIntArray (int[] nums){
        int sum = 0 ;
        for (int i = 0; i <nums.length ; i++) {
            sum= sum + nums[i];

        }
        System.out.println("sum = " + sum);
    }
    //* build_GOT_Email
    //     * This method should build email using user's first and last name
    //     * for example Jon Snow --->> JSnow@NightWatch.com
    //     * firstName user's first name
    //     * lastName  user's last name
    //     * @return the email created using
    //     * firstName initial+lastname+@NightWatch.com
    public static String buildEmail (String first , String last){
        return first.charAt(0)+last+"@NightWath.com";
    }
    public static  double divide (double num1 , double num2){
        return num1*num2 ;
    }
    //Create a class called ReturnKeywordPractice with main
    //calculateAndReturnAge
    //Write a method accept a birth year and return the age :
    //the birth year should be within the range of 1900-2020
    //if not return 0
    public static int returnKeywordPractice (int birthYear){
        if(birthYear<=1900 && birthYear>=2020){
            return 0 ;
        } else{
            return 2020-birthYear;
        }

    }
    public static void main(String[] args) {
       /* Scanner inp = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num = inp.nextInt();
        next3(num);*/
       printStringWithDash("OZLEM");
       aToz();
       printMaxOfIntArray(new int[] {1,2,3,4,5,6,7,8,9,10});
       printSumOfIntArray(new int[] {10,30,10,10,40});
        System.out.println(buildEmail("sezgin","hamurcu"));
        System.out.println(returnKeywordPractice(1994));

    }
}

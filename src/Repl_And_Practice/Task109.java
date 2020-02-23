package Repl_And_Practice;

import java.util.Scanner;

public class Task109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] arr = new String [5];
        for (int i = 0; i <5 ; i++){
            arr[0] = "apple";
            arr[1] = "kiwi";
            arr[2] = "banana" ;
            arr[3] = "watermelon";
            arr[4] = "hazelnut";

            String first3Chars = arr[0].substring(0,3);
            System.out.println(first3Chars);
            String first3Chars1 = arr[1].substring(0,3);
            System.out.println(first3Chars1);
            String first3Chars2 = arr[2].substring(0,3);
            System.out.println(first3Chars2);
            String first3Chars3 = arr[3].substring(0,3);
            System.out.println(first3Chars3);
            String first3Chars4 = arr[4].substring(0,3);
            System.out.println(first3Chars4);

        }




        }






    }


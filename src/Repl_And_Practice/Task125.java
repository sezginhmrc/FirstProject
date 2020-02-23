package Repl_And_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Task125 {
    public static void main(String[] args) {

        //Write a program that will print the shortest word in the given array str.

      /*  String [] str = {"OZLEM","SEZGIN","EDI","BU","GIRAL","Yok"} ;
        String shortest = str[0];
       int length = str[0].length();
        for (int i = 0; i<str.length; i++) {
            if(lenght>str[i].length()){
                lenght = str[i].length();
                shortest =  str[i] ;
        }
      }
        System.out.println(shortest);*/

       //Write a program that will find out shortest words in the given string str.
        // If there are few words that are evenly short, print them all.
        // Use split method in order to split str string variable and create an array of strings.
        // Print array with Arrays.toString() method. Sort array before printing.
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray" ;

        String[] myArray = str.split(",");
        int shortestWord = myArray[0].length();
        String shortestWord1 = myArray[0];
        int countOfShortest = 0;
        String printShortest = myArray[0];
       // System.out.println(myArray[0]);
        for (int i = 0; i <myArray.length ; i++) {
            if(shortestWord >= myArray[i].length() ){
                shortestWord = myArray[i].length();
                countOfShortest ++ ;
                shortestWord1 = myArray[i];
                printShortest = printShortest + myArray[i];


               }
            }
        System.out.println(printShortest);
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        }




    }


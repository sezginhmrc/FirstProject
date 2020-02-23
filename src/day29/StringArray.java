package day29;

import java.util.Arrays;

public class StringArray {

    public static void main(String[] args) {


       // Create an array with size 300 and fill it up with I Love Java
        // this was my logic !

   //     int [] size = new int[300];

     //   String sentence = "I LOVE JAVA";

    //    for (int i = 0; i <size.length ; i++) {
      //      System.out.println((i + 1) + " " + sentence);

   //     }

        // teacher's logic

        String [] strArr = new String[300];
        System.out.println(Arrays.toString(strArr));

        for (int i = 0; i<strArr.length ; i++) {
            strArr[i] = i + ".I LOVE JAVA" ;

        }
        System.out.println(Arrays.toString(strArr));



        String str = new String("ABC") ;
        String [] strArr2 = new String [5];


    }
}

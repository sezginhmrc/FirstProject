package day34;

import day32.StringActionHomework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {



        String sentence = "I LOVE JAVA" ;
        String [] eachWords = sentence.split(" ");
        System.out.println(eachWords[0]);
        System.out.println(Arrays.toString(eachWords));

        int [] resultArr = returnBoysVsGirlsResult();
         System.out.println(Arrays.toString(resultArr));

        System.out.println(Arrays.toString(familyNames()));
        System.out.println(Arrays.toString(returnBoysVsGirlsResult()));

    }

    public  static String [] familyNames (){
        String [] families = {"Hamurcu","Boluk"};
        return families ;
    }

    public static int []  returnBoysVsGirlsResult (){
        int  [] BoysGirlsCount = {56,54};
        return BoysGirlsCount ;

        


    }
}

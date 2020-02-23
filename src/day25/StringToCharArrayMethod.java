package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {

        // pick up your own name and turn in into char array and
        // use for each loop to loop over them
        // optionally count how many a you have in your name

        String name = "Sezgin";
        // What Does it DO ??
        // turn this into CharArray using toCharAray() method of String
        // DO I need to provide extra data while calling the Method ?
        // No
        //What Do I get out of it
        // char array object that has all the characters of the String object

        char[] allCharsName = name.toCharArray();

        for (char s : allCharsName) {

            System.out.println(s);
        }
        // now count how many e we have
        int count = 0 ;
        for (char eachChar : allCharsName){
            if(eachChar=='e'){
                ++ count ;
            }
        }
        System.out.println("count of name is " +count);
        // What if you want to sort all characters of your name
        // in alpahabetical order ?

        Arrays.sort(allCharsName);
        System.out.println("all char name is " + Arrays.toString(allCharsName));



    }
}
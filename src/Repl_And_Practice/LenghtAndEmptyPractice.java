package Repl_And_Practice;

import java.util.Scanner;

public class LenghtAndEmptyPractice {

    public static void main(String[] args) {
        //String methods :
        //length()
        //equals()
        //equalsIgnoreCase()
        //toUpperCase()
        //toLowerCase()
        //contains()
        //startsWith()
        //endsWith()
        //indexOf()
        //lastIndexOf()
        //isEmpty() //isBlank()
        //trim()
        //replace()
        //substring()


        //Task 1:
        //Given a String with any possible length including 0
        //print first 2 characters only if the String has more than 1 character
        //if the String is empty print Empty String
        //else print the first char twice in same Link
        //    for example :
        //        "abcde" --> ab
        //        ""        --> empty String
        //        "J"       --> JJ

        String name = "ozlem";
        int lenghtOfName = name.length();

        System.out.println("lenghtOfName = " + lenghtOfName);

        if(name.length()>1){
            System.out.println("Oz");
        } else if (name.isEmpty()) {
            System.out.println("EMPTY STRING !");
        } else {
            System.out.println("OO");
        }

        name = name.toUpperCase();
        System.out.println(name);





    }
}

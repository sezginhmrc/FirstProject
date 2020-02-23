package Repl_And_Practice;

import java.util.Scanner;

public class Task93 {

    public static void main(String[] args) {

        //Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
        // such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
     //   Scanner scan = new Scanner(System.in);
       // String word = scan.next();
        String word = "sjavasss";

        if(word.substring(0,4).equals("java")){
            System.out.println("true");
        } else if (word.length()>=5 && (word.substring(1,5).equals("java"))){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}

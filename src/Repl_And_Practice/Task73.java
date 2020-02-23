package Repl_And_Practice;

import java.util.Scanner;

public class Task73 {
    public static void main(String[] args) {
        //You have a word, do the following
        //If the word has odd number of characters
        //and has 5 or more characters, print the middle three
        //characters of the word.
        //Otherwise print "invalid"



        //            01234
          String word = "Sezenrana" ;

          int halfIndex = word.length()/2 ;
       //   int halfIndexPlus1 = n.length()/2+1;
       //   int halfIndexMini1 = n.length()/2-1;

        if(word.length()%2==1 && word.length()>5){
            System.out.println(word.substring(halfIndex-1,halfIndex+2));
        } else {
            System.out.println("INVALID");
        }


        System.out.println("=========");

        String name = "Sezen";
        // i wanna print z
        int z = name.length()/2;
        System.out.println(word.substring(z,z+1));

        String n = "Osmanoglu Ali Bey";
        // i wanna print "Ali"
     //   System.out.println(n.substring(n.indexOf(" "),n.lastIndexOf(" ")));
            int count = 0 ;
        for (int i = 0; i <n.length()-3 ; i++) {
            String each3Char = n.substring(i,i+3);
            if (each3Char.equalsIgnoreCase("Ali")){
               count++ ;
            }

        }
        System.out.println("count of Ali = " + count);





    }
}

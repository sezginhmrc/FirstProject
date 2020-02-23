package Repl_And_Practice;

public class Task89_93 {

    public static void main(String[] args) {

        //Write a program that will print out first and last letters together.
        String word = "adobe" ; // -> ae
        String fistletter = word.substring(0,1);
        String lastletter = word.substring(word.length()-1);
        System.out.println(fistletter+lastletter);

        }
    }


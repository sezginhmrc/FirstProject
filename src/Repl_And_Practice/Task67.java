package Repl_And_Practice;

import java.util.Scanner;

public class Task67 {
    public static void main(String[] args) {

        //Write a program that will reverse a string.
        // Your program should reverse a string only 5 characters long//.
        // If word is shorter, display message: "Too short!".
        // If word is longer, display message: "Too long!". Otherwise,
        // reverse this word and print out result into the console.


        //Example:                        //Example:
        //input: cat                        //input: singularity
        //output: Too short!                //output: Too long!

        //Example:
        //input: apple
        //output: elppa

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int characterCount = word.length();
        int lastCharacterIndex = characterCount - 1 ;
        char lastChartIndex = word.charAt(lastCharacterIndex);

        int CharacterCountOfWord = word.length();

        if (CharacterCountOfWord==5){
            System.out.println("" +word.charAt(4) + "" + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + "" + word.charAt(0));
        } else if (CharacterCountOfWord<5) {
            System.out.println("Too short!");
        } else  {
            System.out.println("Too long!");
        }





    }
}

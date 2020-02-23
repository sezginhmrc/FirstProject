package Repl_And_Practice;

import java.util.Scanner;

public class HackerBank {
    public static void main(String[] args) {

     //   Scanner sc = new Scanner(System.in);
    //    System.out.println("TYPE A STRING AND INT?");
        System.out.println("================================");
        String s1 = "Java";
        int x = 500 ;
        for (int i = 0; i < 3; i++) {


            //Complete this line

        }
        System.out.println("================================");
        
        String id = "FB-457";
        // interview question above string
        // how to get number out of String ??
        int idNum = Integer.parseInt(id.split("-")[1]);
        System.out.println("idNum = " + idNum);

        System.out.println("CHARACTER METHOD");

        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetter('-'));
        System.out.println(Character.isDigit('s'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isWhitespace('2'));
        System.out.println(Character.isWhitespace(9));
        System.out.println(Character.isUpperCase('s'));

    }
}



package Repl_And_Practice;

import java.util.Scanner;

public class NameLengthCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name Please");
        String name = scan.next();
        int lengthOfName = name.length();
        System.out.println("lengthOfName = " + lengthOfName);

        if (name.length()<4 ){
            System.out.println("Short Name");
        } else if (name.length()>=4 && name.length()<=12){
            System.out.println("Medium Name");
        } else if (name.length()>12){
            System.out.println("LONGER NAME");
        } else {
            System.out.println("INVALID NAME");
        }



    }
}

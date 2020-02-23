package day15;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name please !");
        String name = scan.next();
        int lenthOfThename = name.length();
        System.out.println("length of the name= " + lenthOfThename );


        if (name.length() < 4) {
            System.out.println("Short Name");
        } else if (name.length() >= 4 && name.length() <= 11) {
            System.out.println("medium Name");
        } else if (name.length() > 11) {
            System.out.println("longer name");
        } else {
            System.out.println("INVALID NAME");
        }


        if (name.contains("a") || name.contains("e")) {
            System.out.println("name is contatin a or e");
        } else {
            System.out.println("I dont have both in my name");

        }

    }
}

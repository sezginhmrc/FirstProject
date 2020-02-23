package day17;

import java.util.Scanner;

public class WakeUpTask {
    public static void main(String[] args) {

        // task 1
        // get the first character and make it Uppercase
        // get the rest of the characters make it lowercase
        String name = "sezgin";

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter your name Please");
        // String name2 = scan.next();

        // System.out.println("name2 first letter uppercase and rest lowercase is = "
            //    + name2.substring(0,1).toUpperCase()+ name2.substring(1).toLowerCase());

        String nameFixed = (name.charAt(0)+"").toUpperCase();
                nameFixed = nameFixed + name.substring(1).toLowerCase();

        System.out.println("nameFixed= " + nameFixed);




    }
}
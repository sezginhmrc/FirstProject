package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("What is your current speed, Dear Driver :");

        int currentSpeed = scan.nextInt();

        System.out.println("What is the speed limit ? ");

        int speedLimit = scan.nextInt();

        if (currentSpeed >= speedLimit )  {
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");

        } // there is no else, program just move on

        System.out.println("THE END OF THE STORY !! MOVE ON !! ");



    }
}

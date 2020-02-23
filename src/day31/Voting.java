package day31;

import java.util.Scanner;

public class Voting {

    //your age more than 18 your eligible for vote
    // les than 18 no eligible

    public static void voting (int age){
        if(age>18){
            System.out.println("Go To Voting");
        } else {
            System.out.println("GO HOMEE");
        }
    }

    public static void speeding (boolean isSpeeding){
        if(isSpeeding==true){
            System.out.println("GO TO COURT");
        } else {
            System.out.println("You good to go man ");
        }
    }

    public static void main(String[] args) {

        voting(15);
        voting(22);
        voting(23);

        int age =12;
        voting(age);

        speeding(true);


        // Scanner input = new Scanner(System.in);
        //  System.out.println("Please enter your age");
        //  voting(input.nextInt());
        //  System.out.println("ARE YOU SPEEDING?");
        //  speeding(input.nextBoolean());
    }


}

package day08;

import java.util.Scanner;

public class WarmpUpTask {

    public static void main(String[] args) {

        Scanner blaBla = new Scanner (System.in);
        System.out.println("What is the your Age ?");
        int VotingAge = blaBla.nextInt();

        System.out.println( VotingAge >= 18);

        if (VotingAge >= 18 ) {
            System.out.println("You are ready to vote !!!");
        } else {
            System.out.println("try next time ");
        }
            System.out.println("THE END");

    }
}

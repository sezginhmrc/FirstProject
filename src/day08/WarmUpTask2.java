package day08;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {

        // if user guessed right 300 then print bingo
        // if not 300 print try again later

        Scanner guess = new Scanner(System.in);

        System.out.println("Could you guess my favorite Number ?");

        int myFavoriteNumber = guess.nextInt();

        if (myFavoriteNumber == 300) {
            System.out.println("Bingo");
        } else {
            System.out.println("try again later");

        }

        int age = 18 ;
        if (age >= 8 ) {
            System.out.println("GO VOTE !!");
        } else {
            System.out.println("WAIT UNTILL YOUR ARE 18");


        }
    }
}
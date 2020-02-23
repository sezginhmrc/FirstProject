package Repl_And_Practice;

import java.util.Scanner;

public class Task87 {

    public static void main(String[] args) {


        int inhabitants = 6;

        for (int i = 0; inhabitants > 0; i++) {
            System.out.println("Day " + i + " " + "[" + inhabitants + "]");
            inhabitants = inhabitants / 2;
        }
        System.out.println("---- EXTINCT ----");
    }
    // output
    //inhabitants is 6
    //Day 0 [6]2
    //Day 1 [3]
    //Day 2 [1]
    //---- EXTINCT ----


    //inhabitants is 0
    //inhabitants is 20
    //Day 0 [20]
    //Day 1 [10]
    //Day 2 [5]
    //Day 3 [2]
    //Day 4 [1]
    //---- EXTINCT ----


}


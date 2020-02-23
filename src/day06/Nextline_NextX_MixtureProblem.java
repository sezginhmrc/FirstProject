package day06;

import java.util.Scanner;

public class Nextline_NextX_MixtureProblem {
    public static void main(String[] args) {

        Scanner blabla = new Scanner (System.in);

        System.out.println("What is your name ?");
        String name = blabla.nextLine();
        System.out.println("Your name is "+ name);

        System.out.println(" What is your age ? ");
        int age = blabla.nextInt();
        blabla.nextLine();
        System.out.println("your age is " + age );

        System.out.println("What is the address ?");
        String address = blabla.nextLine();
        System.out.println("Your address is " + address );




    }
}

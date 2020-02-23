package day06;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {

        // + - * / %
        System.out.println( 5/2 );
        System.out.println( 5.0/2 );
        System.out.println( ( 5.0/2f ));

        // 5 devided by 2 is 2 and remainder is 2
        System.out.println( 5 % 2);
        // Remainder is 9 result is 9
        System.out.println( 99 % 10 );
        //Remainder is 0 result is 0
        System.out.println( 100 % 10 );


        Scanner scan = new Scanner(System.in);



        int minutes = 245; //60*4+5
        int hours =  245/60 ; // -> 2
        int mins = 245%60 ; // -> 5

        System.out.println("the minutes " + minutes + " is " + hours + " hour and " + mins + " minutes");








    }
}

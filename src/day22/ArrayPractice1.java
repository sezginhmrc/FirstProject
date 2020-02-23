package day22;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        double [] prices = new double[5] ;
        System.out.println(prices[0]);

        prices[0] = 106.59 ;
        prices[1] = 77.34 ;
        prices[2] = 12.99 ;
        prices[3] = 750 ;
        prices[4] = 210.567 ;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        char [] name = new char[6] ;
         name [0] = 'S' ;
         name [1] = 'E' ;
         name [2] = 'Z' ;
         name [3] = 'G' ;
         name [4] = 'I' ;
         name [5] = 'N' ;
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);



        System.out.println( name ); // this only work for char array

     //   for (int i = 0; i <=5 ; i++) {
       //     System.out.println(name[i]);


            boolean[] yesNo = new boolean[3];

            System.out.println(yesNo[0]); // it turns false ! because haven't assgined !
            System.out.println(yesNo[1]);
            System.out.println(yesNo[2]);

            yesNo[0] = 10>7;
            yesNo[1] = 11==11;
            yesNo[2] = 5<15 ;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);


        }

        }





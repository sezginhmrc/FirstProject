package day24;

import java.util.Arrays;

public class ArraytoStringTask {

    public static void main(String[] args) {

        double [] prices = {10.00,20.45,25.55};

        String pricesString = Arrays.toString(prices);
        System.out.println(pricesString);

        for (int i = 0; i <pricesString.length() ; i++) {

            System.out.println("character at index " + i + " is " + pricesString.charAt(i));

        }

       // System.out.println("character at index 0 is : " + pricesString.charAt(0));
       // System.out.println("character at index 1 is : " + pricesString.charAt(1));


    }
}

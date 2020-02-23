package day05;

import java.util.Scanner;

public class TempatureConverter {
    public static void main(String[] args) {

        Scanner  scan = new Scanner (System.in);

        System.out.println("What is the temperature in F ? ");

        double fahrenheit = scan.nextDouble();
        double celsius = (5.0 / 9 ) * ( fahrenheit -32);

        System.out.println( "fahrenheit  " + fahrenheit + " is " + celsius +  " in celcius ");



    }
}

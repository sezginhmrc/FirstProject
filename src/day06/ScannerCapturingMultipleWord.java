package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {
        Scanner blabla = new Scanner (System.in);

       // System.ounet.println("What is your name ") ;
        //nextline method of Scanner is used to capture whole line

        //String name = blabla.nextLine();

       // System.out.println("You have entered " + name );



        System.out.println("What is your name");
        String name = blabla.nextLine();
        System.out.println("You have entered : "+ name ) ;


        System.out.println("Which city you live in , including state ? ");
        String cityAndState = blabla.nextLine();
        System.out.println("You have entered : " + cityAndState );


        System.out.println("What is your street address ? ");
        String streetAddress = blabla.nextLine();
        System.out.println("Your street address is : "+ streetAddress);


    }
}

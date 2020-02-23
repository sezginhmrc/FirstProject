package day08;

import java.util.Scanner;

public class ifElseStatement {
    public static void main(String[] args) {

       int speedLimit = 60 ;

       int yourCurrentSPeed = 70 ;

       // if the current speed is more than speedlimit
        // get pulled over by the police
        // given ticket by the police
        // taken away some points on your license
        // go to court

        boolean IamSpeeding = (yourCurrentSPeed>speedLimit) ;
        // inside perentheses we can only put ;
        //  BOOLEAN VALUE
        //  BOOLEAN VARIALBE
        // any expression that return boolean value

        //if (true) ;
        if (IamSpeeding) {
        }else {
            System.out.println("go to the shopping");
            System.out.println("Buy IceCream !!");
        }
            System.out.println("THE END") ;
        // if not over limit go to the shopping




    }
}

package day11;

import java.util.Scanner;

public class WarmUp1_LightonOffMine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Where Do you want to live in ?");

        String cityToLive = scan.next() ;
        String cityTolive = "" ;

        switch (cityTolive) {
            case ("wh"):
                System.out.println("You want to live in West Haven");
                break ;
            case ("Mi"):
                System.out.println("You want to live in Miami");
                break ;
            case ("ny") :
                System.out.println("You want to live in New york");
                break ;
            case ("hu") :
                System.out.println("You want to live in Houston");
                break ;
            default:
                System.out.println("You want to live out of state");

        }





    }
}

package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static void main(String[] args) {

        //what do you do in each season
        // spring -->> Hike, Easter , Navruz , Blossom
        // Summer -->> Swim , Vacation , BBQ , Holiday
        // fall   -->> Black Friday , Hiking, Harvest ,Halloween , Shopping
        // winter -->> Snowboarding , Ski , Christmast , New year
        // do it with scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey What is the season of the year ?");

        String season = scan.next();
        // byte , short ,char ,int ,string
        switch (season) {
            case "Fall":
                System.out.println(" Black Friday, Hiking, Harvest , Halloween, Shopping ");
                break;
            case "Spring":
                System.out.println("Hike, Easter, Navruz, Blossom");
                break;
            case "summer":
                System.out.println("Swim, Vacation,BBQ, Holiday");
                break;
            case "winter":
                System.out.println("Snowboarding, Ski, Christmast, New year");
                break;
            default:
                System.out.println("INVALID OPERATOR");

        }
    }
}


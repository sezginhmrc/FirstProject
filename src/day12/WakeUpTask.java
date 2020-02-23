package day12;

import java.util.Scanner;

public class WakeUpTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("How is the Weather Today ?");
        String weather = scan.next() ;



        if (weather.equals("Sunny")){
            System.out.println("SUNNY WEATHER");
        } else if (weather.equals("Rainy")){
            System.out.println("RAINY WEATHER");
        } else if (weather.equals("Cloudy")){
            System.out.println("Cloudy Weather");
        } else if (weather.equals("Snowy")){
            System.out.println("Snowy Weather");
        } else {
            System.out.println("Rain or Shine");
        }



    }
}

package day30;

import java.util.Arrays;

public class CarInventory {

    public static void main(String[] args) {

        String [] cars = new String[] {"Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"} ;


        // count how many Chevrolet is in this array
        // and how many civic you have
        // reading the requirement clearly
        // we do not deal with index any anything all we need to print count of some cars !


        // we can use contains,startWith, endWith to get same result !
        int countOfChevy = 0 ;
        int countOfCivic = 0 ;

        for(String eachCar : cars){
            if(eachCar.toLowerCase().startsWith("chevrolet")){ // we can also use the contains method !
                countOfChevy ++ ;
            }if (eachCar.toUpperCase().contains("CIVIC")){
                countOfCivic ++ ;
            }
        }
        System.out.println("count of checvy is " + countOfChevy);
        System.out.println("countOfCivic = " + countOfCivic);



        //
        //        int countOfChevy = 0 ;
        //        int countOfCivic = 0 ;
        //
        //        for (int i = 0; i <cars.length ; i++) {
        //            if(cars[i].contains("Chevrolet")){
        //                countOfChevy ++ ;
        //            } if (cars[i].contains("Civic")){
        //                countOfCivic ++ ;
        //            }
        //
        //        }
        //        System.out.println("count of chevy  = " + countOfChevy);
        //        System.out.println("countOfCivic = " + countOfCivic);
        


    }
}

package day59;

import day47.*;
import day49.Circle;
import day51.polymorphism.Animal;
import day55.Dog;

public class ClassCastException {
    public static void main(String[] args) {

    // THIS IS CLASS CAST EXCEPTION
    // CAR C1 IS ELECTRIC CAR
    // GASCAR IS NOT ELECTRIC CAR
    // IS - A REALATIOSHIP

        try{
            Car c1 = new ElectricCar();
            GasCar g1 = (GasCar) c1 ;
        } catch ( Exception i){
            System.out.println("Exception couht"+i);
        } finally {
            System.out.println("The block that always run !");
        }


        // I USED TO TRY CATCH BLOOCK AND HANDLED THE EXCEPTION
        // CLASS CAS EXCEPTION THAT HAPPENS A LOT...
    }
}

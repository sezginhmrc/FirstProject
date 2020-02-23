package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle {
// I inherited from Vehicle CLass which is in different package
 // this is my sub class
 // copied everytinhg from vehicle
    // added my own attribute here
    int mileage ;

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.mileage = 39678 ;
        System.out.println("c1.mileage = " + c1.mileage);

        // since Year was private we used setter the initilaize in different class
        c1.setYear(2016);
        System.out.println("c1.getYear() = " + c1.getYear());

        c1.make = "Tesla";
        System.out.println("c1.make = " + c1.make);

    }
}

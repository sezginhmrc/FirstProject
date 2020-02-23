package day47;

public class Garage {

    public static void main(String[] args) {

        // Abstract class can not be instantiated
        // it means we can not create object out of it .
     //   Car c = new Car (); Car is abstract; cannot be instantiated

        // this class is just place to run our code

        ElectricCar e1 = new ElectricCar();
        e1.brand = "Tesla";
        e1.year = 2021 ;
        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("Right");

        GasCar g1 = new GasCar();
        g1.start();
        g1.goForward();
        g1.goBackward();
        g1.turn("Left");
    }
}

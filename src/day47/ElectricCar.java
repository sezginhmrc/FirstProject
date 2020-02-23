package day47;

public class ElectricCar extends Car {

    int batteryLevel ;

    // i must override this method since i have such a method in super class
    @Override
    public void start(){
        System.out.println("This is how " +brand+ ", electric car start");
    }

    public void  goForward(){
        System.out.println(brand + " Electric car is going forward");
    }
    public void goBackward(){
        System.out.println("Electirc car is going backward");
    }
    public void turn (String direction){
        System.out.println(brand + " model car  is turning  " + direction);
    }

    public static void main(String[] args) {

        //Car c1 = new Car() ;
        ElectricCar e1 = new ElectricCar();
        e1.brand = "Toyota" ;
        e1.year = 2020 ;
        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("Left");

        System.out.println("\n");
        Car e2 = new ElectricCar() ;
        e2.brand = "Tesla";
        e2.year = 2020 ;
        e2.start();
        e2.goBackward();

    }
}

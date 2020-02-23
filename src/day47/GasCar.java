package day47;

public class GasCar extends Car {

    int gasLevel ;

    // Implements method in Car
    // implementing method means providing body for the method !
    public void start(){
        System.out.println("engine is on");
    }
    public void goForward(){
        System.out.println("moving forward");
    }
    public void goBackward(){
        System.out.println("moving backward");
    }
    public void turn (String direction){
        System.out.println("going to " + direction);
    }

    public static void main(String[] args) {

        GasCar g1 = new GasCar();
        g1.start();
        g1.goBackward();
        g1.goForward();
        g1.turn("Up");

    }


}

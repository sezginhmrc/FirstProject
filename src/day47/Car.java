package day47;

public abstract class Car {

    // i don't need to create car object using this class
    // i only want this class to be super class to provide
    // reusable fields and method for sub classes
    // this class is designed to be a super class

    int year ;
    String brand ;

    // abstract class can have abstract method
    // it has abstract key word
    // and it does not have BODY
    // it has semi colon ;

    public abstract void start();

    public abstract void  goForward();

    public abstract void goBackward();

    public abstract void turn(String direction);



}

package day45;

public class Apple extends Fruit {
    //this is sub class
    // if we don't have any constructor
    // we will get default constructor
    // and compiler automatically call
    // no arg constructor of super class by inserting super()
    //   public Apple(){
    //     super();
//    }
    // FIRST LINE OF ANY CONSTRUCTOR IS AUTOMATICALLY CALLING
    // SUPER() if we don't call any

    public Apple(){
        // i want to reuse the functionality
        // alre`ady written in super class constructor

        // We can us super () or super(arguments here)
        // to call super class

        // super();
        // How to call constructor with 1 argument
            super("test");

        // can we use this super call more than once
        // NOOOO !!!!
        System.out.println("Mesage from Apple Constructor");
    }
    public static void main(String[] args) {
       Apple a1 = new Apple();


    }
}

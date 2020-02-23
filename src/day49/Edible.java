package day49;



public interface Edible {
   //interface is like a constract .
   // once someone sign a contract she/he will provide all the details that she/he must do

    // in interface fields are automatically PUBLIC STATIC FINAL if not defined so
    // always named by uppercase (automatically italic)
    //  public static final boolean IS_HUMAN_FOOD = true;
    boolean IS_HUMAN_FOOD = true;
    // INTERFACE only can have constanst field !!!!!

    // if a method with no body not defined public abstarct, it automatically PUBLIC ABSTRACT
    //  public abstract void eat ();
    // INTERFACE ALWAYS PUBLIC ABSTRACT
    void eat ();
    void drink();
    // INTERFACE can have abstract methods, default methods, Static methods,
    // INTERFACE CANT HAVE CONSTRUCTOR !!!

    // this is my default method
    //  THIS METHOD doesnt have to be overridden in my sub class
    // it is not gonna give you error
    // implicitly the method os public if you dont define
    default void digest(){
        System.out.println("I IMPLEMENTING MY CODE MYSELF");
    }

}
    // INTERFACE DEFINITION
   // Interface is a source file type
  // it is a blueprint for classes
  // meant to be overridden
 // similar features with abstract class
// We can only declare static final variables(constant)
// We can only declare Abstract method , Static method , Default method !
   // We provide abstract methods in interface
   // We implementing interface to the classes using implement keyword
    // A class can implement multiple interface (opposite of Abstract) !
    // Interface must not have constructor

   // Version of Java 8 added some METHODS interface
    // Default methods and static methods ,
    // Both must have METHOD BODY
    // Both method don't need to be overidden by sub classes
    // a class can have more multiple interfaces
    // INTERFACE IS MOSTLY ABOUT ABSTRACT METHOD
    // Most Interfaces are related empty abstract methods
    // We can't create an object out of it 1
   // interface is about ABSTRACT
    // it is used loose copolying
    // it is used for total abstraction

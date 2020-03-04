package day55;

import day47.Shape;
import day47.Triangel;

public class Casting {

    public static void main(String[] args) {


        int x = 10;

        long y = x;  // UPCASTING
        // it works you put small cup object into larger cup
        // implicitly | automatically
        // it doesn't need to be casted it is implicitly (automatically happens)
        // long y = (long) x  it doesn't need to be casted like this it already happens automatically..

        //UPCASTING RULES ;
        // it happens automatically
        // We put small cup-fit object into larger cup
        // We don't need to cut it (casted)
        // if a object fits a small cup it can be fit already a larger cup .


        x = 20 ;
        byte b =  (byte) x;
        //  byte b = x ;
        // we put large cup into small cup ?
        // This time it needs to be casted Explicitly
        // DownCasting !!!
        System.out.println(b);

        // DOWCASTING RULES ;
        // it must be casted expilcitly byte b = (byte) x ;
        // it must cast much as it fits
        // We put larger- cup-fit object into smaller cup
        // We need to cut it.


        // Primitives Casting is related the RANGES.
        // Objects Casting related IS-A relationship !!!


        Object o = new Dog("CHiawa");

        // Upcasting
        // it happens automatically
        // Object is super class(larger)
        // Dog is sub class(smaller)
        // Object class is the parent class of all the classes in java by DEFAULT



        Dog d = (Dog) o ;
        // Downcasting
        // it must be explicitly
        // Dog is smaller then Object
        // it must be casted expicitly (dog) and it can be fit a dog object
        d.bark(); // only referecne type decides what accesible





        // IMPORTANT NOTE ; There is NO such a range for the objects
        // WE LOOK AT RELATIONSHIP !!!
        // WHo is super type who is subclass..
        // Super is more general
        // Concrete is more specific


        //  What is the benefit of instanceof operator ?
        //  before downcasting to check
        //  if the object belongs to the specific type:


        Dog d1 = (Dog) o;
        // THIS IS DOWNCASTING
        // Object is not barking Dog is barking
        // in order to dog bark we should refer dog as a dog
        // THATS WHY WE NEED DOWNCASTING
        // Parent Reference(object) casted to Child reference(Dog)
        // has to be expicit
        // Actual object type related action
        // Idea is using same object !! (o)
        // TWO REFERENCE SAME OBJECT !!! (o)
        // Benefit of polymorhsim
        // one action can be taken on different forms
        // d object decide what accesible
        // ONLY REFERENCE TYPE DECIDE WHAT ACCESIBLE
        // object has two different types
        // only reference type decide what accesible

       // d1.bark();//
        ((Dog)o).bark();



        Dog d2 = new Dog("Cesur");
        Object o1 = d2; // UPCASTING
        // OPTINALLY EXPLICITLY

        Object o2 = (Object) d2; // UPCASTINNG


        // Compiler only care if it is based IS-A relationship

        Object o3 = new Dog("Cesur");
        ((Dog)o3).bark();



        // Static binding ; compiler know which method being called and which method will be executed
        // Method overlading is Static binding


        // Dynamic binding ; compiler sees that reference type has such a method and runtime sees one as a dog one as cat
        // and capture method which belongs to each. This is called dynamic binding it is about overloading .
        // Method overridding







    }
}


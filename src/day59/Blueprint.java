package day59;

public class Blueprint {

    int age ;
    String name ;

    public static void main(String[] args) {

        // These objects (p1,p2) created form same class
        // They have their own copy of instance variables.
        // Each Blueprint object has its own values for the variables and stored in different memory locations.
        // These instance variables are Attributes for the object and associated with objects.
        Blueprint p1 = new Blueprint();
        p1.age = 29 ;
        p1.name = "Esma";

        Blueprint p2 = new Blueprint();
        p2.age = 30 ;
        p2.name = "Oktay";


    }
}

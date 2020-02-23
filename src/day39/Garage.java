package day39;

public class Garage {

    public static void main(String[] args) {

        // we can also add this object inside templed class
        // idea is to be obvious
        // we create here
        
        Car c1 = new Car();
        c1.year = 2021;
        c1.model = "Toyota";
        c1.make = "Prius";
        c1.color = "Gray";

        c1.goForward();
        c1.carAge();
       System.out.println("c1.model = " + c1.year);

        Car c2  = new Car ();
        c2.year = 2002 ;
        c2.model= "Honda";
        c2.make = "Civic";
        c2.color ="Silver";
        
        //  I WANT TO CHANGE THE COLOR OF HONDA to the color of TOYOTA
        c2.color= c1.color; //c2 color is = "Gray";
   //   System.out.println("c2.color = " + c2.color);


        c2.goForward();
        c2.carAge();
    }
}

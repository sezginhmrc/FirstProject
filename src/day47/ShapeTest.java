package day47;

import day44.Person;
import day52.Book;

public class ShapeTest {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10,20);
        System.out.println("before r1 = " + r1);
        r1.calculateArea();
        System.out.println("after r1 = " + r1);

        Shape s2 = new Rectangle(2,4);
        System.out.println(s2);

        Shape s3 = new Triangel(3,3);
        System.out.println(s3);



        Shape s4 = new Triangel(12,2);
        s4.name = "karecik";
        s4.calculateArea();
        System.out.println("s4.area = " + s4.area);


     //   System.out.println(s4);

        //reference type // leash = object
        System.out.println("------");

        Shape        s5 =        new Triangel(5,3);
        System.out.println("s5.area = " + s5.area);


        //   System.out.println(s5);
        if( s5 instanceof Triangel){
            Triangel t5 = (Triangel) s5 ;
            System.out.println("t5.area = " + t5.area);
            // THIS IS DOWN CASTING
            // reference type is Triangel and i can acces the super class variable
            // I can not do like below
                //   Triangel t6 = s5 ; ERROR !
            Triangel t6 = (Triangel) s5 ;
            System.out.println(t6+"DOWNCASTING");
            // COMPILE TIME
            // casted because there is a inheritance relationship
            Triangel t7 = new Triangel(10,5);
            Shape s7 = (Shape) t7 ;




        }
        // only reference type decide what is accesbile
        System.out.println(s5);
        System.out.println("s5.area = " + s5.area);
        // Downcasting s5 to type Triangle
        Triangel t5 =  (Triangel) s5 ;
        System.out.println(t5);


        System.out.println(s5);
        s5.calculateArea();
        System.out.println(s5);




    }
}

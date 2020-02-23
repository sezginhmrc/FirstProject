package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// this is in same package as Movie class
public class MovieAction {

    public static void main(String[] args) {

        Movie m1 = new Movie(); // i called the first constructor which is default values
        System.out.println("m1 = " + m1); // toString method
        // this calls first constructor in the field :)
        // which is without parameter
        m1.genre = " Drama ";
        m1.length = 2.1 ;
     //   m1. name = "Joker"; // this wont work beacuse it is private only accesible inside same class

        // these are objects and added constructor inside object
        // cons is when createad an object !!
        Movie m2 =new Movie("Joker",2.5,"Drama");
        Movie m3 = new Movie("Pursuit of Happiness", 2.3,"Drama");
        // no more empty object created :)
        // we using the constructor to create object with fill it up inside () :)

        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);

        // i want to get the name and i can do some stuff
        // (name is private in the insance field)
        // i can not access the field directly beacuse it is private
        // i need a getter method to access it
        System.out.println("m2.getName() = " + m2.getName());

        //List<Movie> yourFavoriteMovieLst = new ArrayList<>();






    }
}

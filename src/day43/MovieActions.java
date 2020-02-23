package day43;

import day42.Movie; // Movie is your data type (reference variable))
// you can do everything with it

public class MovieActions {
// this class has a lot of static method to deal with move object
// this class does not serve as template for creating object
// justl ike arrays class does not serve as template for creating array object


    public static void main(String[] args) {
        // here we can acces to package of day 42
        // and creatin an object from the movie templea
        // since it is public and accesible
        Movie m1 = new Movie("Joker", 2.4, "Drama");
        Movie m2 = new Movie("Dost", 2.0, "Drama");
        printMovieInformation(m1);
        printShortstMovieName(m1, m2);
        System.out.println(getJokerMovieObject());

    }

    public static void printMovieInformation(Movie movieObj) {
        //TODO YOUR CODE HERE
        System.out.println("The movie  nane " + movieObj.getName());
        System.out.println(" is " + movieObj.getLength() + " hour long ");
        System.out.println(" and it genre is " + movieObj.getGenre());


    }

    // i created another method
    public static void printShortstMovieName(Movie o1, Movie o2) {

        if (o1.getLength() < o2.getLength()) {
            System.out.println(o1.getName());
        } else {
            System.out.println(o2.getName());
        }
    }

    public static Movie getJokerMovieObject (){

        Movie j = new Movie("Superman",3.2,"Action");
        return j ;
        // in here Movie is a data type (reference variable)
        // j is pointer to your object (variable name )
        // rest is the actual object
    }

}




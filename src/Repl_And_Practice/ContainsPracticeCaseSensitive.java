package Repl_And_Practice;

import java.util.Scanner;

public class ContainsPracticeCaseSensitive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What was the movie last time you have watched ?");
        String movie = scan.nextLine(); // Can Dostum

        System.out.println("Movie contains do Result is = " + movie.contains("do"));

        //check whether if movie name contains do no case no matter case

        String upperCaseMovie = movie.toUpperCase();
        System.out.println("UPPERCASE MOVIE CONTAINS DO = " + upperCaseMovie.contains("DO"));

        String lowerCaseMovie = movie.toLowerCase();
        System.out.println("lowercase movie name contains do = " + lowerCaseMovie.contains("do"));

        // this called method chaining
        // two method works at the same time becasue result is another STRING OBJECT
        // toUpperCase and Contains !!!

        System.out.println(movie.toUpperCase().contains("DO"));







    }
}

package day14;

public class Index0fPractice {
    public static void main(String[] args) {
        //find out index of another string inside this String
        //             012345678901
        String name = "Game of Java";
        // ** lenght is 12 , last char index is 11 !!!


        // find out the location of Java
        System.out.println( name.indexOf("Java"));
        //find out the location of letter o
        System.out.println( name.indexOf("o"));
        // find out the location of first space
        System.out.println(name.indexOf(" "));
        //** find out the first location of letter a
        System.out.println(name.indexOf("a"));
        //find out the second location of letter a
        System.out.println(name.indexOf("a",2));
        //find out last location the letter a shows up
        System.out.println(name.lastIndexOf("a") );
        //find out last location space shows up
        System.out.println(name.lastIndexOf(" "));
        //find out last location Kawa shows up
        System.out.println(name.lastIndexOf("w")); // if it not found it's being minis (-)


    }
}

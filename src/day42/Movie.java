package day42;

public class Movie {

    private String name ; // only accesible within the same class
    double length ;
    String genre ;

    // Default constructor definition ;
    // a constructor that given by compiler
    // only if you don't have any other constructor in your class
    // it's invisible
    // and it has no parameter
    // it has no code inside
    public void setLength(double length) {
        this.length = length;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // className
    // cons is not a method and has no return
    // this is my first constructor without parameter
   public Movie(){
    System.out.println("EMPTY VALUE");
    }

    // write a constructor to set all the fields value
    // how many parameters 3 ?
    // this is piece of code when you create an object !!!!
    public Movie(String name, double length, String genre) {
        this.name = name;
        this.length = length;
        this.genre = genre;
    }
    // toString method so we can directly print out

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }

    // above 2 constructor has been created by short cuts :)
}


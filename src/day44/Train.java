package day44;

public class Train extends Vehicle {

    // this called sub class - More specific
    // this is child
    // EVerything that visible coppied from Super class(Vehicle)

    // i can also have my own attributes here
    int wagonCount ;

    // what is inherited from Super Class
    // fields and methods that visible to the sub class are inherited
    // constructor are not inherited currently

    // i can also have my own behaviour here
    public void makeChoChoSound(){
        System.out.println("CHOOO : CHOOO ");
    }

    public static void main(String[] args) {

        Train t1 = new Train();
        t1.makeChoChoSound();

        // these attributes we got from Vehicle
        t1.make = "Thomas";
        t1.setYear(1999);
        System.out.println("t1.getYear() = " + t1.getYear());
        // t1.year = 1999 ; // private is not inherited
        t1.start();
        t1.goForward();
        t1.wagonCount = 2 ;
        System.out.println(t1.toString());

       Train t2  = new Train();



    }
}

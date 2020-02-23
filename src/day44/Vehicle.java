package day44;

public class Vehicle {

// THIS IS SUPER CLASS - More general
// what i mean by that is to identify to class called super class
// THERE IS ONLY ONE SUPER CLASS
// ALSO CALLED PARENT CLASS
// WE HAVE A SUB CLASS TO EXTENDS THE FEATURES FROM THIS SUPER CLASS
// AND IT CAN BE INFINITE NUMBERS OF CLASS

   protected   String make ;
   // protected access modifier ;
    // make the member accessible in subclasses of this class
   // if it was default it would only accessible same package !
    private int year ;
    // need getter and setter to call this attribute outside of class

    public void start(){
        System.out.println("Turning on Engine = " +make);
    }
    public void goForward(){
        System.out.println(make+ " Going forward");
    }

    // since it is private we generate getter and setter to be called from outside class

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}

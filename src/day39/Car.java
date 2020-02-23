package day39;

public class Car {
    // This Class is car template
    // whole point is being object !

    //Task
    //Akbar 4:36 PM
    //Create a Car Object template by creating a Car class
    //	it  has these attributes
    //		year , model , make , color
    //Create few object out of it with field value set (edited)
    //atributes
    int year ;
    String model ;
    String make ;
    String color ;

    public Car (){
        System.out.println("No arg cons");
    }

    public Car(int year, String model, String make, String color) {
        this.year = year;
        this.model = model;
        this.make = make;
        this.color = color;
    }
//instance method are tied to the object
    // it does not have static method
    // we need an object when we call them
    // instance variable ; declared within class , outside anyy methods and blocks


    // We added behaviours
    public void goForward(){
        System.out.println(make + " Going forward");
        // i added my attribute here
    }
    // now in this class We have 4 attribute 1 behavior
    // instance methods are tied to the object
    // it does not have static keyword
    // wee need an object when we call them

    //task -> create a method to print how old is this car
    public void carAge(){
        System.out.println("car age = " + (2020-year));
    }
    public void changeColorTo(String newColor){
        color = newColor ;
    }
}

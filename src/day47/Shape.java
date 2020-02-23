package day47;

public abstract class Shape {
// Abstract class
    // this class will provide a reusable fields and method to sub classes
    // they can implement their unique implementation

    String name ;
    int area = 2;

    // add a constructor to set these name value
    public Shape(String name  ) {
        this.name = name;


    }
 // add a abstract void method called calculateArea
    public abstract void calculateArea();

    // i want to enforce sub classes to provide toString method !
    public abstract String toString();


}

//  add two concrete class of Shape :
//  Triangle
//      instance fields : int height and base
// constructor
//        to set name , height , base
//        implements calculateArea method   area = height * base / 2
// add toString method
//
//  Rectangle
//      instance fields : width and height
//      implements calculateArea method   area = height * width
//      add toString method




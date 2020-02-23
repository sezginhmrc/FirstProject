package day51.polymorphism;

public abstract class Shape {

    String color ;
    public abstract void draw();

}
class  Triangle extends Shape {
    String color ="Red";
    public void draw(){
        System.out.println("DRAWING TRIANGLE");
    }
}

class Rectangle extends Shape {

    public void draw(){
        System.out.println("DRAWING RECTANGLE");
    }
}

class Circle extends Shape  {

    public void draw (){
        System.out.println("DRAWING CIRCLE");
    }
}


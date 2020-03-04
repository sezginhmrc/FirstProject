package day47;

import java.util.InputMismatchException;

public class Rectangle extends  Shape{



    int width ;
    int height ;

    // when we overriding the abstract method we don't use the abstract keyword
    // implementing the body of method
    // Abstract method must overridden in subclass
    public void  calculateArea(){
        area=height*width;
    }

    public void esma (int x, int y){
        System.out.println("2 param");
    }

    public Rectangle (int width, int height){
        // i want to set the name to word Rectangle
        super("Rectangle");
        this.width =width;
        this.height =height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

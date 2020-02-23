package day51.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 =new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();


     /*   s1.draw();
        s2.draw();
        s3.draw();*/
        // making correct decision according to object !!


        // please create Array of shape to store 5 concrete Shape Object
        // and call the draw the method
        // Also try to create ArrayList
        // and store 4 concrete Shape objects
        // and call the draw method on each of them
        Shape [] manyShapes = {s1,s2,s3 , new Triangle(), new Circle()};
        for (Shape each : manyShapes){
            each.draw();
        }

        ArrayList<Shape> list = new ArrayList<>(Arrays.asList(s1,s2,s3));
        for(Shape eachList : list){
            eachList.draw();
        }
    }
}

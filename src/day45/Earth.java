package day45;

import day48.Plane;

import javax.lang.model.util.Elements;
import java.awt.*;
import java.awt.geom.Point2D;

public class Earth extends Planet {
    //    String name ;
    //    int radius ;
    //    boolean hasLife ;

    int population ;

   public Earth(){

    }
    // we used the super keyword in order to call parent class consturctor
    public Earth(double gravity, int radius , boolean hasLife, int population){
        super(gravity,radius,hasLife);
        // this is calling super class construcutr
        // it must be first step !
        this.population = population;
    }
    // adding the toString method so we can print it in nice format


    @Override
    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }

    public static void main(String[] args) {


        Earth e1 = new Earth(9.81,5000,true,100000);
        System.out.println("e1 = " + e1);

        Planet e2 = new Planet(3.5,2,false);

        Plane e3 = new Plane();
        // since we have deaful contrcutro in super class we can declare an object wit no arg
        // only if you dont have any other constructor
        // court gives you a lawyer :)




       /* Point originOne = new Point(23,47);
        Rectangle r1 = new Rectangle(100,200);
        Rectangle r2 = new Rectangle(300,200);

        System.out.println("r1.width = " + r1.width);
        System.out.println("r1.height = " + r1.height);*/


    }



}

package day60;

import java.lang.reflect.Array;
import java.util.*;

// a class extends another class
// an interface extends another interface
// a class implement one or more interface

public class CollectionIntro {

    public static void main(String[] args) {

        // List is interface in Collection Framework
        List<String> name = new ArrayList<>();
        // Referene type is List and  actualy object is ArrayList(Polymorphism)
        name.add("Sezo");
        name.add("Ozlem");
        //   System.out.println("name.get(0) = " + name.get(0));
        // List is the only Collection that have index method.
        // List Interface doesn't care about duplicate



        Collection <String> names = new ArrayList<>();
        // Higher you go less access...
        names.add("Hasan");
        names.add("Sevim");
        names.add("Sezgin");
        names.add("Esma");
       names.addAll(name); //( added a collection Sezo and ozlem)
        System.out.println(names); // printing all
        names.remove("Hasan"); // removing Hasan

        // priniting each name
        for(String eachName : names ){
            System.out.println(eachName);
        }
        names.forEach( each -> System.out.println("Each = " +each));
        // Optionally ; This is how we can use forEach method to print out everthing in one shot
        // ->  symbol this is lambda expression
    }
}
// The word Collection contains ;

// Collection Framework -> referring entire things, entire topic
// Collection InterFace -> one interface under the entire Collection FrameWrok
// Collections class  -->> (it has s at the end, just like Array and Arrays )
//                   -->>  is a utility class with many static methods
//                 for example : Collections.sort(your collection object1)

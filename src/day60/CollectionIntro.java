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
        // Reference type is List and  actualy object is ArrayList(Polymorphism)
        name.add("Sezo");
        name.add("Ozlem");
        System.out.println("name.get(0) = " + name.get(0));
        //   System.out.println("name.get(0) = " + name.get(0));
        // List is the only Collection that have index method.
        // List Interface doesn't care about duplicate



        Collection <String> names = new ArrayList<>();
        // Higher you go less access...
        names.add("Hasan");
        names.add("Sevim");
        names.add("Sezgin");
        names.add("Esma");

       names.addAll(name); //( added a collection Sezo and ozlem (List is Collection )

        System.out.println(names); // printing all
        names.remove("Hasan"); // removing Hasan


        // priniting each name
        for(String eachName : names ){
            System.out.println("AFTER REMOVE THE HASAN= " + eachName);
        }


        names.forEach( each -> System.out.println("Each = " +each));
        //  This is how we can use forEach method to print out everthing in one shot
        // ->  symbol this is lambda expression
    }
}

// The word Collection contains ;
// Collection Framework -> referring entire things, entire topic
// Collection InterFace -> one interface under the entire Collection FrameWrok
// Collections class  -->> (it has s at the end, just like Array and Arrays )
//                   -->>  is a utility class with many static methods
//                 for example : Collections.sort(your collection object1)


// COLLECTION INTERFACE IS SUPER INTERFACE OF ALL LIST SET AND MAP
// IT HAS FOREACH METHOD INSIDE AND IT IS OVERRIDDEN BY ITS SUB CLASSES(DEFAULT METHOD INSIDE INTERFACE) NOT REQUIRED TO OVERIDDEN..
// IT CAN BE USABLE FOR METHODS IN ORDER TO PRINT THEM IN ONE SHOT



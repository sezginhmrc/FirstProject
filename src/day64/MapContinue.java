package day64;

import java.util.*;

public class MapContinue {

    public static void main(String[] args) {

        Map<String,Double> grocery = new HashMap<>();

        grocery.put("Apple",2.99);
        grocery.put("Orange",4.99);
        grocery.put("Strawberry",2.50);
        grocery.put("Blackberry",5.00);
        grocery.put("Banana",0.99);
        grocery.put("Kiwi",3.49);
        grocery.put("Apple",3.00);

        // Map view ;
        // keySet view , values view , enterySet view

        // How do i store all the keys into a Collection ?
        // Wha d you thinkg the data type will be to store suc collection ?
        // Set Because key are unique
        // We can use keyset() method of Map to get Set of Keys

        Set<String> allNames  = grocery.keySet();
        // this method only getting keys
        // used set to store unique and one data type
        // lets remove some item from set
        // set object still connecto to original map
        // any update on Set going to affect grocery Map
        allNames.remove("Orange");
        System.out.println("All names no orange = " + allNames);

        System.out.println(allNames);
        System.out.println(grocery);
        // Since i removed orange in Set it is no longer exits in Map.....



        // BUT if I dont want such relationship and i just want to use keys somewhere Else ??

        Set <String> namesCopy = new HashSet<>(allNames);

        System.out.println(namesCopy);

        namesCopy.remove("Banana");
        System.out.println(namesCopy);
        System.out.println(grocery);
        // Since i removed orange from copy it didn't affect to original one
        // Because i created new Object and copied everything from original one




        Collection <Double> allPrice = grocery.values();
        System.out.println(allPrice);



    }
}

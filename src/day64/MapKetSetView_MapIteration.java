package day64;

import java.util.*;

public class MapKetSetView_MapIteration {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap.get(\"Apple\") = " + groceryPriceMap.get("Apple") );
        // Map is not iterable so we can not directly iterate over them
        // we can get something iterable out of the map
        // for example keySet view will return a Set<String> and it's iterable

        Set<String> allNames = groceryPriceMap.keySet();

        for(String eachName : allNames){
            System.out.print("eachName = " + eachName);
            System.out.println(" | value is " + groceryPriceMap.get( eachName )   );
        }
        // This is how getting names and price of grocery items in Set object..



    }
}

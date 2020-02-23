package day64;

import java.util.HashMap;
import java.util.Map;

public class ItearatingOverMapUsingLambda {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        // completely optional, like it take it and go
        groceryPriceMap.forEach((name,price)-> System.out.println("name " +name+ " price " +price));
        // this lambda it work for map

        //How to iterate over a Map and update the value at the same time according to certain condition (edited)



    }
}

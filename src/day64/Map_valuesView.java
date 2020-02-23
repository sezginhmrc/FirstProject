package day64;

import java.util.*;

public class Map_valuesView {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);


        // We defined a Collection in order to print values method from mapp
        // it return collection so we use the Collection
        // we cannot used Set it removes duplicates values

        Collection<Double> allPrices = groceryPriceMap.values();
        // Return type values method is collection logically values can be anything
        // can be duplicate.. ?
        System.out.println(allPrices);
        allPrices.remove(1.99);
        // since it has relationship with original one
        // it removes from original one too
        System.out.println(allPrices);
        System.out.println(groceryPriceMap);


        List<Double> pricesCopy = new ArrayList<>(allPrices);
        pricesCopy.remove(1.89);
        System.out.println("pricesCopy = " + pricesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap);
        // also create a list from copying prices from collection








    }
}

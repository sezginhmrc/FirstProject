package day63;

import java.util.HashMap;
import java.util.Map;

public class GroceryItemsMap {

    public static void main(String[] args) {

        Map<String,Double> grocery = new HashMap<>();

        grocery.put("Apple",2.99);
        grocery.put("Orange",4.99);
        grocery.put("Strawberry",2.50);
        grocery.put("Blackberry",5.00);
        grocery.put("Banana",0.99);
        grocery.put("Kiwi",3.49);
        grocery.put("Apple",3.00); // it updated value since the key exists.
        grocery.putIfAbsent("Orange",5.00); // only adds if key does not exists

        System.out.println(grocery);
        // no order when printing (random order)

        System.out.println("Size of grocery elements = "+ grocery.size());


        grocery.replace("Apple",3.00*2); // apple priced doubled.

        System.out.println(grocery.get("Apple"));

        if(grocery.containsKey("Orange")){
            grocery.remove("Orange");
            System.out.println("No more orange");
        }
        System.out.println(grocery);


    }
}

package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_enterySet_View {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set<Map.Entry<String, Double>> entryView = groceryPriceMap.entrySet();

        // why do i need it ?
        // in order to itearte them we need to get something iterable
        // which is Set..
        // Because map is not iterable, w
        // e can get this entries to Set out of using entrySet view
        // Set is iterable

        for (Map.Entry<String,Double> each : entryView){
            System.out.println(each.getKey());
            System.out.println("each.getValue() = " + each.getValue());
            // update teh value of grocery to 15 if tthe grocery name has exact 5 chracters.
            if(each.getKey().length()==5){
                each.setValue(15.0);
            }
        }
        System.out.println(groceryPriceMap);

    }
}

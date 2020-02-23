package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {


        // Creating HashMap objects
        Map<String,Integer> nameAgePair = new HashMap<>();

        // Adding elements ; put Map has Entry(Key value)
        nameAgePair.put("Zehra",6);
        nameAgePair.put("Muhammed",21);
        nameAgePair.put("Maia",27);
        nameAgePair.put("Aidar",20);
        nameAgePair.put("Zehra",12);
        // The keys of the Map is unique, it does not accept duplicate
        // her esince we already have Zehra, it will just update to old value to new value.

        // HashMap no order
        // Hint ; as long as you see Hash there no insertion order..
        System.out.println(nameAgePair); // it printed randomly

        //getting size of map
        System.out.println(nameAgePair.size());

        System.out.println(nameAgePair.get("Zehra"));

        // How do i check a key already exist or not
        // ContainsKey method
        System.out.println(nameAgePair.containsKey("Hasan"));// return boolean

        // How do i only add new items if it does not already exists

        System.out.println(nameAgePair.putIfAbsent("Zehra", 10));
        // it returns 12 beacuuse we already have such a key and it has some value

        nameAgePair.replace("Zehra",12,10); // only update if you pass actual value..
        System.out.println(nameAgePair.get("Zehra"));

        //removing entry(each and every element in map is entry)
        nameAgePair.remove("Aidar"); // it can remove only by key

        // try not to use get method to check you habe the entry or not
        // if you don't have the key you will get null
        System.out.println(nameAgePair.get("Aidar")); //null it is removed above line
        System.out.println(nameAgePair.containsKey("Aidar"));
    }
}

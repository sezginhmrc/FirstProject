package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {

    public static void main(String[] args) {


        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg"); // when we remove Cyborg, Flash become the item at index 2
        superHeros.add("Flash");
        superHeros.add("Aquaman");
        superHeros.add("Wonder Woman");

        System.out.println("SuperHeros = " + superHeros);

        // Do we have superman in the list ?

        System.out.println(superHeros.contains("Superman"));


        /*System.out.println(superHeros.contains("man")); // false beacuse checking all items full of size
        System.out.println(superHeros.get(0).contains("man")); // true  becaseu first item contains man !*/


        // remove any heros that deos not have man in the string

        for (int i = 0; i <superHeros.size() ; i++) {

            String current = superHeros.get(i);
            if(!current.contains("man")){
                superHeros.remove(current);
                // once her os removed , this index will be filled by next item
                // so we need to decrease the index by 1 so stay at same index
          -- i ;
        }

        }
        System.out.println("After removing man = " +superHeros);


        // take away from here :
        //  removing item during the for loop
        //  when you remove 1 item , you will have one less item in the list
        //  everything after the removed item will move to one index to the left
        //  so in order not to miss the item right after the removed item
        //  we need to decrease the index by one to stay at same index after removing

        List<String> superHeroCopy = new ArrayList<>(superHeros);
        System.out.println("Supher hero cop = " +superHeroCopy);


        // THIS WILL CREATE A UNMODIFIABLE LIST !!
        List<String> topics = Arrays.asList("Java","Selenium","Database","API");
        System.out.println("Topics = " +topics);


        // HERE COPYING EVERYTHING Inside topic to topicCopy
        List<String> topicsCopy = new ArrayList<>(topics);
        System.out.println("Topics copy = " +topicsCopy);
        
        // NOW i m adding an elemenet inside the list 
        topicsCopy.add(0,"BABOS");
        System.out.println("topicsCopy = " + topicsCopy);

    }
}

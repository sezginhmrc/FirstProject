package day62;

import java.util.*;

public class SortedSetIntro {

    public static void main(String[] args) {

        //SortedSet Interface extend Set Interface
        // it is a data structure that store unique elements in sorted order...
        // the implemeting class is TreeSet.
        SortedSet<Integer> mySet = new TreeSet<>(Arrays.asList(30,20,10,90,50,80,40,70,60,60));
        System.out.println(mySet);
        // Treeset keeps in sorted order(natural low to high)
        // removes duplicates
        // no index


        // look at output
        // it sorted natural low to high order
        // SortedSet interface is in sorted order and same as Hashset removing duplicate...

        System.out.println(mySet.first());
        System.out.println(mySet.last()); // these methods only belong to sortedSet


        // tell me difference between hashSet and LinkHashSet and TreeSet ?

         /* all set implementations store unique elements
         * HashSet is ordered randomly (default set)
         * LinkedHashSet is keep insertion order
         * TreeSet is sorted order (natural low to high)
         * all of them are removing duplicates
         * They dont have index
         * In order to iterate them We use iterator for each loop an foreach (lambda)
         * in order to remove an item while iterating them we use iterator
         * */

    }
}

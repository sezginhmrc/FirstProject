package day62;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {

    public static void main(String[] args) {

        //SortedSet Interface extend Set Interface
        // it is a data structure that store unique elements in sorted order...
        // the implemeting class is TreeSet.
        SortedSet<Integer> mySet = new TreeSet<>(Arrays.asList(10,20,30,30,40,40,50,50,50));

        System.out.println(mySet);

        // look at output
        // it sorted natural low to high order
        // SortedSet interface is in sorted order and same as Hashset removing duplicate...

        System.out.println(mySet.first());
        System.out.println(mySet.last()); // these methods only belong to sortedSet

        // tell me difference between hashSet and LinkHashSet and TreeSet


    }
}

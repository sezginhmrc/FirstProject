package day62;

import java.util.LinkedHashSet;
import  java.util.* ;

public class LinkedHashSetImplementation {

    public static void main(String[] args) {

        // LinkedHashSet is  type of set and it does one thing extra than set..
        // that extra is it is keep insertion order not randomly as hashset
        // insertion order is first come first serve and also it remove duplicates.
        // since HashSet has less job to do it is more faster than linkedHasSet
        // HashSet only removing duplicates..
        // HashSet is way faster it only has less responsilbite
        // Primary difference is Between HashSet and LinkedHasSet is LinkedhashSet is one more job it just keep insertaion order.
        // HashSet is always way faster..
        // HasHset is more popular
        // A LinkedHashSet is an ordered version of HashSet


        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(10);
        nums.add(10);
        nums.add(22);
        nums.add(13);
        nums.add(13);
        nums.add(30);
        nums.add(30);
        // LinkdeHashSet is keep insertion order
        // removo duplicates

        System.out.println("LinkedHashSet = " +nums);

        Set<Integer> nums1 = new HashSet<>();
        nums1.add(10);
        nums1.add(10);
        nums1.add(22);
        nums1.add(13);
        nums1.add(13);
        nums1.add(30);
        nums1.add(30);
        // HashSet is ordered randomly
        // remove duplicated
        System.out.println("HASHSET = " +nums1);
    }
}

// SUMMARY
// HASHSET IS MORE FORMAL THAN LINKEDHASHSET SINCE IT HAS LESS JOB TO DO
// REMOVE DUPLICATES
// RANDOMLY ORDER
// NO INDEX

// LINKEDHASHSET IS KEEPS INSERTION ORDER
// REMOVE DUPLICATES
// ORDERED
// NO INDEX

// SORTED SET IS INTERFACE IMPLEMENTATION IS TREESET
// TREESET IS SORTED ORDER (NATURAL LOW TO HIGH)
// REMOVE DUPLICATES
// NO INDEX


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

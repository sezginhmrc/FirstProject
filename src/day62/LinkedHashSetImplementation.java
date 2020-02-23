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

        System.out.println(nums);

        Set<Integer> nums1 = new HashSet<>();
        nums.add(10);
        nums.add(10);
        nums.add(22);
        nums.add(13);
        nums.add(13);
        nums.add(30);
        nums.add(30);

        System.out.println(nums1);
    }
}
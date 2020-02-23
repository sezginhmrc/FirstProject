package day24;

import java.util.Arrays;

public class ArrayMethodSorting {

    public static void main(String[] args) {

        int[] score = {99,44,66,23,19,55};
        System.out.println(Arrays.toString(score));
        //for sorting an array in ascending order

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        // so my originial order is gone !!! you can not get it back !!
        // the Array is mutable unlike String

        System.out.println("New first item value is " + score[0]);

        char[] nameChars = {'G','A','S','Z','E','C'};
        System.out.println("name chars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting name chars = " + Arrays.toString(nameChars));

        // the low to high order for character is decided by it's ascii table value !!
        // in order to sorting is first special charater and numbers and letters


        System.out.println("--------String Sorting-------");
        String [] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg","Flash","100", "9","09"};
        System.out.println(Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("After sorting super Heros = " + Arrays.toString(superHeros));

        System.out.println("------Boolean Sorting ---WE Don't gave sort METHOD FOR BOOLEAN ARRAY----");

        boolean[] fiveSwitchOnOffs = {true,false,false,true,true};
        System.out.println("fiveSwithOnOffs = " + Arrays.toString(fiveSwitchOnOffs));

    }


}

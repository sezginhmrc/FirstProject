package day24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {

        String [] names = {"sezo", "ozlem", "love"};
        for (int i = 0; i < names.length ; i++) {
            System.out.print("names : " + names[i] + " ");

        }

        System.out.println(Arrays.toString(names));

        String savingSuperHerosAsString = Arrays.toString(names);
        //saved another string to make it  obvious
        System.out.println(savingSuperHerosAsString);

        // how do we get first character of superheroasstring variable ?
        System.out.println(savingSuperHerosAsString.charAt(0));
        System.out.println(savingSuperHerosAsString.substring(0,1));

        int [] numbers = {10,44,46,64,74};
        System.out.println(Arrays.toString(numbers));




    }


}

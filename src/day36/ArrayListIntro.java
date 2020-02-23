package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {


        // how do we create a ArrayList ?
        // ArrayList only hold and store the ojects We use Wrapper class types
        // Not primitive types..
        // it has to get a object(<String>);



        ArrayList<String> lst1 =new ArrayList<>();
    //  ArrayList<int> lst2 = new ArrayList<int>(); // it gives error because it is a primitive  NO PRIMITIVE AT ALL !!
        ArrayList<Integer> lst2 = new ArrayList<>();
        ArrayList<Long> lst3 = new ArrayList<>();
        ArrayList<Double> lst4 = new ArrayList<>();
        ArrayList<Character> lst5 = new ArrayList<>();

        // Optionally you can create in this way
        // this is another way to create ArrayList
        List<String> myLst = new ArrayList<>();
        // List is a more general data type compared to ArrayList is more concrete type
        // ArrayList is one type of List
        // Just like dog is one type of animal

        lst1.add("sezgin");
        lst1.add("Ozlem");
        System.out.println(lst1);

    }
}

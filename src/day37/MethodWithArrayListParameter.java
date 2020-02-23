package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {


    public  static String getLongestElement(List<String> names ){


        String longestName = names.get(0);

        for ( String eachName : names){
            if(eachName.length()>longestName.length()){
                longestName = eachName ;
            }
        }
        System.out.println("LONGEST NAME IS = " + longestName);
        return  longestName ;



    }

    public static void printAlist (List<String>name) {

        for (String each : name){
            System.out.println("Each = "+each);
        }

    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ikra");
        names.add("Rana");
        names.add("Sezgin");
        names.add("Ali");
        names.add("Ayse");
        names.add("Gulseren");

        printAlist(names);

        System.out.println(getLongestElement(names));




        // create a method that accept a list of String as argument
        // same thing as a method that has list of string parameter
        // and print out each and every item in the list vertically
        //return nothing

        // ARRAYLIST AND LIST ??




    }
}

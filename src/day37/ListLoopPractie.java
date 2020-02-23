package day37;

import java.util.ArrayList;
import java.util.List;

public class ListLoopPractie {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Ikra");
        names.add("Rana");
        names.add("Sezgin");
        names.add("Ali");
        names.add("Ayse");
        names.add("Gulseren");

        // find longet name
        String longestName = names.get(0);

        for ( String eachName : names){
            if(eachName.length()>longestName.length()){
                longestName = eachName ;
            }
        }
        System.out.println("LONGEST NAME IS = " + longestName);

        //length     : counting the elements inside array, it's a property of array object
        //            Last element of array : arr[arr.length-1]
        //length()  : counting the characters inside String , it's a method of string object
        //            Last char of string str.charAt(str.length()-1)
        // size()   : counting the elements inside ArrayList object
        //

        System.out.println("ORIGINAL LIST IS " + names);
        System.out.println("-----------------");

        // reverse the ArrayList using the swamp logic

/*        for (int i = 0; i <names.size()/2 ; i++) {
            for (int j = names.size()-1; j >0 ; j--) {

                String temp = names.get(i);
                names.set(i,names.get(j));
                names.set(j,temp);
            }
        }
        System.out.println("REVERSED LIST IS " + names);*/

        // How do we user for each loop to go through each items
        for (String currentName : names) {
            System.out.println("Current name is " + currentName);

        }






    }
}

package day37;

import java.util.ArrayList;
import java.util.*;


public class ArrayListPractico {

    public static void main(String[] args) {
        
    
       /* ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
        list.set(0,2);
        System.out.println(list);

        System.out.println(list.indexOf(2)); // finding index
        System.out.println(list.get(0)); // finding the value by index ;
        
        list.set(0,3);
        System.out.println("list = " + list);*/
        
        
        

      List<Double> aList = Arrays.asList(9.99,2.43,2.77,9.00,100.23,109.23);
        System.out.println("aList = " + aList);



        String arrayListToString = aList.toString();
        System.out.println("arrayListToString = " + arrayListToString);
        // and i dont want these symbols ;  [] , and space at my new string
        System.out.println(arrayListToString.replace(",","-").replace("[","").replace("]","").replace(" ",""));

        
        
        
        
        
    }
    
    
}

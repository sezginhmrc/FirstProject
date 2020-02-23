package day60;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// THIS IS ONEMLI !!!!!!!!!!!!!!!!!!!!

public class IteratingAnyCollection {

    public static void main(String[] args) {

        Collection<Integer>  numbers = new ArrayList<>(Arrays.asList(10,4,22,12,78));

        // iterating over a collection object using iterator
        Iterator<Integer> myIter = numbers.iterator();


       /* while (myIter.hasNext()){
            System.out.println(myIter.next());
        } if (myIter.next()<=10){
            myIter.remove();
        }*/


        System.out.println("myIter.hasNext() = " + myIter.hasNext());
        // checks if we have an element at next position

        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        //removing whatever is the iteratir is pointing to at this location
        myIter.remove();
        // removed at this location number

        System.out.println("myIter.hasNext() = " + myIter.hasNext());
        // check true or false

        System.out.println(numbers);

        // How do you remove in element while iterating a collcetion ?

        // iterator calling each and every collection type
        // Using iterator to iterate over collection removing item with certain condition

    }
}

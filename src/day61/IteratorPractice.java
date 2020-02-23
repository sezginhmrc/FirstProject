package day61;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

    public static void main(String[] args) {


//        -- Iterator -- see it as a tool to iterate over a collection
//        -- with basic functionality
//
//        in order to get an Iterator object we can call the method

        List<Integer> lst = new ArrayList<>(Arrays.asList(20, 10, 44, 3, 11));

        Iterator<Integer> numIter = lst.iterator();
        // 3 methods available : hasNext() , next() , remove

        System.out.println("to check if we have element at next position \n" + numIter.hasNext()); // and returns boolean

        System.out.println("will move the pointer to the next element and get the value \n" + numIter.next());
        System.out.println(numIter.next());
        System.out.println(numIter.next());

        // now time to iterate over using the iterator
        // first thing first need to decide when we keep looking ?
        // as long as we have next element numIter. hasNext();
        // how to move to the next and get the value
        // numIter.next()
        // List is only type giving you index not any other collection has this feature.

        while (numIter.hasNext()) {
            int x = numIter.next();
            if (x >10) {
                System.out.println("Current item = " + x);
            }

        }
    }
}

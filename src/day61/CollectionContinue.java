package day61;

import java.util.*;

public class CollectionContinue {


    public static void main(String[] args) {

        // Collection interface as super type
        // Pointin to and ArrayList object
        Collection<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayList a = (ArrayList) nums ;
        // downcasting expilictly
        // only reference type decide what is accesible
        // i casted collection refrence type to ArrayList type
        // that i can acces the elemente by index
        // since list is only collection that have index
        // Collections.sort method only accept list
        // thats why i convert collection to list in order to sort it .
        Collections.sort(a);
        System.out.println(a);




        List<Integer> nums2 = new ArrayList<>(Arrays.asList(2,10,6,89));
        Collections.sort(nums2);
        System.out.println(nums2);
        // Collections (with s) a lot of stuff (bunc of ready method)

        // Difference between Collections and Collection ?

        // Collection is interface it is root for collection framework
        // Collections is utility class that has bunch of static methods to use.
        // Collections.sort is accepst list parameter

    }
}

package day61;

import java.util.*;

public class CollectionContinue {


    public static void main(String[] args) {

        // Collection interface as super type
        // Pointin to and ArrayList object
        Collection<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayList a = (ArrayList) nums ;
        Collections.sort(a);
        System.out.println(a);
        /// casting Collections to get list in order to sort it
        // sort method accept a list
        // downcasting expilictly

        // Difference between Collections and Collection ?
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(2,10,6,89));
        Collections.sort(nums2);
        System.out.println(nums2);
        // Collections (with s) a lot of stuff (bunc of ready method)


    }
}

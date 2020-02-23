package day38;

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;*/

import java.util.* ;

public class ListObjectEqualityCheck {

    public static void main(String[] args) {


        List <Integer> nums1 = new ArrayList<> (Arrays.asList(200,300,600,700,800));
        List <Integer> nums2 = new ArrayList<> (Arrays.asList(200,300,600,700,800));
        List <Integer> nums3 = new ArrayList<> (Arrays.asList(200,300,600,700,800));

        System.out.println("nums1 queals to nums2 = " + nums1.equals(nums2));
        // order of the elements matters

        System.out.println("------SORTING THE ARRAYLIST----------");

        List<Integer> nums = new ArrayList<>(Arrays.asList(300,200,700,600,800));
        // 2 ways to sort an arrayList
        // use collections utility class
        // used Collections  from Java util

        Collections.sort(nums);
        System.out.println(nums);


        // this version of sort method accept 2 arguments
        // 1st is the list to be sorted
        // 2nd a Comparator object that contains comparing logic
        // good news is there is ready method already in java

        Collections.sort(nums,Comparator.reverseOrder() );
        System.out.println(nums);



        // List itself also has sort method that accept one Comparator Object
        // 2 simple way to get Comparetor objects are ;
        //  Comparator.naturalOrder() --> low to high order3r
        //  Comparator.reverseOrder() --> high to low order
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);

        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);

    }
}

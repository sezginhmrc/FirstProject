package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllPractice {

    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);

        System.out.println("nums1 = " + nums1);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200,300,600,700,800));

        System.out.println("nums2 = " + nums2);

        // now retainAll method
        // keeping the whatever they have in common..

        nums1.retainAll(nums2);// keeping common stuffs
        System.out.println(nums1); // printing common numbers

        nums2.retainAll(nums1);
        System.out.println("nums2 = " + nums2);
        // same result beacuse they comman are the same


        System.out.println(nums1.equals(nums2));// checking if this two lists are equality



    }
}


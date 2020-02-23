package day36;

import java.util.*;

public class ArrayPracticeMyself {
    public static void main(String[] args) {


        List <Integer> nums = new ArrayList<>(Arrays.asList(28,32,54,68,102,434));
        System.out.println(nums);
         nums.add(1,16);
        System.out.println(nums);
        System.out.println("last value of the list is = " + nums.get(nums.size()-1));
        System.out.println("updating the last value of the list is = " + nums.set(nums.size()-1,92));
        System.out.println("nums = " + nums);
        System.out.println(nums.remove(4));

        for (int i = 0; i <nums.size() ; i++) {
            System.out.print(nums.get(i)+"-");
            
        }

        for(int each : nums){
            System.out.print(each+"-");
        }

        System.out.println();

        // adding existing list to another list
        ArrayList<Integer> nums2 = new ArrayList<>(nums);
        System.out.println("nums2 = " + nums2);



    }
}

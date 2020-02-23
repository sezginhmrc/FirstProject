package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

        int [] nums = {13,31,8,5,21,2};
        System.out.println("nums = " + Arrays.toString(nums));
        int arraySize = nums.length;

        int[] numsCopy = new int[arraySize];

        numsCopy[0] = nums[0];
        numsCopy[1] = nums[1];
        numsCopy[2] = nums[2];
        numsCopy[3] = nums[3];
        numsCopy[4] = nums[4];

        for (int i = 0; i <arraySize; i++) {
            numsCopy[i] = nums[i];

        }
        System.out.println("nums = " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(" Before sort numsCopy = " + Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
      //  Arrays.sort(nums);

    //    System.out.println("After sort nums = " + Arrays.toString(numsCopy));
        System.out.println("After sort nums = " + Arrays.toString(numsCopy));
        System.out.println(Arrays.toString(nums));

        // Check whether the Array still have same content in same order after sorting ?
        // what method will check for centent
        if ( Arrays.equals(nums,numsCopy)){
            System.out.println("This array is already sorted ");
        } else {
            System.out.println("THIS ARRAY IS NOT ALREADY SORTED");
        }


    }
}

package day36;

import java.util.Arrays;

public class MethodPractice2 {

    public static void swampFirstAndLastValue(long [] nums){

       // nums[0] -> firstValue
       // nums[nums.lenght-1] ->LastValue
       // in order to swapp a value
        // we need a temp cup (remember tea and coffee example)

       long temp = nums[0];             //putting tea in the teacup to temp cup
       nums[0] = nums[nums.length-1];   //putting coffee into tea cup
       nums[nums.length-1]  = temp ;    //putting tea(in temp cup) into coffee cup

        System.out.println(Arrays.toString(nums));

        long[] myNums1 = new long[5];     // not assgined array being 0 in primitives data types
        System.out.println("myNums1 = " + Arrays.toString(myNums1));

        String[] names = new String[5];     // not assgined string array being null in wrapper objects
        System.out.println("names = " + Arrays.toString(names));

        Long[] myNums2 = new Long[5];
        System.out.println("myNums2 = " + Arrays.toString(myNums2));



    }



    public static void main(String[] args) {


      long[] myLongs = {1L,3L,11L,32L,23L};
      System.out.println("myLongs = " + Arrays.toString(myLongs));
      // afeter swamping the first and last value ;
       swampFirstAndLastValue(myLongs);




    }
}

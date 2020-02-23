package day36;

import java.util.Arrays;

public class MethodWithParameterArray {

    public static void chageArrayFirstItemTo100 (int[]numbers){
        numbers[0] = 100 ;
    }
    public static void main(String[] args) {

        //  int[] nums = {1,5,3,4,7,2} ;
        //  System.out.println("before sort nums = " + Arrays.toString(nums)  );
        //  Arrays.sort(nums);
        //  System.out.println("after sort nums = " + Arrays.toString(nums)  );

        int [ ] nums = {1,5,3,6,2,4};
        Arrays.sort(nums);
        System.out.println("before changing the numbers = " + Arrays.toString(nums));
        chageArrayFirstItemTo100(nums);
        System.out.println("after changing the numbers = " + Arrays.toString(nums));
        // there is only one TV and two remote
        // int [] nums  = numbers ;
        // int x = 10 ;
        // y = x ;
        // y = 100 ;
        // x = ? 10

        // JAVA IS A PASS BY VALUE LANGUAGE !
    }
}

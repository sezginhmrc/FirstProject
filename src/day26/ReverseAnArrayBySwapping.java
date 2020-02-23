package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {

    public static void main(String[] args) {

        int[] myNumbers = new int[]{5,3,21,2,1,13,8} ;
        int size = myNumbers.length;
        int lastIndex =size-1 ;
        int middleIndex = size/2 ; // 3

        // just to see whats inside , we are not doing anything with string
        //System.out.println(Arrays.toString(myNumbers));

        // first and last
        //System.out.println(myNumbers[0] + " --- " + myNumbers[lastIndex]);

        //second and before last
       // System.out.println(myNumbers[1] + " ---- " + myNumbers[lastIndex-1]);

        //third and two before last
     //   System.out.println(myNumbers[2] + " ---- " + myNumbers[lastIndex-2]);

        // Reversin myNumbers by Loop
        for (int i = 0; i <middleIndex ; i++) {
            // first number to swap  second number to swap
            System.out.println(myNumbers[0] + " --- " + myNumbers[lastIndex-i]);
            int temp = myNumbers[i] ;
            myNumbers[i] = myNumbers[lastIndex-i];
            myNumbers[lastIndex-i] = temp ;

        }
        System.out.println(Arrays.toString(myNumbers));



    }
}

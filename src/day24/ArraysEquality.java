package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {
        //for checking for equality of 2 array object content
        // equals --->> Arrays.equals(firstArrays,secondArray)
        int[] scores1 = {2,4,7,8,35,67};
        int[] scores2 = {2,6,72,34,57,61};
        int[] scores3 = {2,4,7,8,35,67};
        System.out.println(scores1==scores2);
        boolean issS1S2Equals =  Arrays.equals(scores1,scores2);
        System.out.println(issS1S2Equals);
        boolean isS1S3Equals = Arrays.equals(scores1,scores3);
        System.out.println(Arrays.equals(scores1,scores3));


    }
}

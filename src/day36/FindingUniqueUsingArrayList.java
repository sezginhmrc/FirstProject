package day36;

import java.util.ArrayList;

public class FindingUniqueUsingArrayList {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7,9};

        ArrayList<Integer> uniquelst = new ArrayList<>();

        // i want to add items to uniqueLst if it does not already contains that item ?

        for (int each : nums) {
           // System.out.print(each);
            if (!uniquelst.contains(each)){
                uniquelst.add(each);

            }
        }
        System.out.println(uniquelst);

        // reqirement says so !!

    }
}

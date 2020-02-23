package day38;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        //How do we copy everything from Array into ArrayList object
        Integer[] nums = new Integer[] {1,4,5,7,8,5,3,2,19} ;
        List<Integer> numsLst = Arrays.asList(nums);

        for (int i = 0; i <numsLst.size() ; i++) {

            System.out.print(numsLst.get(i)+" ");





        }

    }
}

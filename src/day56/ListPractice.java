package day56;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums.contains(2));
        System.out.println(nums.indexOf(3));


    }
}

package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListasReturnType {

    // Create a method that accept a finalNumber as int
    // return an ArrayList of Integer containing numbers
    // starting from 1 till finalNumber

    public static List<Integer> getListFrom1ToFinalNumber(int finalNumber){

        List<Integer> nums = new ArrayList<>();
        for (int numbers = 0; numbers <=finalNumber ; numbers++) {
            nums.add(numbers);
        }
        return nums ;
    }

    public static List<Integer> getTheList (int finalNumber) {

        List<Integer> nums = new ArrayList<>();
        for (int numbers = 0; numbers <=finalNumber ; numbers++) {
            nums.add(numbers);

        }
        return nums ;
    }



    public static void main(String[] args) {

        System.out.println(getTheList(10));

        System.out.println(getListFrom1ToFinalNumber(10));
        System.out.println(getListFrom1ToFinalNumber(5));
        System.out.println(getListFrom1ToFinalNumber(2));

        List<Integer>myList = getListFrom1ToFinalNumber(25);
        System.out.println(myList);

        List<Integer> myList1 = getListFrom1ToFinalNumber(8);
    }
}

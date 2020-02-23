package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {

    public static void main(String[] args) {


        // create an ArrayList of Integer and fill it up with 1-100

        List<Integer> nums = new ArrayList<>();

        for (int i =1; i <= 100; i++) {
            nums.add(i);

        }
        System.out.println("Nums = " + nums);

        // requirement is Change All the ODD Number value to 0
        // from what we observed , all the odd numbers are at even index !!
        // so we can just work with these even index set the value 0 at those location


        for (int i = 0; i <nums.size() ; i+=2) {
            nums.set(i,0);
        }
        System.out.println("After changing odd numbers to 0 = " + nums);

        // Insert 100 to First Index
        nums.add(0,100);
        System.out.println(nums);

        // How to find index of value 20 :
        System.out.println("Index of 20 is = "  + nums.indexOf(20));



        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        //Task is insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 ?

       lst2.add(lst2.indexOf(34)+1,100);
        System.out.println("New list  = " + lst2);

        // if i want to add 100 to first value which 44 !
        lst2.add(lst2.indexOf(44),lst2.get(lst2.indexOf(44))+100);
        System.out.println(lst2);

        // task is add 100 5 times front of first value

        for (int i = 0; i <5 ; i++) {

            lst2.add(0,100);
        }
        System.out.println("\nafter addgin 5 100 to list = " +lst2);





        }
    }


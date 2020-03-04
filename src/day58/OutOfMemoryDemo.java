package day58;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {

    public static void main(String[] args) {

        // This is Error not Exception
        // Nothing to do with it
        // Enironment problem


        List<Integer> nums = new ArrayList<>();
                            // heap memeory ArrayList

        for (int i =1 ; i >0 ; i++){
            // condition never break the loop !!!
            // infinite loop !!!
            System.out.println(i);
            nums.add(i);
        }

        // This is OutOFMemoryError : Java Heap Space
        // THis Error happens when heap memory is full

        // it looping  until 2147483647
        // INTEGER MAX VALUE ?
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);



    }
}

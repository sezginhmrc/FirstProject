package DecemberArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTask4 {

    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

        //4 , Below tasks will modify array :  (for each loop should not be used, try and see why)
        // 4.1 swap the value of first item in array with last item of array , swap apple with kiwi

        for (int i = groceryItems.length-1 ; i >=0 ; i--) {
            System.out.println("Reversing Items is " + groceryItems[i]);
        }
        System.out.println();
     //  4.2 use for loop to loop through your groceryItems array and modify your items like this :
      // itemValue+itemCharacterCount
        // For example : {"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}
        for (int i = 0; i <groceryItems.length ; i++) {
            groceryItems[i] += groceryItems[i].length();

        }
        System.out.println(Arrays.toString(groceryItems));

        System.out.println();



    }

}

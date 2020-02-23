package day26;

import java.util.Arrays;

public class SwappinTheValues {


    public static void main(String[] args) {

        int[] myNumbers = new int[4];   // 4 is item count
        // we assign value using array variable and it's index
        myNumbers[0] = 10;
        myNumbers[1] = 40;
        myNumbers[2] = 30;
        myNumbers[3] = 7;

        int temp = myNumbers[0];
        myNumbers[0] = myNumbers[3];
        myNumbers[3] = temp;

        System.out.println("Swapped the first item and last item in the array is = " + Arrays.toString(myNumbers));
    }
}

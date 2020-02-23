package day26;

import java.util.Arrays;

public class SwappingValues {

    public static void main(String[] args) {

        String name1 = "Emma" ;
        String name2 = "Jasom" ;

        // name 2 should have emma , name1 should have Jason ;

        String tem = name1 ;
        name1 = name2 ;
        name2 = tem ;

        System.out.println("name 1 is " + name1);
        System.out.println("name 2 is " + name2);

        //swap the value of first item and last item ;

        int[] myNumbers = {10,40,30,7};

        int temp = myNumbers[0] ;
        myNumbers[0] = myNumbers[3];
        myNumbers[3] = temp ;

        System.out.println("first item value  " + myNumbers[0] + " and last item value is " + myNumbers[3]);

        System.out.println("myNumber = " + Arrays.toString(myNumbers)); // Arrays.toString shows what inside of array

        // cup of tea and cup of coffe eaxmple !!

        // if you wanna swap some specifi numbers in Array you use their index !

        int temporary = myNumbers[1];
        myNumbers[1] = myNumbers[2] ;
        myNumbers[2] = temporary ;

        System.out.println("myNumber is = " + Arrays.toString(myNumbers));
        // at this point it already has been swapped and printed as is !


    }
}

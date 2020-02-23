package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {

    public static void main(String[] args) {
        /*
        Single dimensional array : contains values
             int[] arr = {1,2,3} ;

       Multi-dimensional array : an Array that can contain array(s)
            N dimesional Array contains (N-1) demesional arrays

        */

        int [] arr1D = {1,2,3};

        // 2D array : is an array that contains single dimentional array
        //               0 1 2   0 1 2
        int[][]arr2D = {{1,2,3},{4,5,6} };
        // index           0        1

        System.out.println(arr2D.length);

        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));

        // arr2d[0][2] ---> 3 ;
        System.out.println(arr2D[0][2]);
        System.out.println(arr2D[1][1]);

        // Arrays.toString is only applicable to single dimensional array !!
        System.out.println(Arrays.toString(arr1D));

        // this is regular way to print.
        System.out.println(Arrays.toString(arr2D[0]));

        // if i wanna print multi dimensional arrays in once, we use Arrays.deepToString method !
        System.out.println(Arrays.deepToString(arr2D));





        String[][] names = {{"Sezgin","Rana","Ikra"}, {"Okan","Ozlem","Eddie"}};
        // if [][] it must be contains two brackets 2 dimensional arrays
        System.out.println(Arrays.toString(names[0]));
        System.out.println(Arrays.toString(names[1]));

        System.out.println(names[0][0]);
        System.out.println(names[1][1]);

        names[1][1] = "ASK" ;
        // Ozlem became Ask

     ;   System.out.println(names[1][1]);

        // in order to print whole array ? in mind this multiple dimensional
        // we use deepToString (variable name)
        System.out.println(Arrays.deepToString(names));

        int [][] numbers = {   {1,2,3},{4,5,6},{7,8,9},{10,11,12}  } ;
        // index number           0       1       2         3
        System.out.println(" sum index of numbers = " + numbers.length );
        int lastNumberIndex = numbers.length-1 ;
        System.out.println("lastNumbersIndex = " + lastNumberIndex);
        System.out.println("last index numbers = " + Arrays.toString(numbers[3]));


        // in order to print out each element you need nested loop !!
        for (int i = 0; i <numbers.length ; i++) {
          // System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j] + " ");
            }

        }
        System.out.println();

        int [][] ages = {{10}, {12,13,14,15,16,17}, {19,20,21,22,23} } ;

        for (int i = 0; i <ages.length ; i++) {
         //   System.out.println(Arrays.toString(ages[i]));
            for (int j = 0; j <ages[i].length ; j++) {
          //      if(ages[i][j]%2==1){
            //    continue; // skip the numbers
                    if(ages[i][j]%2==0){
                        System.out.println(ages[i][j] + " ");
                }
           //     System.out.println("Even Numbers = " + ages[i][j]);
            }

        }
        System.out.println();
        // Another Example With Eaxh Loop
        int[] arr1 = {1,2,3};

        for (int each : arr1D){
            System.out.println(each+ " ");
        }
        System.out.println();
        int [][] arr2 = { {10,20,30}, {40,50,60,70,80,90,100} } ;
        for (int [] each1dArray : arr2D){
            for ( int eachElement : each1dArray){
                System.out.print(eachElement+ " ");
            }
        }
    }
}

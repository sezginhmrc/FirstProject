package day27;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrays_3D {

    public static void main(String[] args) {
        // N dimesional Array must contains (N-1) dimesional Arrays

        int [] [] arr2D = {{1,2,3},{4,5,6}};
        // this is 2D Array ; contains 1D demensional array

        int [][][] arr3D = {   {{1,2,3},{4,5,6}} ,   {{7,8,9},{10,11,12}}   };
        //                              0                       1

        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.deepToString(arr3D));

        // print 9
        System.out.println(arr3D[1][0][2]); // returns value

        //print 5
        System.out.println(arr3D[0][1][1]); // returns value

        // print {1,2,3}
        System.out.println(Arrays.toString(arr3D[0][0])); // returns 1d array

        // print {10,11,12}
        System.out.println(Arrays.toString(arr3D[1][1])); // returns 1d array

        //print {{7,8,9},{10,11,12}}
        System.out.println(Arrays.deepToString(arr3D[1])); // returns 2d array (deepToString)

        //print 3d array whole numbers
        System.out.println(Arrays.deepToString(arr3D));


        }

    }



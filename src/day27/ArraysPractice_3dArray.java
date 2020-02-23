package day27;

import java.util.Arrays;

public class ArraysPractice_3dArray {

    public static void main(String[] args) {

        int [][][] arr3D = {   {{1,2,3},{4,5,6}} ,   {{7,8,9},{10,11,12}}   };

        for (int i = 0 ; i<arr3D.length ; i ++) { // each index of 2d array
            System.out.println(Arrays.deepToString(arr3D[i]));
            for (int j = 0; j <arr3D[i].length ; j++) { // each index number of 1d array
            //   System.out.println(Arrays.toString(arr3D[i][j]));
                for (int k = 0; k <arr3D[i][j].length ; k++) { // each index number of the of the values
          //          System.out.print(arr3D[i][j][k] + " ");

                }
            }
        }



    }
}

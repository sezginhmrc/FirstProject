package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {

    public static void main(String[] args) {

        int [] [] myExcel = {  // this is the beginnin of the 2D array object
                                {10,27,88,99}, //  index 0 : this is first 1D Array
                                {87,100},       // index 1 : this is second 1D Array
                                {90,45,65}      // index 2 : this is third 1D Array
                             };  //this is the ending of the 2D array object
        // what does deepToString method do :
        // it takes an multiD array and turn it into a String with All items
        System.out.println(Arrays.deepToString(myExcel));

        for ( int []  eachRow :myExcel ){
            for (int eachCell  : eachRow ){

                System.out.print(eachCell + " ");
            }
            System.out.println();
        }


    }
}

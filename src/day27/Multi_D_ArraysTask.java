package day27;

import java.util.Arrays;

public class Multi_D_ArraysTask {

    public static void main(String[] args) {
        int[][] numbers = {{12, 11, 10, 9}, {8, 7, 6, 182},};
        // find out max number
        int max = numbers[0][0]; // assume that first element is the max to compare with others
    //    System.out.println(numbers.length); ->2
   //     System.out.println(numbers[0].length); ->4
        for (int i = 0; i < numbers.length; i++) {   // checks each single dimensional array
            for (int j = 0; j < numbers[i].length; j++) { // check eack element in single dimension
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }

            }

        }
        System.out.println("Max number is = " + max);
        //solutaion 2 ;
        int max2 = numbers[0][0];
        for (int[] each1DArray : numbers) {
            for (int eachInt : each1DArray) {
                if (max2 < eachInt) {
                    max2 = eachInt;
                }
            }
        }
        System.out.println("max2 number is = " + max2);
        //finding the minimum nuber :
        int min = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (min > numbers[i][j]) {
                    min = numbers[i][j];
                }
            }
        }
        System.out.println("minimum number is = " + min);
        System.out.println();

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalysitsTeam};
        int maxLength = scrumTeam[0][0].length();
        String longestString = "";   // to store the longest string

        for (String[] each1D : scrumTeam) {
            //     System.out.println(Arrays.deepToString(each1D));
            for (String each2D : each1D) {  // each2d checking all names
                if (maxLength < each2D.length()) {
                    maxLength = each2D.length();
                    longestString = each2D;
                }
            }

        }
        System.out.println("max lenght is " + maxLength);
        System.out.println("Longest string is  " + longestString);

        //solutaion 2
        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) {
                if (maxLength == eachElement.length()) {
                    System.out.println(eachElement);


                }

            }
        }
    }
}


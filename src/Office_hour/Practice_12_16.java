package Office_hour;

import java.util.Arrays;

public class Practice_12_16 {

    public static void main(String[] args) {

        String [] name = {"John", "Kevin", "Scott"};
        System.out.println("First name : " + name[0]);

        for (String eachNames : name) {
            System.out.println(eachNames);
        }
        String [][] students = {{"1" , "John", "32", "Usa"},{"2", "Kevin", "24", "Brazil"},{"3", "Scott","43", "Canada"}};
        //System.out.println(Arrays.deepToString(students));
        for(String [] arr : students){
            // loop throuhs value in every inner array
            for (String value : arr){
                System.out.print(value + " ");
            }
            System.out.println();
        }
        // find oldest student an print his names

        // 1st get only age values
        for (String[]row : students ) {
            // go through every row and get
            //value only from 3rd column | number-1 = index
            System.out.println(row[2]);
            int age = Integer.parseInt(row[2]); // conver string into int
        }
    }


}

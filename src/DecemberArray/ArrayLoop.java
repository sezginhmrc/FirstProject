package DecemberArray;

import java.util.Arrays;

public class ArrayLoop {

    public static void main(String[] args) {

        int [] numbers = {2,4,8,16,32,64};
        // Defined values at the time of declaration Array
        numbers[2]= 3 ; // updated value
        System.out.println("numbers = " + Arrays.toString(numbers));

        Integer [][] numbers1 = {{1,2},{3,4}};
        System.out.println("numbers1[0][1] = " + numbers1[0][1]);
        System.out.println("numbers1[1][0] = " + numbers1[1][0]);




        int [] numbers2 = new int [28];
        for (int i = 0 ; i<28 ; i ++){
          numbers2[i] = i+1 ;
        }
        System.out.println(Arrays.toString(numbers2));



//By creating a new array:
//Create a new array of size n+1, where n is the size of the original array.
//Add the n elements of the original array in this array.
//Add the new element in the n+1 th position.
//Print the new array.
//Below is the implementation of the above approach:








       /* try{
            numbers2[4] = 4 ;
            numbers2[5] = 5 ;
            System.out.println(Arrays.toString(numbers2));
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Arrays are fixed size(size is defined at the time of declartion");
        }*/

        System.out.println("size of numbers is " + numbers.length);

        for (int i = 0; i <numbers.length ; i++) {
          //  System.out.println(numbers[i]);
                if (numbers[i]%2==1){
                    System.out.println("Even numbers is " + numbers[i]);
                }
        }

        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[numbers.length/2]);
        System.out.println(numbers[numbers.length/2-1]);


    }





}

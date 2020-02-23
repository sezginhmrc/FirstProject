package DecemberArray;

import java.util.Arrays;

public class Task156 {

    public static void main(String[] args) {
        addTor(new int[]{1,5,77,88},2);
      //  addTor(new int[]{1,5,77,88},2);
        // this is my input and i want the populate the new array where int n added the old  array's inside which is r
        // for example newRis {1,5,77,88,2) ;
        // sodoku ;
        // logically it must be added one more value inside old arry and can i say int sizeNewArr = (r.length+1); ?
        // at this moment i know my new array size and also i know which value i want to go though inside old array
        // int n is must be added
        // if i know my new array size then i want to loop it by adding the new value...
        // (previos values coming from old array in order to add them to new array I need to loop it)

    }                           // above values
    public static void addTor (int [] r , int n){
        int [] new_r = new int[r.length+1];
        int newItem = n ;

        for (int i = 0; i <r.length ; i++) {
            new_r[i] = r[i];
            new_r[new_r.length-1]=newItem;
        }
        System.out.println(Arrays.toString(new_r));
        // input
        // two parameters ({1,5,77,8}, 2)
        // output
        // [1,5,77,8,2];
    }


}

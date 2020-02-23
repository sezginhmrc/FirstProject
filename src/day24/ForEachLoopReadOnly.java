package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int favNumber = 300 ;
        int myFavNumber = favNumber ;
        int herNumber = myFavNumber ;
    //    myFavNumber = 666 ;
        System.out.println(favNumber);

        int [] numbers = {favNumber,myFavNumber,herNumber};
        System.out.println(numbers[2]);


        System.out.println();


        long [] nums = {10,40,20} ;
        // how do i change double my first item in the array ?
    //    nums[0] = nums[0] * 2 ;
      //  System.out.println(nums[0]);

      for (int i = 0; i <3 ; i++) {
          nums[i] = nums[i] * 2 ;
        System.out.println(nums[i]);
       // nums[i] = nums[i] * 2 ;
           // how do i know array items are modified or not ? // re-print

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);

        }

    }
}

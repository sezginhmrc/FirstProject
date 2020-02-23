package day19;

public class SumOfAllNumbersWithinTheRange {
    public static void main(String[] args) {

        // get the sum of numbers from 1 - 10 ;
        // when we loop from 1 to 10
     //   int sum = 0 ;
     //    while (sum<=10){
      //       System.out.println(sum);
      //       ++sum ;
      //   }
       int sum = 0 ;
     //   sum = sum + 1 ;  // 1
     //   sum = sum + 2 ;  // 3
     //   sum = sum + 3 ;  // 6
        for (int x = 1 ; x <= 10 ; x ++ ) {
            //   System.out.println(i);
            sum = sum + x;
            System.out.println(sum);
        }
            System.out.println(sum);  // debug it for better understanding !! // this is final sum

        // HOMEWORK
        // Create a program to
        // ask user two number and
        // add numbers within those range
    }
}

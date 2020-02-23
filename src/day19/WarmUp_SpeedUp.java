package day19;

import java.util.Scanner;

public class WarmUp_SpeedUp {
    public static void main(String[] args) {

        //  this is how we counted from 1 to 10 !
        //  for (int i = 0; i <=10 ; i++) {
        //  System.out.print(i + " ");
        //  }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end speeding ? ");
        int start = scan.nextInt();
        int end = scan.nextInt();

        // int start = 10 ;
        // int end = 27 ;
        // this is sudo code for above statement ;
        // if start is less than end t
        // the speed supposed to be increased
        // 10 ,11 ,12 .....27

        // if the start is more than end
        // the speed supposed to be decreased
        // 27, 26, 25.... 10
        if (start < end) {
            for (int i = start; i <= end; i++) { //  another way is for ( ; start <= end ; i ++)
                System.out.println(i + " ");        // if  you wanna decrease from 27 to 10 start is  more than end
                                                    // and decrease the value i --
            }

            } else if (start>end){
                for (int x = start ; x> end ; x--) {
                    System.out.println(x + " ");
                }



            } else {
            System.out.println("NO ACTION NEEDDED");
        }
    }
}
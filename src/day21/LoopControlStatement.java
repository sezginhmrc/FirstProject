package day21;

import java.util.logging.SocketHandler;

public class LoopControlStatement {
    public static void main(String[] args) {

        //break
        // if line contains break reaches the loop will stop !!

        //continue
        //if Line contains continue reached the loop will skip to next iteration

        // We can use break and continue for any type of loop

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {    // if you wanna break out of the loop at 5.
                break;
            }

        }

            int sum = 0;
        for (int y = 1; y <=10 ;  y++) {
            System.out.println("current sum is " + sum );
           sum = sum + y ;
            if (sum+y>40){
                break ;
            }
            
        }
        System.out.println("final sum = " + sum );



    }

}
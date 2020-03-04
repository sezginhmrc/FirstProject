package day57;


import java.security.cert.Extension;
import java.util.Arrays;

public class ExceptionExample
{
    public static void main(String[] args) {

        System.out.println("Hello B15 Online Friends");

        // int num = 2.5 ; //
        // this is COMPILE ERROR.

    /*   int [ ] nums =  new int [3] ;
       nums [0] = 55 ;
       nums [1] = 56 ;
       nums [2] =  57 ;
       nums [3] = 58 ; // RUNTIME EXPECTION, because there is no such index in array
        System.out.println(nums.toString());*/
        //  nums [3] = 58 this line of code is
        //  ArrayIndexoutofboundExpection
        // THIS RUNTIME EXPECTIONS HAPPENS DURING RUN TIME :))

        // Program stop here not even check below code because i have runtime error

        // i used try catch to handle a runtime exceptions(unchecked exception)
        try{
            System.out.println("Before Try First Statement");
            int result = 10/0 ;
            System.out.println("Might throw an exception"); // this statement is after the exception code not will be run.
            System.out.println(result);
        } catch (Exception e){
            System.out.println("EXCEPTION IS CAUGHT"+e);
        }
        finally {
            System.out.println("THIS CODE RUN ANYWAY:)");
        }


        // This is RUNTIME EXPECTION can't be  divided by 0
        // AritmeticExpection
        // compile fine but runtime error






    }
}

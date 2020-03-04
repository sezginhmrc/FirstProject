package day59;

import java.io.IOException;

public class CheckedAnUnchecked {

    public static void main(String[] args) {

        try{
            String x = "abc" ;
            System.out.println(x.charAt(100));
        } catch (IndexOutOfBoundsException i){
            System.out.println("Exception is cought"+i.getMessage());
        } finally {
            System.out.println("Finally block is run anyway");
        }

        //Exception Hierarchy

        // Throwable -> Child class ->Exception
        // Under exception class .
        // there is one sub class known as RuntimeException
        // Anything is-a RuntimeException regarded as UncheckedException

        // UncheckedExpection are not required to be handled at compile time.
        // CheckedException is require to be handle at compile time


        // Summary ; THIS IS UNCHECKED EXCEPTION
        // SINCE COMPILE IS FINE
        // RUN TIME EXCEPTION
        // CAN BE HANDLED BY TRY CATCH3
        // I JUST HANDLED IT WITH TRY CATCH

        throw new RuntimeException("Just throwing this away");
        // no error runtimreException
        // UNCHECKED EXCEPTION


        //throw  new IOException("Just throwing this way");
        // it gives error compile time exception
        // CHECKED EXCEPTION








    }
}

package day59;

public class CheckedAnUnchecked {

    public static void main(String[] args) {

        String x = "abc" ;
        System.out.println(x.charAt(100));

        //Exception Hierarchy

        // Throwable -> Child class ->Exception
        // Under exception class .
        // there i one sub class know as RuntimeException
        // Anythin is-a RuntimeException regarded as UncheckedException
        // UncheckedExpection are not required to be handled at compile time.



    }
}

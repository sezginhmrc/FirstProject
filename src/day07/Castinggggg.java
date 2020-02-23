package day07;

public class Castinggggg {

    public static void main(String[] args) {


        // int num = 10 ;
        // int 10 is implicitly (automatically) converted to double 10.0

        double bigNum = 10 ;
        System.out.println(bigNum); // result is 10.0

        //12.99 is double , double has much bigger range than int
        // so it just does not fit
        // int rum = 12.99 ; // complier error ///

        int num = (int) 12.99;
        System.out.println(num);

        // create a long variable and store int
        //create an int variable and try to store above long value
        double d = 12.53 ;
        int i = (int) (d) ;
        System.out.println(i);



        long earthToMoon = 10000 ; // -->> 10000L
        //create an int variable and try to store above long
        int earthToMoonIn_int = (int) earthToMoon;

        System.out.println(earthToMoonIn_int);












        // long a = 10L ;
        //int b = a ;



    }
}

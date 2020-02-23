package day36;

import java.awt.*;

public class MethodWithWrapperTypes {

    public static void sumAndPrint(Integer num1, Integer num2){
        // Integer t oint conversion --> auto-unboxing
        //compiler will turn num1 and num2 into int so it can add them numerically

        System.out.println(num1 + num2);
    }

    public static void printTheDoubledValue( int x) {
        System.out.println(" after doble the value is = " + (x*2));
    }

    public static void main(String[] args) {

        System.out.println("--method with integer ---- ");
        // it is a variable with data type Intger
        // Autoboxingg
        Integer i1 = 12 ;
        Integer i2 = 23 ;
        sumAndPrint(i1,i2); //
        sumAndPrint(300,200);

        // most obvious way
        // we directly passed int.
       sumAndPrint(23,12); // it directly turns a int(object)

        //another way
        // it's expecting 2 Integer object
        // and we used new kewword to provide 2 Integer Object
       sumAndPrint(new Integer(23), new Integer(12));

       //another way
        sumAndPrint(Integer.valueOf(23), Integer.valueOf(12));

        System.out.println("--method with int parameter----");
        printTheDoubledValue(new Integer (2));// even we put integer it turns int
        printTheDoubledValue(6);


    }
}

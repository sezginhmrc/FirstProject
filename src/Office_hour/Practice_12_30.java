package Office_hour;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice_12_30 {

    public static void main(String[] args) {

        int a = 10 ;
        Integer A = a ;
        // double is only dedicated to double

       // * Auto boxing assigning primitive value to wrapper class
       // * Auto unboxing assignig wrapper class to primitive

        float f  = 0.5f ;
        //Double F=f ;
        // each wrapper classes are dedicated to their own primitives

        Double num1 = 0.5 ;
        Short num3 = 45 ;
        double num2 = num3 ;
        Long number1 = 100L;

        Float f1 = 100.0f ;

        double d1 = f1 ; // unboxing
        System.out.println(num2);
        System.out.println(number1);
        System.out.println(Byte.MAX_VALUE); // max value of byte primitive
        System.out.println(Byte.MIN_VALUE); // min value of byte primitive
        System.out.println(Integer.MAX_VALUE); // max value of integer primitive


        //parse method
        // Converting String to primitive !!

        String str  ="123";
        int result = Integer.parseInt(str);
        System.out.println(result+1);// 124

        String str1 = "true" ;
       boolean b =  Boolean.parseBoolean(str1);
        System.out.println(b);

        String str2 = "TruE" ; // it ignores case senstivie and printing it as is .
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

        String str3 = "True";
        boolean b2 = Boolean.parseBoolean(str3);
        System.out.println(b2);

        //ValueOf method
        //Converting String to wrapper class object

        String s1 = "100.5";
        Double c1 = Double.parseDouble(s1); // auto boxing
        System.out.println(c1);

        Double c2 =Double.valueOf(s1);
        System.out.println(c2);

        String s2 = "fAlse";
        Boolean b3 = Boolean.valueOf(s2);
        System.out.println(b3);

        Double[] arr = new Double[3];
        System.out.println(Arrays.toString(arr));   // default values of primitives

        String name = "string";
        String name1 = new String("string");


        System.out.println(addNum(100.5,200.8));



    }


    public static int addNum (int a, int b){
        return a+b ;

    }

    public static double addNum ( double a , double b  ){
        return a+b ;

    }
}


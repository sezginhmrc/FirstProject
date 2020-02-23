package day35;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int i = 10 ;
        Integer y =Integer.valueOf("29");
        byte b = y.byteValue();
        System.out.println("b = " + b);
        


        // auto boxing - unboxing
        Integer i1 = 12 ;
        System.out.println("i1 = " + i1);
        int i2 = new Integer("12");
        System.out.println("i2 = " + i2);

        // primitive data types are pure value has no behaviour
        //each primitive type has wrapper class that turn it into object so we can treat it

        // this is old way of create Integer Object
        Integer x = new Integer(10);

        // useful way to create a Integer
        Integer x1  = Integer.valueOf(10);
        Integer x2 = Integer.valueOf("10");


        // now x1 was a object you can use it with methods

        byte bValue = x1.byteValue();
        System.out.println(bValue);

        double dValue = x.doubleValue();
        System.out.println(dValue);

        String s = x1.toString();
        System.out.println(s);

        short sValue = x1.shortValue();
        System.out.println(s);




    }
}

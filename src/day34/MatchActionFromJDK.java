package day34;

import day28.ExcelVisualizer;

public class MatchActionFromJDK {

    public static void main(String[] args) {

        // where is String class coming from ?
        // it's coming from a package called java.lang
        // it's a special package
        // and any class in it ,does not need importing when being used
        // for example String class

        // what if I really want to explicitly import String class
        // import java.lang.String

       //     String str = "Hello";

        // There is a class under java.lang called Math
        // and it has lots of math utility methods that ready to be used

        // we dont need to import package for mat class !

        Math.max(1.3,3.4);
        System.out.println(Math.max(1.4,3.4)); // printing max num


        Math.min(100,233);  // printing min num !
        System.out.println("min of 100,233 -> " + Math.min(100,233));

        int sum = Math.addExact(10, 20); // (10+20)  multiplaction of two values !
        System.out.println("sum = " + sum);



        System.out.println(Math.multiplyExact(10,10)); // multiplying the two values  !

        System.out.println(Math.multiplyExact(50000l,50000l));

        



    }

}


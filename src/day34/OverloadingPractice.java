package day34;

import day31.Calculator;
import day31.Calculator_V2;

public class OverloadingPractice {


                // below methods are the same method name even if they have different paramters
                // it is called MethodOverloading
    public static void add(int num) {
      System.out.println(num + 100 + " one parameter");
    }

    public static void add(int num1, int num2) {
        System.out.println("Sum of 2 nums = " + (num1 + num2));
    }

    public static void add(int num1, int num2, int num3) {
        System.out.println("Sum of 3 nums = " + (num1 + num2 + num3));
        //Calculator_V2.calculate('+',2,2);

    }

    public static void add(int num1, long num2) {
        System.out.println("Sum of Long nums = " + (num1 + num2));
        // method name and parameter list is called METHOD SIGNATURE
        // this part is Method signature ->add(int num1, long num2)
       // method overloading only care about Method Signature
    }

    public static void main(String[] args) {
        add(2, 3, 4);
        add(2, 4);
        add(2, 3, 4);
        add(3);
        add(100000, 200000l);
        add(2, 4);
        add(100, 3000, 400);
        add(3, 4, 5);
        add(15);
        add(10, 34);
        add(50);
        add(1);



        // OVERLOADING : Basically you have another method that represents the same method name with different parameters
        // OVERLOADING : method reusability with different parameters
        //Using the same truck to carry people, and then animals, and then plants, etc. Sky is the limit :-
    }

}

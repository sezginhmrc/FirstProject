package day31;

import day29.AllHereos;

public class CreatingMethod {

    public static void main(String[] args) {

        sayHelloWorld7Times();
        // alternatively call using class name
        CreatingMethod.sayHelloWorld7Times();
        calculateMathProblem();
        MethodInto.sayHello(); // in order to print from another class !!
    }

    public  static  void sayHelloWorld7Times(){ // this method should be call above..

        // STATIC METHOD or static variable must be call in static way
        // We can directly call static method using class name or directly ptin by methhod name
        // piece of code that you want to resume goes here
        // no need an object while creating and caling !
        System.out.println("Hello World Line 1 ");
        System.out.println("Hello World Line 2 ");
        System.out.println("Hello World Line 3 ");
        System.out.println("Hello world line 4");
        System.out.println("Hello world line 5");
        System.out.println("Hello World Line 6 ");

    }


    public static void calculateMathProblem(){

        // Create a method to take below action, call it as a calculateMathProblem() in main method !
        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }



    }




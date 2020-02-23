package day34;

import java.util.Arrays;

public class MethoodOverloadingIntro {

    public static void main(String[] args) {


                    // 01234567890
        String name = "Overloading";

        System.out.println(name.substring(2));
        System.out.println(name.indexOf("ing"));

        System.out.println(name.indexOf("din"));
        System.out.println(name.indexOf("o", 2));

        //   Arrays.toString has 9 different version to accept different parameter

        // Method overloading :
        // using same method name and different parameter for methods
        // to reuse the name of similar actions

        sayHello("ozlem");
        sayHello("sezgin");
        sayHello("Denis"); // denis is arg !!!!!!
        sayHello();
        sayHello(1);
        sayHello(3);
        System.out.println(sayHello("Sezgin","Ozlem"));
        sayHello("Rana");
        sayHello(100000l);
        System.out.println(sayHello("eagle","lion"));

        //   sayHello(12,32); // it is wrong beacue we dont have such a method with parameters
        // when you sayHello it shows the method with parameters and it really does not matter which is which
        // once you type the inside paranthesis it captrue the correct one
        // it CALLED METHOD OVERLOADING !
        // it might be different type parameter but as soon as your type methoname it contains all of them

    }
    // We can not have 2 methods with same method name and same method parameters(no matter value name if it is same one parameter)
    public static void sayHello() {
        System.out.println("Hello,World");
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void sayHello(int num) {
        System.out.println("Hello " + num);
    }
    public static void sayHello (long num){
        System.out.println("num = " + num);
    }

   /* public static int sayHello (int num1, int num2){
        return num1+num2 ;
    }*/

    public static String sayHello(String firstName,String lastName){
        return "Hello " +firstName+" "+lastName ;
    }


}

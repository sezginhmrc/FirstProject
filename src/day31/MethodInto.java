package day31;

public class MethodInto {

    // why do we need to have a method ?

    public static void main(String[] args) {

        // two ways to call static methods
        // ClassName.methodName(external data if needed)
        //MethodInto.sayHello(); // optional if you are in same class
           sayHello();
           sayHello();
       // System.out.println("Hello World");
        //System.out.println("My name is Juma");
        //System.out.println("I love Java");
    }
    // MAIN METHOD ENDS HERE
    // DO NOT CREATE A METHOD INSIDE MAIN METHOD
    public static void sayHello(){

        System.out.println("Hello World");
        System.out.println("My name is Juma");
        System.out.println("I love Java");

        // at this point you need to call it in order print it ! inside main method !
        // and you can also put sayHello method after class before main method !
        // the method that you created can be  anywhere inside the class outside main method !
    }
}

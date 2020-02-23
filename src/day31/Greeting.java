package day31;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

    sayHelloTo ("Batch 15")  ; //-->>  print hello batch 15
    sayHelloTo ("Kids") ;   //-->>  print hello kidss
     sayHelloTo("Family");
     sayHelloTo("Babangillere");
     sayHelloTo("bizimkilere");
     sayHello();

    }

    // (String name) this is called method parameter
    // it is expecting this type of data when being called  string - string data
    // one parameter

    public  static void sayHelloTo(String name){

        System.out.println(name);

    }
    public static void sayHello(){

        System.out.println("Hello, Batch15");
        System.out.println("hey how are you ?");
        Scanner scan = new Scanner(System.in);
        System.out.println("Can you enter 2 numbers ? ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1==num2){
            System.out.println("The are equal each other ");
        } else{
            System.out.println("Numbers are not equal ! " );
        }
    }

}


package day34;

import day33.ReturnWillTerminateTheMethod;

import java.util.Scanner;

public class ReturnPractice {

    public static void main(String[] args) {

        // what is return keyword is used
        // break VS return
        // break -->> loop : break out of the loop
        //--> switch : break out of the case
        // --> can we use it to exit method?? NOO!!!!!!!

        Scanner scan = new Scanner(System.in);
        System.out.println("A NUMBER");
        int number = scan.nextInt();

        switch (number){
            case  1 :
                System.out.println("number = " + number);
                break ;
            case 0 :
                System.out.println("number = " + number);
                break ;
            case 2 :
                System.out.println("number = " + number);
                break ;
        }

        // return -->> inside a method
        // return the value out of a method with return type
        // the moment the return keyword is reached it will terminate the method
        // Can it be used in void method ??
        // Yes BUT ONLY IN THIS WAY : return ;
        // what is the benefit of using in void method
        // to terminate the method early
        printMin4CharacterLengthName("Jon");
        printMin4CharacterLengthName("Java Shark");
        printMin4CharacterLengthName("Rana");
    }
    public static void printMin4CharacterLengthName(String name) {

        // if the name has less than 4 chars , get out of the method
        if (name.length() < 4) {
            System.out.println("INVALID NAME!!!!");
          //  return ; // this return is being used to get out of the method early
                    // this is only way to use return in void method
                    // it is like break method !
        } else {
            System.out.println("name = " + name);
        }

     //   System.out.println(name);

    }


}
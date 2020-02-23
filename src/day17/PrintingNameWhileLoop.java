package day17;

import java.util.Scanner;

public class PrintingNameWhileLoop {
    public static void main(String[] args) {
        // in order to print and coding PLAIN ENGLISH IS IMPORTANT !!!
        // print your name in reverse order !
       // assuming you don't know the length of your name

        // find out the location of your last character of your name
        // pick your last character of your name according to the location
        // then keep shiftin the location to pick until first character


        Scanner scan = new Scanner(System.in);
        System.out.println("Print your name : ");
        String name =scan.next();

        int x = name.length()-1 ;  // x is last character index !
            while (x>=0){
                System.out.println("index "+ x + " ; " + name.charAt(x)  );
                -- x ; // reversing string name
        }

            int y = 0 ;
            while (y<name.length() ){
                if(y%2==1 ){ // printing odd numbers
           System.out.println(name.charAt(y));
                }
                ++y ;
           }


    }
}

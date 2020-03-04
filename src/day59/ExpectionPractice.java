package day59;

import java.util.Scanner;

public class ExpectionPractice {

    public static void main(String[] args) {


        System.out.println("The start");
        String name = "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Chracter at what index you want to get from Furkan's name ? ");
        int targetIndex = scan.nextInt();

        // System.out.println(name.charAt(targetIndex));
        // System.out.println("Name = " + name );

        // System.out.println(name.charAt(1000)); // StringIndexOutOfExpection
        // Red lines at runtime excatly telling you where this expection coming from...

        try {
            System.out.println(name.charAt(targetIndex));
            System.out.println("End of try");

        } catch ( Exception e  ){ // We can put  Expection here it will catch StringIndecOutOfBOundException
                                   // Exception Super type (polymorphisim)...
                                 // Java finds the error, create exception object and contain the situation
                                 // Exception e = new StringIndexOutOfBoundException () ;
                                // or StringIndexOutOfBoundException s = new StringIndexOutOfBoundException() ;

            System.out.println(e.getMessage()); // Expection method created and printed ; info about expection
            System.out.println("Something unusual happened");
        }
        System.out.println("The end");
        // Expections are object, so it has its own class
        // and we can create object ourselves just like we did from any other classses
       // StringIndexOutOfBoundsException s1 = new StringIndexOutOfBoundsException();
       // System.out.println("s1.toString() = " + s1.toString());
       //  System.out.println("The end ");





    }
}

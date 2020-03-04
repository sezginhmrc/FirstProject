package day60;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;


// This class about throws keyword
// Throws basically might throw an exception
// Handle or Declare are the ways to deal with checked exception
// if you are sure the method will never actualy throw the exception
// it is good to just declare it to go thruough compiler to make it happy
// if there is actually a chance for the exception mght left unhandled
// it is good to wrap up under try catch

public class DangerZoneAgain {

    public static void main(String[] args) throws  InterruptedException { //FileNotFoundException,
        try {
            readMyFile(); // bothering compile,We have to handled or declare since it might declare a checked exception
        } catch (FileNotFoundException e) {
            System.out.println("Handling Here !!");
        }
        // thread class coming from java.lang.package
        // it has a method called sleep and it will pause the program for a 3 second
    Thread.sleep(3000);
    System.out.println("The end");
    }



    public  static void readMyFile() throws FileNotFoundException {
        System.out.println("Reading the file in my computer");
       throw  new FileNotFoundException("Kaboom ! File is not here !") ;
    }
}

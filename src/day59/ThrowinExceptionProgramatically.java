package day59;

import java.io.IOException;

public class ThrowinExceptionProgramatically {

    public static void main(String[] args) throws IOException {

        NullPointerException e1 = new NullPointerException();

        NullPointerException e2 = new NullPointerException("Anything");
        System.out.println(e2.getMessage());


        //How do I programmatically throw expection myself
        // We use throw keyword followed by exception object
        // (or the variable that point to the expection object)
        throw e2;
        // Throw is a keyword that has one purpose of throwing the exception to the runtime


        //   THROW AND THROWS MEANS COMPLETELY DIFFERENT THING,

        // THROW IS THROWING AN EXCEPTION TO RUN TIME
        // TO CONTROL THE PROGRAM FLOW

        // THROWS IS YOU MIGHT GET AN EXCEPTION


    }
}

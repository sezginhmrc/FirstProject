package day60;

// This is my own type Exception
// Domain specific language
// instead of dealing with fancy words, I create my own exception in my language in my application
// Programmer usually create their own exception to understand their application much better.

public class BreakTimeException extends RuntimeException {

}

class Main {

    public static void main(String[] args) {

        try{
            throw new BreakTimeException(); // WHOLAAA !!!
        } catch (BreakTimeException myOwn) {
            System.out.println("MY OWN EXCEPTION IS CAGUHT "+myOwn.getMessage());
        } finally {
            System.out.println("Run all the times");
        }
    }



    // QUESTION GOES LIKE THIS
    // HOW DO YOU CREATE YOUW OWN TYPE EXCEPTION ?
    //- if we want to create Runtime Exception We create a class and name it whatever we want and Extends the RuntimeException
    // - if we want to create Checked Exception We create a class and name the exception and extends the CheckedException
    // instaed of dealing with Other exceptions i create my own exception in my language in my application
    // WHY DO WE NEED TO CREATE OUR OWN TYPE EXCEPTION

}

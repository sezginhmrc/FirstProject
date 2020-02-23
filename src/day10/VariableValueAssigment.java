package day10;

public class VariableValueAssigment {
    public static void main(String[] args) {

        int offerCount = 3;
        // String message ; // this line is just declaring a variable
        //   String message = "something" ; // this line is declaring and assigning the value !!
        // assigning the value for first time , also called initializing (first value)
        //message ="something else" ; //changing the value and reassigning
        String message = "";

        if (offerCount > 2) {
            message = "great Job";
            // System.out.println( message );

        }
        System.out.println(message);
    }
}

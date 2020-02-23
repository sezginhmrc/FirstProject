package day55;



public class Calculator {

    //// BUILDER PATTERN IN JAVA

   private int result ;


    public Calculator addNum( int num){

        this.result += num ;
        return  this ;
        // Rules ;
        // Return type must be data type
        // adn return by this keyword  line 12 and 15
    }
    // this is a method to minus number to current result
    // and return same Calculator Object
    // this will allow method chaining
    // we can keep calling the method

    // only one object , multiple method being calling with chaining
    // THIS IS CALLED BUILDER PATTERIN IN JAVA
    public Calculator minusNum (int num){
        this.result -= num ;
        return this ;
        // it will return the same object you used to call this method
        // it will allow method chaining using same object
        // Calculator is a return type here
        // this keyword used keep calling same method here
        // this calls variables and methods
        // We can use this -> THE CURRENT OBJECT WE ARE WORKING ON
        // this will come back in SELENIUM !
    }

    // I WANNA CREATE ANOTHER MOTHOD FOR RESULT

    public void displayFinalResult(){

        System.out.println("Final result = " + result);
    }

}


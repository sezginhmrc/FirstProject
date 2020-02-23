package day55;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        c1.addNum(100).addNum(100).addNum(200).minusNum(200).minusNum(50).minusNum(100).displayFinalResult();
        // THiS BUILDER PATTERN IN JAVA
        // only one object , multiple method being calling with chaining
        // Method chaining is used to call multiple methods on the same objects ..
        // we use the this as a return type !
        // in order to return same object we must use same class
        // Thats why we use class name as a return type
        // and return this (this means calling varaible and methods of current class)
        // Question ;
        // How can one object be used repeatedly with multiple method and return same related method result ?

        // String Builder
        // Method chaining is also important for API classes


    }
}

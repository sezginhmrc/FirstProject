package day31;

public class Calculator {
    // now it has 2 int parameter
    public static void add (int num1 , int num2){ // we seperate them by , (comma)
        System.out.println("Result of addition  = " + (num1+num2) ); // we addition by parenthesis (num1+num2);
        System.out.println("Result of multiplication = " + (num1*num2));  // we multiplication by parenthesis (num1*num2);
    }
    // now it has 3 int parameter
    public static void add3Numbers (int num1, int num2, int num3){
        System.out.println("Result is with 3 numbers = " + (num1+num2+num3));
        System.out.println("Result multiplication with 3 numbers is = " + (num1*num2*num3) );
    }
    public static void main(String[] args) {

        add(10,30); // doesnt return (it is void) static (to call directly here) and has two parameters
        add(20,40);
        add3Numbers(10,20,30);

    }
}

package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        /*// Task 2
        Create a class called CitizenTypeChecker with main method
        Create a variable called cityzenType as String
        And create a variable with age  with value
        If the age  is more than 65 , assign value of  cityzenType to Senior
        If not , assign value of  cityzenType to Not-Senior

        (Both tasks optionally use Scanner)
         */

        String citizenType ;


        int age = 75 ;

        if (age > 65) {
            citizenType = "Senior";
            System.out.println("your age is more than 65 and You are a :" +citizenType);
        } else if (age<65) {
            citizenType = "Not Senior";
        System.out.print("your age is less than 65 and your are a : " +citizenType);

        }



    }
}

package day05;

public class VariablePractice {
    public static void main(String[] args) {

        // primitive

        /*
            Block comment, everything in between will be seen as comment

            whole number       : byte , short , int , long
            fractional numbers : float , double
            logical            : boolean (true , false )
            character          : char (single character in single quote )

            usually by default for Whole numbers : just use int
            usually by default for fractional numbers : just use double

            Is string part of Primitive types ? : NOOO !!!
            String is sequence of character
         */

        // Tast 1 : age calculator
        // given birth year , please calculate the age

        int birthyear = 1994 ;
        int currentYear = 2019 ;
        int age = currentYear-birthyear;

        // i was born in year 2001 , and I am 18 years old

       //  System.out.println("I was born in year " + 1994 + " , and I am " + (2019-1994) + " years old") ;
        System.out.println("I was born in year " + birthyear + " , and I am " + age + " years old" );

        // Task 2 : you are speeding today
        // Speed l

        int speedLimit = 55 ;
        int currentSpeed = 65 ;
        int overTheLimit = currentSpeed - speedLimit ;

        System.out.println("You are speeding " + overTheLimit + " mph more than speed limit");
        System.out.println("I was driving " + currentSpeed + " MPH and the speed limit was "+ speedLimit + "MPH " +
                "that means I was driving " + overTheLimit + " over the limit. ");






    }
}

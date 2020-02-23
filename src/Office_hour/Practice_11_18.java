package Office_hour;

import java.util.Scanner;

public class Practice_11_18 {

    public static void main(String[] args) {

        // Scanner Class = new Scanner (System.in) ;
        // compound operator | shorthand operator
        // += , -= , *= , /= , %=

        //increment and decrement operator
        // ++ --

        //Relational Operator
        // >>= <<= checking more or less
        // == != checking for equality and inequality

        //casting -> converting one type to another
        // upcasting | type widening
        // converting data with smaller range data type to bigger range data type
        // for example converting int to long , int to double
        // this happen automatically
        // double price = 99 ; if this printed out 99.0

        //special case of char to int
        // each character is represented by number in ascii table (google this table)

        char myLetter = 'S' ;
        System.out.println(myLetter);

        // int only store number
        // so here it turns the chracter into ascii code number of the letter

        int myLetter2 = 'E' ;
        System.out.println(myLetter2);

        int myLetter3 = 'a' ;
        System.out.println(myLetter3);

        char myLetter4 = 69 ;
        System.out.println(myLetter4);

        //  int num = 10 ;
      //  System.out.println(num == 10 );

        // -----------------------------
        // --- positive and negative number in programming
        //  +
        //    Arithmetic addition operator  5 + 10 = 15 ;
        //   Shorthand Operator  int x = 10 ;    x += 3 ; //13
        //    increment operator  ++x , x++
        //    concatenation    "Jon " + "Snow" = "Jon Snow"
        //    It can also indicate a number is positive  int i =  +5 ; It's optional

        // -
        //   Arithmetic substraction operator  15 - 10 = 5 ;
        //   Shorthand Operator  int x = 10 ;    x -= 3 ; //7
        //   decrement operator  --x , x --  decrease the number by 1
        //   It can be also used to indicate a number is negative number :
        //   for example  int bankBalance =   -190  ; NOT OPTIONAL
        int num = 10 ;
        System.out.println(   num ==10 );
        System.out.println(   num !=10 );
        // -- we can store the result of relational operation into boolean variable
        // because all of them will return true or false
        boolean isNumEqual10  =  (num == 10);






    }
}

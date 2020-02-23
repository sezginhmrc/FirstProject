package day34;

import day31.Calculator;
import day31.Calculator_V2;
import day31.Greeting;
import day32.StringActionHomework;
import day32.StringActions;
import day33.ReturnActions;
import day33.ReturnKeywordPractice;
import day35.CharacterPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MathAction {

    // calling the static methods of other classes


    public static void main(String[] args) {
        StringActions.printAtoZ();


        System.out.println(ReturnNumberActionHomework.build3DigitNumber(11,9,8));
        System.out.println(ReturnKeywordPractice.gettingAgeFromBirthYear(1994));
        // it is coming from different package we use classname.methodName


        // call your build3DigitNumbers method here
        // build3DigitNumbers is under day34 package
        // and inside PracticeMethodWithNumbers class
        // day32 String actions method is printAtoZ
        int result1 = ReturnNumberActionHomework.build3DigitNumber(6, 4, 0);
        System.out.println("result1 = " + result1);


        // in order to use Arrays class
        //      that coming from java.util package (NOT YOUR PACKAGE)
        // first we need to import them import java.util.Arrays;
        // in order to call static method of Arrays class , it coming from JDK
        //      we need to use classname.methodName(...);
        //      here Arrays.toString(your array objects goes here )
        int[] nums = {2, 5, 87};

        System.out.println("Arrays.toString(nums)  = " + Arrays.toString(nums));
        // How can i call static method called calculate in Calculator_V2 under day31 package
        // first thing first , it's not under current package day34
        // so we need to import the class -->> import day31.Calculator_V2
        // in order to call static method of Calculator_V2 class ,
        //  Calculator_V2.yourStaticMethodName(....)
        Calculator_V2.calculate('*',2,22);
        Calculator_V2.calculate('*',2,3);
        Calculator_V2.calculate('/',2,4);
        StringActionHomework.reversePrintAnyName("Rana");
        StringActionHomework.reversePrintMyOwnName(); // no parameter and  given name
        StringActionHomework.printLastCharOfName("Sezgin");

        int digit = ReturnNumberActionHomework.build3DigitNumber(2,33,1);
        System.out.println(digit);

    }



    }
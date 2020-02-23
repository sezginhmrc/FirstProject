package Repl_And_Practice;

public class MethodPracticeReturn {
    public static void main(String[] args) {

        System.out.println(numberComparison(10, 2));
        System.out.println(numberComparison(10, 10));
        printPrdocutInfo("Fire", "HD", 8, 79.99f);
        fahrenheitToCelcius(42.00);
       /* System.out.println(isLeapYear(2019));
        System.out.println(isLeapYear(1999));
        System.out.println(isLeapYear(1000));
        System.out.println(isLeapYear(2444));*/
       
    }


    public static int numberComparison(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        }
        if (num2 > num1) {
            return num2;
        }
        if (num2 == num1) {
            return 0;
        }
        return 0;
    }

    public static void printPrdocutInfo(String productName, String model, int version, float price) {
        System.out.println("I saw " + productName + " " + model + version + " hands-free with Alexa for " + price);
    }

    public static void fahrenheitToCelcius(Double fahrenheit) {
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " F equals to " + celcius + " C. ");
    }


    }
        //AKBAR HOMEWORK
        //n the Gregorian calendar three criteria must be taken into account to identify leap years:
        //The year can be evenly divided by 4;
        //If the year can be evenly divided by 100, it is NOT a leap year, unless;

        //The year is also evenly divisible by 400.  Then it is a leap year.

       /* public static boolean isLeapYear ( int year){
            boolean leap = false;
            if (year % 400 == 0) {
                leap = true;
            } else if (year % 100 == 0) {
                leap = false;
            } else if (year % 4 == 0) {
                leap = false;
            }
        }
        return leap;

    }*/





package day34;

public class ReturnNumberActionHomework {

    public static void main(String[] args) {

        System.out.println(build3DigitNumber(3, 2, 1));
        System.out.println(build3DigitNumber(4, 2, 4));
        System.out.println(build3DigitNumber(2, 322, 1));
        System.out.println(build3DigitNumber(11, 2, 33));
        System.out.println(build3DigitNumber(1,3,4));
        System.out.println(build3DigitNumber(0,200,1));
        System.out.println(build3DigitNumber(122,3,13));

        int res = build3DigitNumber(1,2,3);
        System.out.println("res = " +res);

        int result1 = build3DigitNumber(5,2,5);
        System.out.println("result1 = " + result1);

        int result2 = build3DigitNumber(5,7,5);
        System.out.println("result2 = " + result2);

        System.out.println(result1+result2);


        printName("Ikra");
        printName("sezgin");
        printName("rana");
        printName("mike tayson");
        printName("Abraham Lincoln");


    }

    public static int build3DigitNumber(int digit1, int digit2, int digit3) {

        if (digit1 < 0 || digit1 > 9) {
            digit1 = 0;
        }
        if (digit2 < 0 || digit2 > 9) {
            digit2 = 0;
        }
        if (digit3 < 0 || digit3 > 9) {
            digit3 = 0;
        } return  digit1 + digit2 + digit3 ;
    }


    public static void printName (String name) {
        // void is return type, does not return anything
        // string name is method parameter
        // "Ikra" the actual data that you passed
        // is also called argument ("Ikra")
        System.out.println("Your name is " + name);

    }




}

package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //two int -->> int

        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(5 / 3);

        //arithmetic operator between two numerical data type


        System.out.println(5 + 3.0d);
        System.out.println(5 - 3.0d);
        System.out.println(5 * 3.0d);
        System.out.println(5 / 3.0d);
        System.out.println(5 / 3.0f);

        //store above numbers in variables

        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;

        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


        double fahrenheit = 26;
        double celcius ;


        celcius = (5.0 / 9) * (fahrenheit -32);

         System.out.println(fahrenheit + "F equals to" + celcius + "C.");

        System.out.println("Java is fun");





    }
}

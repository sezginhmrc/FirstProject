package day31;

public class Calculator_V2 {


    public static void calculate (char operator, int num1, int num2){
        switch (operator){
            case '+':
                System.out.println("Addition result is = " + (num1+num2));
                break ;
            case'-':
                System.out.println("Substration result is = "  + (num1-num2));
                break ;
            case '*':
                System.out.println("Multiplication result is = " + (num1*num2));
                break ;
            case '/' :
                System.out.println("Division result is = " + (num1/num2));
                break;
            default:
                System.out.println("INVALID OPERATOR");
        }
    }
    public static void numberCalculator (int num1,int num2) {

        if (num1 + num2 == 100) {
            System.out.println("numbers addition is = " + (num1 + num2));
        } else if (num1 * num2 == 100) {
            System.out.println(" numbers multiplcation is = " + (num1 * num2));
        } else {
            System.out.println("UNEXPECTED RESULT ");
        }
    }
    public static void main(String[] args) {

   //     char operator =  '/' ; // it can be + - * /
    //    int num1 = 10 ;
    //    int num2 =  3  ;
        numberCalculator(10,20);
        calculate('*',10,30);
        calculate('+',10,30);
        calculate('-',10,30);
        calculate('/',10,30);




    }

}

package day10;


public class Calculator_v1 {
    public static void main(String[] args) {
        // create a class calculator with main
        // create a variable called operator with type char
        // assign the value one of these 4 : +-*/
        // use switch
        char operator = '%' ;

        switch (operator) {
            case '+' :
                System.out.print("you are about to add numbers");
                break ;
            case '-':
                System.out.println("you are aobut to subtract numbers");
                break ;
            case '*' :
                System.out.println("you are about to multiply numbers");
                break ;
            case '/' :
                System.out.println("you are about to divide numbers");
                break ;
            default:
                System.out.println("IVALID OPRERATOR");
                break ;
        }



    }
}

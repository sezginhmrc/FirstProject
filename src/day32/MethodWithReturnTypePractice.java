package day32;

public class MethodWithReturnTypePractice {

    // create a method called divide
    // it has 2 double parameters
    //and return the result as double
    //


    public static double divide(double num1,double num2){

    //    return num1/num2 ;

        if(num2==0){
            return 0 ;
        } else {
            return num1/num2 ;
        }
    }

    public static void main(String[] args) {

       // System.out.println(10/0);
        System.out.println(10/10);
        System.out.println("Divide numbers is = " + divide(10,2));
        System.out.println(divide(123,22));

    }
}

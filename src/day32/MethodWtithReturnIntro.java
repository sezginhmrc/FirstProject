package day32;

public class MethodWtithReturnIntro {

    //if we didnt use return and just sout result,
    // we are not able to store and use our result in main method,
    // we could just print it but with help of return
    // we can use our result as int and we can use it as value instead of just printing
    // now adding a  return type instead of void


    //Task1
    // i want to create a static method called giveMeMyName
    // it returns your name as a result
    // it has no parameters

    //Task2
    // doubleTheNumber
    // create a static method that double the value of a number
    // it accept one int parameter and return doubled value of that number
    // whole purpose of writing a method that return a value
    // so we can save the result after calling the method
    // and use it somewhere else

    public static int doubleTheNumer(int num){

      //  int result =num *2;
      //  return result ;
        //easiest way
        return num*2 ; // i declared a return type and a int parameter
                        // at this point i want return double value of this parameter
                        // requirement is multiplication by 2 ;
    }

    public static int add2Numbers(int num1 , int num2){

        return num1*num2; // i declared a return type (int) and 2 int parameter
                          // at this point i want return this two value multiplication each other
                          // requirement is num1*num2 ;
    }
                        //MethodName
    public static String giveMeMyName() {

        return "Akbar";   // i declared a return type (String) and no parameter
                          // i want return this name as a "Akbar"
                          // requirement is "Akbar" ;
    }
    public static void main(String[] args) {
     //   int myResult = doubleTheNumer(10);
     //   System.out.println("myResult = " + myResult);
     //   System.out.println(myResult*2);
        System.out.println("doubleTheNumber = " + doubleTheNumer(10));

        System.out.println("add2Numbers = " + add2Numbers(10,20));
       // int myNumResult = add2Numbers(10,20);
       // System.out.println("myNumResult = " + myNumResult);

       // String name = giveMeMyName();
       // System.out.println("name = " + name);
        System.out.println("giveMeMyName = " + giveMeMyName());


        System.out.println(add2Numbers(20,10)+5);
        // outside of parenthesis in order to addition a value

    }
}

package day50;

public class Addition extends Question {

    //  int num1 ;
    //    int num2 ;
    //    String operator ;
    //    int answer ;
    //    boolean calculated ;
    //    String questionType = "Unknown" ;
    // I HAVE ABOVE DATA TYPES HERE SINCE I INHERIT THEM FROM SUPER CLASS
    // ABSTRACT class must be inheritance

    public Addition (int num1 , int num2){
        super("+","addition");
                this.num1 = num1 ;
                this.num2 = num2 ;
    }

    @Override
    // We must overridden the abstract method
    public void calculate(){
        answer = num1 + num2 ;
        // if you come to this point it means you called
        // the calculate method to calculate the result
        calculated = true ;
        // we declared calcaulate true
        //
    }

    @Override
    // returns the string represantation of the object
    // We return our desired output
    public String toString() {
        if(calculated==true){
            return //super.toString()
              num1 + operator + num2 + " = " + answer ;
        } else {
            return num1 + operator + num2 + " = " ;
        }
    }
}

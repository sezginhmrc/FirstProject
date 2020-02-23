package day50;

public class Subtraction extends Question {

    public Subtraction(int num1, int num2){
        super("-","Substraction question");
      //  this.num1 = num1;
        //  this.num2 = num2 ;
        if(num1 < num2){
            int temp = num1 ;
            num1 = num2 ;
            num2 = temp ;
            // we did swapping 2nd grade kids haven't learned negative numbers yer
            // this is requirement !!
        }
        // after making sure num1 is more than num2 then we set the field value
        this.num1 = num1 ;
        this.num2 = num2 ;
    }
    @Override
    public void calculate(){
        answer = num1 - num2 ;
        // calculated is instance field
        // Question is if is calculated ot not
        calculated = true ;
    }

    @Override
    public String toString() {
        if(calculated==true){
            return //super.toString()
              num1 + operator + num2 + " = " + answer ;
        } else {
            return  num1 + operator + num2 + " = " ;
        }
    }

}

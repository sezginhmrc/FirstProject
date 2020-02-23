package day50;

// We will create 2nd grade math question program
//Question is ABSTRACT IDEA
// an We will represent it by Abstract class here


public abstract class Question  {

    int num1 ;
    int num2 ;
    String operator ;
    int answer ;
    boolean calculated ;
    String questionType = "Unknown" ;


    //this is initializer block
    // we must be used it when a final varaible implementation    // while declartion
   // {
     //   num2 = 2 ;
    //}


public Question (){
    // in order to create any other constructoin in subclasses
    // and to avoid  errors , I declare here empty constructor
}
// We can have constrcutor here Every sub class gonna use it
    // it is resauable code for all subclasses...
    public Question (String operator, String questionType){
        this.operator = operator;
        this.questionType = questionType ;
    }

    // in order to create Math operations for 2nd grade kids
    // We need abstract idea for different implemnetattion
    // addition, division, subpartition, multiplication
    // this is my abstarct method
    // it mustn't have a body
    // static final private methods cannot be ABSTRACT METHOD
    public  abstract void calculate ();

    @Override
    public String toString() {
        return "The question is " + questionType ;
    }


}

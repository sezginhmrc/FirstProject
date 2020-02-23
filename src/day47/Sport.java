package day47;

//can not extend finall class
// String class is based FINAL
//public class sport{  extends String {

public class Sport {

    // FINAL KEYWORD USED FOR VARIABLES, METHODS, CLASS
    //final method can not be overriden in sub class
    // it can be just use as is in sub class
    // just like family tradition
    // it should stay the same in generations to come
    // we can just use it as it

    public final  void  doSomething(){
        System.out.println("doing regular sport");
    }

    public  void doSomethingElse(){
        System.out.println("doing somethin else ");
    }
}

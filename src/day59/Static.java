package day59;

// Static keyword = non-access modifier
//

public class Static
{
    static  int num ;
    static String name ;
    static {
        num = 28 ;
        name = "Unknown";
    }
    static void myMethod (){
    System.out.println("Static My Method");
}
    public void instanceMethod(){
        System.out.println("Instance MEthod");
    }

    public static void main(String[] args) {
        myMethod();
        Static s1 = new Static();
        s1.instanceMethod();
        s1.myMethod();
        Static s2 = new Static();
        s2.myMethod();
        s2.instanceMethod() ;

    }
}

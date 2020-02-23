package day36;

public class MethodWithParameter {

    public static void addOneHundred(int x){

        // when you pass a num this is happen
        x = x +100 ;
        System.out.println(x);


      //  System.out.println( x + 100 );
        // when you pass 25 it acting like below at run time
        // int x = 25 ;
        // System.out.println( x + 100) ;
    }

    public static void main(String[] args) {

        addOneHundred(200);
        addOneHundred(25);
        // because of above explanition below prints will turn int 25
        addOneHundred(new Integer(25));
        addOneHundred(Integer.valueOf(25));
        addOneHundred(Integer.valueOf(200));





    }
}

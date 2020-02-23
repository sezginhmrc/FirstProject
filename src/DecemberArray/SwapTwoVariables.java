package DecemberArray;

public class SwapTwoVariables {

    public static void main(String[] args) {

        //swap two variable' values without using a temporary variable
        //        Ex:
        //            if a =10, b= 20;
        //                output: print( a ) ==> 20
        //                        print( b ) ==> 10

        int a = 10, b = 20 ;
            // expected reult: a =20 , b= 10 ;

        a = a+b ; // 30
        b = a -b ;  // 10
        a = a-b ;   // 30-20 ; !
        System.out.println(a+ " " +b);






    }
}

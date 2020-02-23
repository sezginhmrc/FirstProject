package day11;

public class LogicalOperator_Single {
    public static void main(String[] args) {
    // & -> Check each and every condition no matter what

        // isEngineRunning & isAirEnough
        // if isEngineRunning is false
        // it still check isAirEnough
         // and eventually give you the outcome

       // System.out.println( 7>5 && 1>7);
       // System.out.println( 5>5 && 1>7);
        //System.out.println( 1>5 && 9>7);

        //System.out.println( 7>5 & 1>7);
        //System.out.println( 5>5 & 1>7);
        //System.out.println( 1>5 & 9>7);

       // System.out.println( 9/0 ); // error !! Can not divided by 0 !!
        // i want to check whether dividing 9 by 0 is 3
        //System.out.println( 9/0== 3  );
        // still error
        //System.out.println(  5>9 && 9/0==3 )  ;
        // first statement is false then you not going through second

        //System.out.println(  5>9 & 9/0==3 )  ;
        // if you single ampersend you can go throught second even the first one is false !!!

        // || | same as && &

        System.out.println(  10>5 || 9/0==3 )  ;
        System.out.println(  10>5 | 9/0==3 )  ;



    }
}

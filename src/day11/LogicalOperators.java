package day11;

public class LogicalOperators {
    public static void main(String[] args) {


        System.out.println( "TRUTH TABLE ");
        System.out.println( "RESULT OF true && true  is " +   (true && true)    );
        System.out.println( "RESULT OF false && true  is " +  (false && true)    );
        System.out.println( "RESULT OF true && false  is " +  (true && false)    );
        System.out.println( "RESULT OF false && false  is " + (false && false)    );

        int num = 55 ;

        // || only at least one true make || true
        // && only true if both are true

        System.out.println( num > 100 || num < 10 );
        System.out.println( num > 10 && num <50 );
        System.out.println( num > 45 || num <30 );
        System.out.println( num > 54 || num <34 );
        System.out.println( num >10 && num <100);

        // more than 2 conditions at the same time , 3 conditions !!

        System.out.println( true || false || false );

        System.out.println( true && true && false );

        System.out.println( num==50 || num==51 || num==55) ;

        System.out.println(num >50&&num!=52||num==57 );










    }
}

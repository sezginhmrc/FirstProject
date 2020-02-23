package day06;

public class CoinConverter {
    public static void main(String[] args) {

        //you have 200 cent
        //how many quarter you can get 25c
        //how many dime you can get 10c
        //how many nickel you can get 5c
        // how many penny you can get 1c

        int cent = 200 ;

        // you have purchased candle for 0.74 cent ,
        // what would be your remainder

        cent -= 74 ; //126 cent

        int quarter = cent/25 ;  //126/25 -> 5 , 1 is remanin
        int penny = cent%25 ;  //126/25 -> , 1 is remanin


        System.out.println(quarter);
        System.out.println( penny );

        // now I want to try to calculate dime for same money i got after purchase in dime
        // how to reset the value for cent 124 so I can calculate again

        int dime = cent / 10  ; // -->> 126 / 10 -->> 12 and remainder is 6
        // how much penny i have after getting dime  126%10 -->> 6
        int penny2 = cent % 10 ; //-->> /// -->>> 6

        System.out.println( dime );
        System.out.print( penny2 );




    }
}

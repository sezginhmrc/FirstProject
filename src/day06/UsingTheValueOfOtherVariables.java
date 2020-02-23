package day06;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

        int myFavoriteNumber = 200 ;
        int yourFavoriteNumber = myFavoriteNumber ;

        System.out.println("My favorite number " + myFavoriteNumber) ;
        System.out.println("Your favorite number " + yourFavoriteNumber);

        yourFavoriteNumber = 100 ;
        System.out.println("your favorite number " + yourFavoriteNumber);

        String yourOrder = "coffe ";
        String myOrder = "tea" ;

        System.out.println("Your order is " + yourOrder + "\n" + "my order is " +myOrder) ;




    }
}

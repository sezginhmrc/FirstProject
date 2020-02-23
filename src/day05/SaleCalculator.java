package day05;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in) ;

        int regularPrice ;
        double discount ;
        double salePrice ;


        System.out.println("What is regular price for headphone ? " );
        regularPrice = scan.nextInt();


        System.out.println("What is discount ? " );
        discount = scan.nextDouble();

        salePrice = regularPrice - regularPrice * discount;


        System.out.println(" regular price is " +regularPrice + " $ discount is " +discount+
                " and you got deal for " + salePrice + " $ " )   ;










    }
}

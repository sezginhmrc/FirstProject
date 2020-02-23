package Repl_And_Practice;

import jdk.javadoc.doclet.Reporter;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {

        //in this assignment you will write a program to create a shopping list, count and prices.
        //Please read carefully!
        // If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!
        //You will use Scanner object and ask user to enter 3 items followed by its count, price
        //  and you will calculate total price and show as a report.

        //-Declare 4 String variables item1, item2, item3, report. #
        //-Declare double variables price1, price2, price3, totalPrice #
        //-Declare int variables count1, count2, count3 #
        //-Create a Scanner object named scan. #
        //Execution flow using with example:
        //Use scanner to read all 3 values.

        Scanner scan =new Scanner(System.in);

        String item1, item2, item3, report ;
        double price1, price2, price3, totalPrice ;
        int count1, count2, count3 ;


        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();;
        //(Item1 is "Tomatoes", count is 2, price is 5.4)

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();


        //calculate totalPrice for all items only if the item's count is more than 0!

       totalPrice = (price1*count1) + (price2*count2) + (price3*count3) ;

        //-build the report variable by concatenating Strings and double price values:
        //-do not include items that have count 0, use if statement !
        //-Calculate total price for the item and concatenate like below

        double totalPrice1 = price1 * count1 ;
        double totalPrice2 = price2 * count2 ;
        double totalPrice3 = price3 * count3 ;

        totalPrice = totalPrice1 + totalPrice2 + totalPrice3 ;

        if(count2>0 || count3>0){
            report = "Item2: " +item2 + "Price: " + totalPrice2
            + "Item3: " + item3+ "Price:" +totalPrice3;
        }

        totalPrice = totalPrice1 + totalPrice2 + totalPrice3 ;

      //  report


        //"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
        //Explanation: (Item2 "Cheese" is not included since its count is 0)

        //- Print the value of report variable
        //- Print total Price:
        //"Total price: 42.3"


        //  The unit test assumes that item1 count is always more than 0
        //  The only situations you need to handle are either item2 count is 0 or item3 count is 0.
        //  Think simple and just handle the only item2 is 0 or  only item3 is 0 branches










    }
}

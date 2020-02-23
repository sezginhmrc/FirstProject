package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PriceListPractice {
    public static void main(String[] args) {

      //  List<Double> priceList = new ArrayList<>();
      //  List<Double> priceList = new ArrayList<>(Arrays.asList(9.99,12.99,2.39,3.95,11.29,1.2,3.99,65.59,999.99));
        List<Double> priceList = Arrays.asList(9.99,12.99,2.39,3.95,11.29,1.2,3.99,65.59,999.99);

        // above there is 3 way to create an ArrayList last one is the easiest way

       /* priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);*/

        System.out.println("PriceList = " + priceList);

        // change the third price to 10 $
        System.out.println("\nThird item is = " + priceList.get(2));
        priceList.set(2,10.0);
        System.out.println(" \nAfter updating 3th value = " + priceList.get(2));

        // adding 4 dollar to first price
        priceList.set(0, priceList.get(0) + 4);
        System.out.println("\nAfter adding 4 dollar to first price = " + priceList.get(0));

        // change last price to sum of first and second price
        Double sumOfFirst2Items = priceList.get(0) + priceList.get(1);
        priceList.set(priceList.size() - 1, sumOfFirst2Items);
        System.out.println("\nNew priceList = " + priceList);

        // give 40% off to second price , so our new price should be 40% less than original price which is 60%
      //  priceList.set(1,priceList.get(1)*0.6);
        priceList.set(1,priceList.get(1)*0.6);
        System.out.println("\nAfter 40% off to second price item value is = " + priceList.get(1));

        // DOUBLE THE VALUE OF EACH AND EVERY PRICE IN THE LIST :
        priceList.set(0,priceList.get(0)*2);
        System.out.println("\nAfter updating first value = " + priceList);
        // in order to update an item we need an index and new value
        // in order to update the first value index will be 0
        // in order to double the price from the original , first we need to get the original value
        // then multiply by 2 and use that value for 2nd parameter of set method

        // THIS IS HOW WE DO IT FOR ONE , NOW WE DO IT FOR ALL OF THEM BY REPLACING THE InDEX WITH VARIABLE
        //        double newValue = priceList.get(0) * 2 ;
        //        priceList.set(0 , newValue ) ;
        System.out.println("\nPriceList before doubling = " +priceList);
        for (int i = 0; i <priceList.size() ; i++) {
            double newVal = priceList.get(i) * 2 ;
            priceList.set(i,newVal);

        }
        System.out.println("\nPriceList after doubling = " + priceList);


        //// Cut the price into half if the price is more than 20$

        for (int i = 0; i <priceList.size() ; i++) {
            double eachPrice = priceList.get(i);
            if(eachPrice>=20){
                priceList.set(i,eachPrice/2);
            }
        }
        System.out.println("\nPriceList after cutting half the prices more than 20 = " + priceList);



        // swap the first value with the last value
        Double temp = priceList.get(0);
        priceList.set(0,priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1,temp);
        System.out.println("\nPriceList after swampping first and last value : \n " + priceList);



        // HOMEWORK
        // reverse ArrayList using the swamp logic !!


















    }
}

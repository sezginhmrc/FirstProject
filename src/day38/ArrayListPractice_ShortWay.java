package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {

    public static void main(String[] args) {

        // create List of 6 double in short way
        // we will just read them and will not add or remove item

        List<Double> prices = Arrays.asList(9.99,5.55,3.76,8.99,0.99,65.67);

        int count = 0 ;
        for(Double each : prices){
            if(each>5){
                ++count;
            }
        }
        System.out.println("count = " + count);

        // i want to add 2 more prices ( does not have to be same list)

        ArrayList<Double> newPrices = new ArrayList<>(prices);
        newPrices.add(199.99);    //added new value
        newPrices.remove(0.99); // removed old value from old list
        System.out.println("newPrices = " + newPrices);


        //create a Arraylist object in one short with many items so we can add or remove
        // just one option to create ArrayList object in one short

        ArrayList<Double> oneShot = new ArrayList<>(Arrays.asList(9.99,5.55,3.76,8.99));
        // add 100.99 after 9.99
        oneShot.add(1,100.99);
        System.out.println(" after adding = " +oneShot);
        //remove item 3
        oneShot.remove(2);

        System.out.println("after removing = " +oneShot);

    }
}

package day39;

import java.util.*;

public class ArrayListWakeUpTask {

    public static void main(String[] args) {

         /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18")
        );
        System.out.println("productLst = " + productLst);
        System.out.println("productLst element count = " + productLst.size());

//         * Task 1 : print only items name
        // Logic is split by comma get first index [0]
        String itemDetails = "iPhone 6s,449,18.71";
        String[] split = itemDetails.split(",");

       /* String name = split[0];
        System.out.println("name = " + name);

        double price = Double.parseDouble(split[1]);
        System.out.println("price = " + price);

        double monthly = Double.parseDouble(split[2]);
        System.out.println("monthly = " + monthly);*/

        System.out.println("Item price = " + Double.parseDouble(itemDetails.split(",")[1]));
        // second easisety wat to get first price of first element

        // now will print name of the all list

        for (String each : productLst) {
            String namePart = each.split(",")[0];
            System.out.print(namePart + ",");
        }
        System.out.println();
        // second way to get each item and get the first part after splitted
        //     for (int i = 0; i <productLst.size() ; i++) {  // if i use for loop method i need to use get method to get each item
        //       String namePart = productLst.get(i).split(",")[0];
        //     System.out.println("namePart = " + namePart);
        //   }


//         * Task 2 : print all the prices more than 500

        for (String each : productLst) {
            double price = Double.parseDouble(each.split(",")[1]);
            if (price > 500)
                System.out.println("price = " + price);
        }


//         * Task 3 : print average price

        double sum = 0;
        double average = 0;
        for (String each : productLst) {
            double price = Double.parseDouble(each.split(",")[1]);
            sum = sum + price;
        }
        average = sum / productLst.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

//         * Task 4 : print all the items name that has less than 20$ monthly payment.
        for (String each : productLst) {
            String name = each.split(",")[0];
            double monthly = Double.parseDouble(each.split(",")[2]);
            if (monthly < 20) {
                System.out.println(name + " " + monthly);
            }
        }
            System.out.println("-----TASK 5------");

//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        for (String each : productLst) {
            String name = each.split(",")[0];
            double monthly = Double.parseDouble(each.split(",")[2]);
            if (name.contains("iPhone")) {
                System.out.println("monthly = " + monthly);
            }
        }
        System.out.println("------TASK 6--------");
//         * Task 6 : Print all information about most expensive item.
        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        // in order to find max we create max variabla
        // in other words assume first item price is max price before comparing
        int maxItemIndex = 0;
        for (int i = 0; i <productLst.size() ; i++) {
            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if(price>maxPrice){
                maxPrice = price;
                maxItemIndex = i ;
            }
        }
        System.out.println("maxItemIndex = " + maxItemIndex);
        System.out.println("maxPrice = " +maxPrice);
        System.out.println(productLst.get(maxItemIndex));

    System.out.println("----Task 7 -----------");
//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
        System.out.println(productLst.contains("Dyson")); // false
        System.out.println(productLst.indexOf("Dyson")); // -1
        //    System.out.println(productLst.startWith("Dyson")); // COMPILER ERROR

        // First We need to find out the element that contains word dyson in the list
        int dysonIndex = 0; // there is only one Dyson
        for (int i = 0; i < productLst.size(); i++) {
            if (productLst.get(i).startsWith("Dyson")) {
                // checking the element start with dyson
                dysonIndex = i; // if so set the dysonindex that location
            }
        }
        System.out.println("dysonIndex = " + dysonIndex);
        // this is the original dyson details
        String dysonDetails = productLst.get(dysonIndex);
        // in order to get 80 % off the price and put it back to list
        // we need the price and monthly in double format we can do calculation
        String name = dysonDetails.split(",")[0];
        double price = Double.parseDouble(dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        // putting it back to the dyson details after doing calculation
        dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;

        System.out.println("dysonDetails = " + dysonDetails);
        productLst.set(dysonIndex, dysonDetails);
        System.out.println(productLst.get(dysonIndex));

//         * Task 8 : Count the items prices more than average price.

        int count = 0 ;
        for(String each : productLst){
            double price1 = Double.parseDouble(each.split(",")[1]);
            if(price1>average){
                count++;
            }
        }
        System.out.println("count above average price = " + count);

//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.

        for (int i = 0; i <productLst.size() ; i++) {
            double price2 = Double.parseDouble(productLst.get(i).split(",")[1]);
            if(price2>average){
                productLst.remove(i);
                --i ; //
            }
        }
        System.out.println("productLst count after removing = " +productLst.size());

//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :

        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();


        for(String each : productLst){
            itemNames.add(each.split(",")[0]);
            prices.add(Double.parseDouble(each.split(",")[1]));
            monthlyPayments.add(Double.parseDouble(each.split(",")[2]));
        }
        System.out.println(itemNames);
        System.out.println(prices);
        System.out.println(monthlyPayments);

    }
}


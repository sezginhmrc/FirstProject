package DecemberArray;

public class ArrayTask3 {

    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

        float maxPrice = prices[0];
        float minPrice = prices[0];
        float sum = 0;
        float average = 0;

        // 3.1 print first item and first price in one print statement -->>  apple price is 1.99

        System.out.println(groceryItems[0] + " price is " + prices[0]);

        // 3.2 print last item and last price in one print statement-->>  kiwi price is 2.88

        System.out.println(groceryItems[groceryItems.length - 1] + " price is " + prices[prices.length - 1]);

        //3.2 print all items and prices in one for loop together

        System.out.println();

        for (int i = 0; i < groceryItems.length; i++) {
            System.out.println(groceryItems[i] + " price is " + prices[i]);

        }
        System.out.println();
        //3.3 print only those items with price more than 3.11
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > 3.11)
                System.out.println("prices over 3.11 is " + prices[i]);
        }
        System.out.println();

        //3.4 print only those items with price more than average
        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
            average = sum / prices.length;

        }
        System.out.println("Average price is " + average);

        System.out.println();
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > average) {

                System.out.println("Prices over average is " + groceryItems[i]);

            }

        }

        System.out.println();
        //3.5 print only those prices of grocery items that contains letter b
        for (int i = 0; i < prices.length; i++) {
            if (groceryItems[i].contains("b")) {
                System.out.println("price of grocery item that contains letter b " + prices[i] + " " + groceryItems[i]);

            }

        }
        System.out.println();

        //  3.6 print the item name with max price
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i] ;
                System.out.println("Max Price is " + maxPrice + " Max price item is " + groceryItems[i]) ;

            }


        }
        // 3.7 print the item name with min price
        for (int i = 0; i <prices.length ; i++) {
            if(prices[i]<minPrice){
                minPrice=prices[i] ;
                System.out.println("Min Price is " + minPrice + " Min price item is " + groceryItems[i]);
            }

        }
        System.out.println();
        // 3.8 print the sum of all items

        for (int i = 0; i <prices.length ; i++) {
            sum = sum + prices[i];

        }
        System.out.println("sum of all items is " + sum );
        }


    }






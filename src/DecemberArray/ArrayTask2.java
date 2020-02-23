package DecemberArray;

public class ArrayTask2 {

    public static void main(String[] args) {

        //2, loop through each prices  and print them in one line

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        float sum = 0 ;
        float average = 0 ;
        float max = prices[0];
        float min = prices[0];
        int indexMax = 0 ;
        int indexMin = 0 ;
        float secondMax = prices[0];
        float secondMin = prices[0];
        int indexOfSecondMax = 0;
        int indexOfSecondMin = 0 ;



        for (float each : prices) {
            System.out.print(each + " ");

        }
        System.out.println();
        //2.1 print each prices in even index

        for (int i = 0; i <prices.length ; i++) {
            if(i%2==0){
                System.out.println("even index prices " + prices[i]);
            }

        }
        System.out.println();
        //2.2 print only prices less that 3 dollars
        for (int i = 0; i <prices.length ; i++) {
            if(prices[i]<3.00){
                System.out.println("Prices les than 3 dollars " + prices[i]);
            }

        }
        System.out.println();
      //  2.3 print the sum of all the prices and get average

        for (int i = 0; i <prices.length ; i++) {

            sum = sum + prices[i] ;
            average = sum/prices.length;

        }
        System.out.println("Sum of prices is " + sum );
        System.out.println("Average of prices is " + average);

        System.out.println();

        //2.4 print only the second half of prices (last 3)
        int n = 3 ;
        for (int i = n ; i <prices.length ; i++) {
            System.out.println(prices[i]);

        }
        System.out.println();
        //2.5 print the sum of the middle two prices
        for (int i = 2; i <=3 ; i++) {
            float sumOfMiddle2 = 0 ;
            sumOfMiddle2 += prices[i];

            System.out.println("Sum of middle 2 is " + sumOfMiddle2 );
        }
        System.out.println();
      //  2.6 print only prices more than average price
        average = sum/prices.length ;
        for (float t : prices){
            if(t>average){
                System.out.println("pricer over average price " + t );
            }
        }
        System.out.println();

        //2.7 find out max price and print out max price and  index of max price

        for (int i = 0; i <prices.length ; i++) {
                    if(prices[i]>max){
                        max = prices[i];
                        indexMax = i ;
                        System.out.println("Max price is " + max + " Max price index is " + indexMax);

       //for ( float s : prices){
         //   if(s>max){
           //     max = s ;
             //   System.out.println("Max price is " + s );
            }
        }
        System.out.println();
        //2.8 find out the minimum price and index of minimum price
        for (int i = 0; i <prices.length ; i++) {
            if(prices[i]<min){
                min = prices[i];
                indexMin = i ;
                System.out.println("Min price is " + min + " Min price index is "  + indexMin );
                //   for ( float t :prices){
                //     if(t<min){
                //       min = t ;
                //     System.out.println("Min price is " + t );
        }
            }

        System.out.println();
        //2.9 find out second max price and index
        for (int i = 0; i <prices.length ; i++) {
            if (prices[i]>secondMax && (prices[i]!=max)){
                secondMax = prices[i];
                indexOfSecondMax = i ;
                System.out.println("Second Max price is " + secondMax + " Second max price index is " + indexOfSecondMax);
            }

        }
        System.out.println();

        }

        }




package day23;

public class ForEachLoop {
    public static void main(String[] args) {

        double[] prices = {99.23, 11.22, 100.23, 99.99, 56.23};
        // for each loop synrax
        // for (dataTypeOfYourArray  variableNameForEachItem : yourArrayVariable )
        // do something with your array items

        for (int i = 0; i < prices.length; i++) {
            double eachPrice = prices[i];
            System.out.println("eachPrice = " + eachPrice);
        }

        for (int x = prices.length-1; x>=0 ; x--) {
            double reversePrice = prices[x];
            System.out.println(reversePrice);
        }
        System.out.println("-----");
        // for (dataTypeOfYourArray  variableNameForEachItem : yourArrayVariable )
        for (           double          blabla :                     prices) { // it makes easier and important !!!
            System.out.println("eachPrice = " + blabla);

        }
    }
}

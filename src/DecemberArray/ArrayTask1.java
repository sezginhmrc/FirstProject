package DecemberArray;

public class ArrayTask1 {

    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        //assume that the order of grocery Items match the prices in same order.

        //1, loop through each grocery items and print them in one line

        for (String items : groceryItems) {
            System.out.print(items + ", ");
        }
        System.out.println();

        //print each items at odd index

        for (int i = 0; i < groceryItems.length; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd Index is " + i + " ");
            }

        }
        System.out.println();

        //1.2 print all items in reverse order

        for (int i = groceryItems.length - 1; i >= 0; i--) {
            System.out.println("Reverse items index is " + i + " : " + groceryItems[i] + " ");

        }
        System.out.println();

        //1.3 find out the index location of strawberry

        for (int a = 0; a < groceryItems.length; a++) {
            int straweberyIndex = 0;
            if (groceryItems[a].equalsIgnoreCase("strawberry")) {
                straweberyIndex = a;
                System.out.println("Strawberry index is " + straweberyIndex);
            }
        }
        System.out.println();

        //1.4 find out the count of groceries that contains berry in the name
        for (int i = 0; i < groceryItems.length; i++) {
            String berry = "";
            if (groceryItems[i].contains("berry")) {
                berry = groceryItems[i];
                System.out.println("Items contains berry is " + berry);
            }


        }
        System.out.println();

        //1.5 print out all the character counts of the grocery items
        for (int f = 0; f < groceryItems.length; f++) {
            int charOfAllItems = groceryItems[f].length();
            System.out.println("Character count of " + groceryItems[f] + " : " + charOfAllItems);


        }

        System.out.println();
        //1.6 print out only those items with even character count
        for (int s = 0; s < groceryItems.length; s++) {
            int evenCharCount = groceryItems[s].length();
            if (evenCharCount % 2 == 0) {
                System.out.println("Even Char count " + evenCharCount + " even char count item is " + groceryItems[s]);
            }

        }

        System.out.println();

        //1.7 print out only those items end with letter e
        for (int i = 0; i < groceryItems.length; i++) {
            String endsE = "";
            if (groceryItems[i].endsWith("e")) {
                endsE = groceryItems[i];
                System.out.println("Letters ends with e is " + endsE);
            }

        }
        System.out.println();
        //    1.8 print out only last 3 characters of all the items
        for (int j = 0; j < groceryItems.length; j++) {

            System.out.print(groceryItems[j].substring(groceryItems[j].length() - 3) + ", ");

        }

        System.out.println();
        //1.9 create String variable called allItems and store all the items inside array separated by
        for (int i = 0; i < groceryItems.length; i++) {
            String allItems = "";
            allItems = allItems + groceryItems[i] + ",";
            System.out.print(allItems);
        }

    }


}
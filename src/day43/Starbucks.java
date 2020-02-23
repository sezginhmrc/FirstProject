package day43;
import java.util.*;
public class Starbucks {

    // we enter our program here in main method

    public static void main(String[] args) {
        
        Coffee c1 = new Coffee(); // We used no arg constructor
         System.out.println("c1 = " + c1);
        // we can use setter if we createed in instance field
        // c1.setType("Turkish");
        //  c1.setCaffeineLevel(10);
        // c1.setPrice(-4.99);
        Coffee latte = new Coffee("blonde",3,3.50);

        System.out.println("c1 = " + c1); // toString method


        Coffee c2 = new Coffee("Pike",5,2.85);
        System.out.println("c2 = " + c2);

        Coffee c3 = new Coffee("Latte",4,-1); // price turns 1.0
        System.out.println("c3 = " + c3);


        // sum of all coffee prices
        double sumOfAllCoffees = c1. getPrice() + c2. getPrice() + c3. getPrice();
        System.out.println("sumOfAllCoffees = " + sumOfAllCoffees);
        
       // any non primitive type can be assigned to null
        String str = null;
        Scanner scan = null;
        Coffee cx = null;
        // i created 3 object without address(null)
        // unreferenced


        List<String> lst = new ArrayList<>();
        lst.add("abc");
        lst.add(null);
        lst.add(null);

        System.out.println("lst.toString() = " + lst.toString());
        
        
        
    }
}

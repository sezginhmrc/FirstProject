package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {

    public static void main(String[] args) {

        List<Product> denisList = Arrays.asList(new Product("Coconut ciffe", 2),
                new Product("Tea", 3),
                new Product("muffins", 5),
                new Product("Coffe", 3));

        Store s2 = new Store("Denis store",denisList);
        System.out.println(s2);

        Product p1 = new Product("CheseCake",10);

    }
}

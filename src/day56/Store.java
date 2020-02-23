package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    // I added this name as new requirement so we can identify our store by name
    String name; // adding a field so we can give a name to Store object when we create one
     List<Product> allProducts;  // store has List of products(custom type)


// i created instance method and used the custom type variable here
    public void displayProducts(){
        System.out.println(name + " 's store has below product");
        for( Product each : allProducts){
            System.out.println("\teach = " + each);
        }
    }
    public Store() {
        this.name = "Cybertek Store";
        // creating ArrayList object here
        // eventually we would have to do it anyway!
        this.allProducts = new ArrayList<>();
    }


    //      2 Arg constructor to accept List<Product>
//    First line of constructor should call no arg constructor to reuse initialization logic.
    public Store(String name, List<Product> otherList) {
        this(); // calling no arg constructor here
        this.name = name;
        allProducts.addAll(otherList);
    }

    public void addProduct(Product p ){
        System.out.println("calling addProduct(Product p");

    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=\n\t" + allProducts +
                '}';
    }
}


package day56;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
// This is my List of Custom type !!
        // I implement(overidden equals method) from object class as other classes(string, integer)
        // and i can use the related methods (contains,indexof,indexOf)

        productList.add( new Product("Macbook Pro", 2999) ) ;
        productList.add( new Product("Sony TV", 499) ) ;
        productList.add( new Product("Macbook Air", 1299) ) ;
        productList.add( new Product("Iphone X", 999) ) ;
        productList.add( new Product("Iphone XL", 1299) ) ;
        productList.add( new Product("Sumsung 10", 1188) ) ;
        productList.add (new Product("Samsung Note",1288));


        System.out.println("productList.size() = " + productList.size());

        // Check whether we have "Sony TV" with 499 ;
        boolean result = false;;
        for (Product each : productList){
          /*  if(each.getName().equalsIgnoreCase("Sony Tv")&& each.getPrice()==499){
                result = true ;
            }*/
          // We have each method
            if(each.equals(new Product("Sony TV", 499))){
                result = true;
            }
        }
        System.out.println("Has sony Tv, with 499 or not reult = "+result);

        boolean result1 = productList.contains(new Product("Sony TV",499));
        System.out.println(result1);
        boolean result2  = productList.contains(new Product("APPLE",123123));
        System.out.println(result2);
        // How contains decide you have an object your are looking for in your list ?
        // it will call .equals method of that type, it it is overidden to check for content
        // then it will return desired result according to the content (attributes)
        // else it will always return false
    }
}

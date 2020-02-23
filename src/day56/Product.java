package day56;

import java.util.Objects;

public class Product extends  Object {

    private String name ;
    private  int price ;
    // string equals method is overridden from object class
    // and implement its own logic
    // We did exactly same thing We override equals method from object class
    // We impelemeted our unique logic
    // if we have same chracter it return true
    // Object class equals check pointer if different pointer it turs false either looking at the chracters
    // And it check only object is the same or not ??
    // TWO THINGS HERE OVERIDDEN AND DOWCASTING
    // boolean equals method has been overidden here(Product Class) from Object Class
    // And Object o has been casted (downcasting) Product is smaller cup in order to be fit in product type
    // THIS OVERRIDDEN METHOD IS COMPARINT TWO OBJECT IF THEY ARE EQUAL OR NOT (no matter pointer)
    // Original equals method in object class only checck if their pointer is same or not !
    // .equals only check same item or not
    // Do you have same content ?? (equals)

    @Override// requirement same exact method signature to be overidden
    // We added our implement here PRODUCT CLASS
    // THIS CLASS AND OTHER RELATED CLASS ABOUT WAS THIS EQUAL METHOD..
    // List is using it internally
    // Implementin our methods here to use it with List
    // productList.contains
    // prdocutList.indexOf
    // prdoductList.equals
    public boolean equals(Object o) {
        // down-casting from type Object to Product
        // because in order to access Product only field
        // we need to refer the object as Product
        Product product = (Product) o;

        //// how to compare this name and price to whatever user passed
        return price == product.price &&
                Objects.equals(name, product.name);
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

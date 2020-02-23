package day41;

public class Product {
    // requirement is make this product a well encapsulated
    // make all the instance fields private so it can only be accessible in same class
    // provide public getters and setters method
    private String name;
    private double price;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
/* public String getName() {
        return name;
    }
// this keyword can bu used to refer the current object
 // we can use it to refer the instance field (this)
 // only can bu used inside instance method (and later constructor)
    public void setName(String name) {
        // if i say name instead of newName
        // i need to use this word
        // name = newName ;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // instead of newPrice if i say price
        // if (price>0)
        this.price = price;
    }


    // you can only use this word inside instance method .*/

}

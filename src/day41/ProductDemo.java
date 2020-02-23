package day41;

public class ProductDemo {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setName("iphone");
        p1.setPrice(699);

        Product obj =  new Product();
        // we have an invisible constructor in the blueprint
        obj.setName("Macbook");
        obj.setPrice(1099.00);
        System.out.println(obj.getName());
        System.out.println(obj.getPrice());

        System.out.println("p1.getName() = " + p1.getName());
        // i want to store the price
        double iphonePrice = p1.getPrice();
        System.out.println("iphonePrice = " + iphonePrice);
    }
}

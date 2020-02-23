package day42;

public class Computer {
    //Attributes ;
    private String brand ;
    private int ram ;
   private double price ;

    //add getters and setters to all the fields !

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram > 1 && ram < 128) {
            this.ram = ram;
        }
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 20) {
            this.price = price;
        }
    }
    //behaviours
    public void  runProgram(){
        System.out.println(this.brand + " is running program with the size of " +ram );

    }
    public void calculate(){
        System.out.println(brand + " is calculating");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}

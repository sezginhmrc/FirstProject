package day45;

public class Phone extends Electronic{

    //Sub class inherit visible(visible is about acces modifier instance field and static field
    //Sub class inherit every visible instance method and static method from Electronic



    //String brand ;
    // static boolean useElectiricity = true ;

    double size ;
    double price ;

    // Bad idea to have main here
    // but We are doing it anyway for less screen to look at
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.size = 20.0 ;
        p1.price = 399 ;
        p1.showBrand(); // since not initialized it is null
        p1.brand = "Apple";
        p1.showBrand();
        p1.version = 2.4 ;
        System.out.println("p1 = " + p1);


        System.out.println(Electronic.useElectrictiy);
        System.out.println(Phone.useElectrictiy);

        // directly accesing the static field of same class in static method
        System.out.println(useElectrictiy);
        displayUseElectricity();

    }

    @Override
    public String toString() {
        return "Phone{" +
                "size=" + size +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", version=" + version +
                '}';
    }
}

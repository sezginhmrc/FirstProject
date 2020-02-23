package day42;

public class VirtualMachine {

    public static void main(String[] args) {

        // we created an empty Computer object  nothing initialized in instance field.

        Computer c1 = new Computer();
        // Modifiyin attributes (objest from instance field) they are private they cannot be modified here directly
        c1.setBrand("Macbook"); // i set the brand
      //   System.out.println("c1 = " + c1.toString()); // now only modified brand other datas will be  their default values
      //  System.out.println(c1.getBrand());
        c1.setPrice(2000); // i set the price here
        c1.setRam(32); // i set the ram here


        c1.runProgram(); // printed the instance method from instance field
        c1.calculate(); // printed the instance method from instance field

        c1.setPrice(500); // changed the value of object
        c1.setRam(1000); // this is invalid input !! ram range should be between 1-128 methods says so :)
        System.out.println("c1 = " +c1);

        int myRam = c1.getRam();
        System.out.println("myRam = " + myRam); // ram is still 32


        // another reference variable created here
        Computer c2 = new Computer();
        c2.setBrand("HP");

        // set HP Price to half of Macbook price
        c2.setPrice(c1.getPrice() / 2);
        // set HP ram to quarter of apple ram
        c2.setRam(myRam / 4);
        System.out.println("c2 = " + c2);
    }
}

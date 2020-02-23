package day42;

public class BikeActions {
    public static void main(String[] args) {

        Bike b1 = new Bike("abc");
        Bike b2 = new Bike(); // used to cons without parameter and its gear is 1

        // i dont want empty gear when object is created
        // i want to the bike come with gear set to 1

        System.out.println("b1.gear = " + b1.gear);
        System.out.println("b2.gear = " + b2.gear);

        // i want to be able to set the default get to
        // any number i specify when is being created
        Bike b3 = new Bike(3);
        System.out.println("b3.gear = " + b3.gear);

        // i want to be able to set two variables in once
        Bike b4 = new Bike(55,4);
        System.out.println("b4.gear = " + b4.gear);
        System.out.println("b4.speed = " + b4.speed);


    }
}

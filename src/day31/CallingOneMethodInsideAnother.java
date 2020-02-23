package day31;

public class CallingOneMethodInsideAnother {

    public static void main(String[] args) {

        // i want to combined these two actions and create another method called finallyAwake !!
        // and in order to print it, We write the new method inside Main Method


        finallyAwake();


    }
    public static void finallyAwake(){

        wakeup();
        drinkCoffee();
        // this is static WAY !!!!!!!
    }


    public  static  void wakeup(){

        System.out.println("Open your eye,only one");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm ? open it again!");
        System.out.println("------------");
    }

    public  static void drinkCoffee(){

        System.out.println("Put coffe in your coffe machine");
        System.out.println("Press the button make your coffe");
        System.out.println("------------");
    }

}

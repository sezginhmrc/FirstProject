package day43;

public class StarbucksUtil {

    public static void main(String[] args) {
        // non static is A type need to create object
        // NON STATIC IS IN INSTANCE

/*
        String myString = new String("Hello");
        printStringInfo(myString);*/

        Coffee c = new Coffee("Blonde",5,1.6);
        printCoffeInfo(c);
        // this method expecting a coffee object
        // we use the coffe type.. and used coffe's object
        // if it was String type we would be usinng the String object
        // HERE WE ARE USING OUR TYPE OUR METHODS !!

        Coffee c1 = new Coffee();
        printCoffeInfo(c1);
        printCoffeInfo(new Coffee("turkish",10));


        // if the method was non static we would need to create an object
        // to call that method (printCoffeInfo) like below
       /*
        StarbucksUtil util = new StarbucksUtil();
        util.printCoffeeInfo();
*/

    }
   /* // this is String method we have been doing so far since the beginning
    // just to show an example :)
    public static void printStringInfo(String str){
        System.out.println("first char is = " + str.charAt(0));
        System.out.println("last char is = " + str.charAt(str.length()-1));
    }
*/

    // create a static method to accept a coffee object and print it's  information
    // like this : This coffee is : name, price is : price , caffeine level is level,
    public static void printCoffeInfo(Coffee co){
        System.out.println("this coffe is = " + co.getType());
        System.out.println("price is = " + co.getPrice());
        System.out.println("caffeine level = " + co.getCaffeineLevel());
        // (this is our first static method with our costum object )
        // we used the static keyword that we can call them directly
    }
}

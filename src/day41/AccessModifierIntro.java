package day41;

import day40.BankAccount;

public class AccessModifierIntro {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount() ;
        b1.showAccountBalance();

        // you can acces this method at day40 here because is public
        // What is access modifier >
        // if there is no access modifier
        // in front of method or field
        // it means it has default access modifier

         //   b1.balance = 1000;
        // i switched the double balance to public at day40
        // and you can access here
        // public is a key to open it

        // access modifier can bu  used for fields and methods, there are 4 of them
        // currently we care about of 3;
            // public --->  accessible anywhere
            // default -->> accessible only within the same package
            // private -->> accessible only within in same class
            // our topic is private here :)

        Person p1 = new Person();
        // at here i can't use the attributes here because they are private only accessible in same class
       // p1.name = "Sezgin";
      //  p1.age = 25 ;
      //  p1.ssn = 12345678 ;*/
        // we set them by getter and setter
       p1.setAll("Sezgin",26,123456);
        System.out.println(p1);
        System.out.println(p1.getName());
        p1.setName("Emma");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        p1.setAge(32);
        System.out.println(p1.getAge());
        
        int emmaAge = p1.getAge();
        System.out.println("emmaAge = " + emmaAge);

        System.out.println("p1 = " + p1);

        p1.eat();





    }
}

package day45;



public class Dog extends Animal {


    public void speak(){
        // super. can be used to specify to super class version off the method
    //   super.speak();
       // super.speak();
        System.out.println("BARK!!!");
        // Dog has its own uniques speaking method
        // reusable code
    }

    public static void main(String[] args) {

        Dog twix = new Dog ();
      twix.speak();
       Animal a = new Dog();
       a.speak();
       Animal a1 = new Animal();
       a1.speak();



    }
}

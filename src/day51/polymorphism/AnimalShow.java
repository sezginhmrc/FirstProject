package day51.polymorphism;



public class AnimalShow {
    public static void main(String[] args) {

        Animal a1 = new Dog();
                a1.makeNoise();
// here Wea re just reasiggin a1 to different object
               a1 = new Horse();
               a1.makeNoise();

               Animal a2 = new Horse();
               a2.makeNoise();

               Dog d1 = new Dog();
               Animal a3 = d1 ;



    }
}

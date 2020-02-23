package day54;

public abstract class Animal {

    public abstract void speak();
    // only animal type speak (Dog, cat, lion,)
}

class Dog extends Animal implements IndoorPet{
    String name ;

    @Override
    public void speak() {
        System.out.println("BARK");
    }

    @Override
    public void play() {
        System.out.println("Running after the ball");
    }
}
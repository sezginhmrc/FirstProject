package day51.polymorphism;

public  abstract class Animal {


    public  abstract void makeNoise ();
}
// i can add more classes as long as only one class is public and name is Animal

class Dog extends Animal{

    public void makeNoise(){
        System.out.println("WOOFFF");
    }
}

class Horse extends Animal {

    public void makeNoise(){
        System.out.println("NEINEINEI");
    }
}
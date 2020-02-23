package day49;

// we are buliding super- sub realationshio
// a class can only extends one other class
// class cannot extend multiple class !
// opposite for interface a class can have multiple interfaces
// a class can implements  multiple interfaces
// I can have implement two interface
// like at this class
// i did implement two interface at this class

public class Burger implements Edible, Juicy{

    public void eat(){
        System.out.println("Eating burger");
    }
    public void drink(){
        System.out.println("drink the juice of nusret burhers");
    }
    public void melt(){ System.out.println("Burger is juicy from Interface Juicy");
// We have default method in interface
// it has its own implemantation
// we dont have to implement here

    }
}

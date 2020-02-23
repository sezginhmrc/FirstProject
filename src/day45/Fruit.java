package day45;

public class Fruit {
    // this is super class


    // ALWAYS ADD NO ARG CONSTRUCTOR IN SUPER CLASS
    // TO AVOID UNNECESSARY ERROR OF SUB CLAS CALLING


    // SUPER CLASS'S NO ARG CONSTRUCTOR
   public Fruit(){
        System.out.println("No Arg Fruit constructor");
    }
    public Fruit(String str ){
        System.out.println("One Arg constructor");
    }
}

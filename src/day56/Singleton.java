package day56;


// Sometimes we want to make a class that only generate single object
// thorough the entire application

//Constructor should be private
//Declare a static variable object of the class
//Declare a static method to return the instance

public class Singleton {
    // main idea is Singleton class can only have one object
    // Static makes unique objects

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        } else {
            System.out.println("We already have this object");
        }
        return instance;

    }
    private Singleton() {
            System.out.println("No arg cons being called !");
        }
    }

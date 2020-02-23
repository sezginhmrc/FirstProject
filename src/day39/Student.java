package day39;


// any time you create a class, it will become a blue print for object
// and this class type can be type for variable
// for example String has it is own class so we can create a string variable
// in here student become a blue print creating student object
// and any student object has 3 attributes defined by instance field

import day44.CyberHouse;

public class Student {
    // this class is student templed

    // this part of class called instance field|variable

    String name ;
    static int age ;
    char gender ;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public static void main(String[] args) {


        System.out.println("age is = " +age);
        // i am able to access this variable here without object beacuse it is static !
    }

}


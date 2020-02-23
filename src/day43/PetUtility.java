package day43;

import day42.Movie;
import day44.Person;

public class PetUtility {

    public static void main(String[] args) {

        Pet p1 = new Pet("cat", "cutie");
        Pet p2 = new Pet("bird", "green");
        Pet p3 = new Pet("dog", "cesur");

        printPetInformation(p1);
        printShorterPetName(p1, p2);
        printNameIfTypeDog(p1);
        printNameIfTypeDog(p3);
        Boolean result = isPetNameCat(p1);
        System.out.println(result);
        Boolean result1 = isPetNameCat(p2);
        System.out.println(result1);

    }

    public static void printPetInformation(Pet petObj) {
        System.out.println("The type of pet " + petObj.getType() +
                " name of the pet is " + petObj.getName());
    }

    public static void printShorterPetName(Pet petObj, Pet petObj1) {
        if (petObj.getName().length() < petObj.getName().length()) {
            System.out.println("shorter pet name is " + petObj.getName());
        } else {
            System.out.println("shoerter pet name is " + petObj.getName());
        }
    }

    public static Boolean isPetNameCat(Pet petObj) {
        if (petObj.getType().equalsIgnoreCase("cat")) {
            return true;
        } else {
            return false;
        }
    }

    public static void printNameIfTypeDog(Pet petObj) {
        if (petObj.getType().equalsIgnoreCase("dog")) {
            System.out.println(petObj.getName());
        }
    }


}




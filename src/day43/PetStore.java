package day43;
import java.util.*;
public class PetStore {

    public static void main(String[] args) {
        //create another class called PetStore with main method
        //	Create 8 Pet objects with initial value
        //	Store them into a List<Pet>
        //	1, print out all info
        //	2, print out only name
        //	3, print out only cats
        Pet p1 = new Pet();
        System.out.println("p1 = " + p1);
        p1.speak();
        p1.setType("cow");
        p1.speak();
        Pet p123 = new Pet("es","Se");
        
        Pet p2 = new Pet("dog","Cesur");
        Pet p3 = new Pet("Cat","Boncuk");
        Pet p4 = new Pet("cow","Kuzu");
        Pet p5 = new Pet("horse","Kinali");

        //1
        List<Pet> myPets = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));
        System.out.println("myPets = " + myPets);

        //2
        for (Pet each : myPets){
            System.out.println("\"each.getName\" = " + each.getName());
        }
        //3
        for (Pet each : myPets){
            if(each.getType().equalsIgnoreCase("cat")){
                System.out.println("cats = " +each.getName());
            }
        }






    }
}

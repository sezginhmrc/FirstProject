package day43;

public class PetStatic {

    public static void main(String[] args) {

     Pet.showGeneralPetInfo();

     // DOESN'T WORK
     // Pet.getName();
     Pet p1 = new Pet("cat","pasha");
        System.out.println(p1.getName());
        p1.speak();




    }
}

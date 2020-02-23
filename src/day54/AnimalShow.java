package day54;

public class AnimalShow {

    public static void main(String[] args) {

        //Dog  IS-A dog
        // Dog  IS-A animal
        // Dog  IS-A object
        // Dog IS-A Indoorpet

        //refer a dog object as a dog
        // it can do everything a dog can do (including Animal, IndoorPert stuf)
        Dog d1 = new Dog();
        d1.speak();
        d1.play();

        // refer a dog object as a animal
        // it can do only those thing Animal can do
        // only the speak ;
        Animal a1 = d1 ;
        a1.speak();


        Object o1 = d1 ;
        // o1.speak() ; //  We Can't do like that !
        // Compile only check it such method exists in reference type

        IndoorPet i1 = d1 ;
        i1.play();
    }
}

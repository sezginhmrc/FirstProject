package day44;

public class PersonAction {

    public static void main(String[] args) {

        Person.showInfo();

       Person p1 = new Person("John Snow",27);
       // Person p3 = new Person();
        // this p3 gives an error because we dont have no arg constructor
        p1.species = "Human" ;
        System.out.println("p1 = " + p1);
        Person p2 = new Person("Arya Stark",18);
        p2.species = "Humanoid" ;
        System.out.println("p2 = " + p2);
         
        Person p3 = new Person("Dani",25);
        System.out.println("p3 = " + p3);

        // what is the correct way to acces static memeber of the class : STATIC WAY
        System.out.println("Person,species = " +Person.species);

        Person p4 = new Person("Sezgin",26);
        System.out.println("p4.getName() = " + p4.getName());
        System.out.println("p4.getAge() = " + p4.getAge());
        System.out.println("p4.species = " + p4.species);
        p4.showInfo();// directly call

    }
}

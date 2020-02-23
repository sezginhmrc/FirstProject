package day48;

public class Plane  implements Flyable {

    // We build realationship between class and interface
    // using IMPLEMENTS keyword (compared to extends keyword for class
    // same logic like abstract
    // IS-A relationship
    // Since we are inheriting an abstract method
    // We need to provide body by overriding it

    String name ;
    int capacity ;
    double speed ;

    @Override
    public void fly (){
        System.out.println("Plane is flying");
    }

    public static void main(String[] args) {

        Plane p1 = new Plane();
        p1.fly();
        System.out.println(Plane.HAVE_WING);

    }

}

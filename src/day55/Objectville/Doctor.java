package day55.Objectville;

public class Doctor extends Person  implements Motorcylist{

    @Override
    void eat() {
        System.out.println("Dc. Foo is eating");
    }

    @Override
    void sleep() {
        System.out.println("Dc. Foo is sleeping");
    }

     public void  ride (){
         System.out.println("Dc . Foo is riding motorcylist ");
    }
    public void doOperation(){
        System.out.println("Dc Foo is doing operation ");
    }


    public static void main(String[] args) {

        // Doctor foo is as a Doctor can do everything a Person Doctor Motorcyclist can do
        // One object can be taken on many forms..
        Doctor f = new Doctor();
        f.eat();
        f.doOperation();
        f.ride();
        f.sleep();

        System.out.println("-");

        Motorcylist f1 = new Doctor();
        f1.ride();

        ((Doctor)f1).sleep();
        ((Doctor)f1).eat();
        ((Doctor)f1).doOperation();

        System.out.println("-");
        Person f2 = new Doctor();
        f2.eat();
        f2.sleep();

        ((Doctor)f2).doOperation();
        ((Doctor)f2).ride();

    }
}

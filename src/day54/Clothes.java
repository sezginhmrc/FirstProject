package day54;

public class Clothes implements Wearable {

    int size ;

    @Override
    public void wear() {
        System.out.println("Wearing Clothes!!");
    }

    public static void main(String[] args) {

        // TRY OUT ALL THE POLYMORPHIC ASSIGNMENT

        // Reference type can  be own type
        Clothes c1 = new Clothes ();
        // Reference type can be super class
        Wearable w1 = new Clothes();
        // Reference type can be object who is super class for all of classes
        Object o1 = new Clothes();

        //------------
        Watch wa = new Watch();
        Wearable w2 = new Watch();
        Object o2 = new Watch() ;
        //----
        Perfume p1 = new Perfume() ;
        Wearable w3 = new Perfume();
        Cosmetics c3 = new Perfume();
        Object o3 = new Perfume() ;

        MakeUp m1 = new MakeUp();
        Wearable m2 = new MakeUp();
        Cosmetics m3 = new MakeUp();
        Object o4 = new MakeUp();

    }

}
class Watch implements Wearable{
    @Override
    public void wear() {
        System.out.println("Wearing Watches!!");
    }
}
class Perfume implements  Wearable,Cosmetics{
    @Override
    public void wear() {
        System.out.println("Wearing Perfumes!!");
    }
    public void smell(){
        System.out.println("Smelling Perfume");
    }
}
class MakeUp implements Wearable,Cosmetics{
    @Override
    public void wear() {
        System.out.println("Wearing Makeups!!");
    }
    public void smell(){
        System.out.println("Makeup Smells like perfume");
    }
}

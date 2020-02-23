package day48;

public class Lion  extends Mamals {

    // this class is subclass of Super Class Mammals
// This is grandchild ->Lion
    // Mother is       -> Mamal
    // Grandmother  is -> Animal

    //Animal -> Mamal > Lion



    // this coming from mother
    public void drinkMilk(){
        System.out.println("LIONS DRINK MILK");
    }

    // this coming from GrandMother
    public void makeNoise(){
        System.out.println("LIONS SOUNDS LIKE ROARRRRR");
    }

    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        Animal a1 = new Lion();
        a1.makeNoise();

        Mamals m1 = new Lion() ;
        m1.drinkMilk();
        m1.makeNoise();
        

    }
}

package day48;

public class BouncibleParty  {

    public static void main(String[] args) {

        Kangaroo k1 = new Kangaroo("Coco",10);
        System.out.println("k1 = " + k1);
        k1.bounce();
        k1.eat();
        k1.kickBox();




        Ball b2 = new Ball("Round","Blue");
        System.out.println("b2 = " + b2);
        b2.bounce();

        System.out.println(Bouncible.gravity);

        // Data type bouncible
        Bouncible b1 = new Kangaroo("Toto",6);
        System.out.println("b1 = " + b1);
        b1.bounce();


        // Data type  BoxerWith..
        BoxerWithTheBellyPounch kangaro = new Kangaroo("Kako",4);
        kangaro.carryChildInThePockect();
        kangaro.kickBox();



    }
}

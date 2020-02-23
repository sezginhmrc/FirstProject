package day54;

import java.util.Arrays;
import java.util.List;

public class Utility {



    public static void main(String[] args) {


       // Reference type // Actual object
        Wearable w1 = new Clothes();
        wearMyWerable(w1);
        Wearable w2 = new Watch() ;
        wearMyWerable(w2);

        wearMyWerable(new Watch()); // i can also create object here

        Cosmetics w3 = new Perfume();
        cosmeticStuff(w3);
        Cosmetics w4 = new MakeUp();
        cosmeticStuff(w4);

        System.out.println("---");
        Wearable result = getMyWearableObject();
        result.wear();

        System.out.println(getMyString());

        // this is polymorphism
        // super type is Interface
        // Actual class implementing and designing the system
        //
        Wearable w11 = new Clothes() ;
        Wearable w22 = new MakeUp();
        Wearable w33 = new Watch();
        Wearable w44 = new Perfume();

        List<Wearable> myList = Arrays.asList(w11,w22,w33,w44);
        for (Wearable each : myList){
            each.wear();
        }
    }
    public static String getMyString(){

        return new String ("Bla bla");
    }


    // create a static method
    // we just take it can use it -?STATIC
    public static void wearMyWerable (Wearable any){
        any.wear();
    }
    public static void cosmeticStuff( Cosmetics any){
        any.smell();
    }
    public static Wearable getMyWearableObject(){
        return  new Clothes();
        // return new Watch();
        // return new Perfume();
        // return new makeUp
       // those will work because they are Wearable
    }


}

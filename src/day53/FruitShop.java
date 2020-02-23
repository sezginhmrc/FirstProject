package day53;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {

    public static void main(String[] args) {

        // POLYMORHISM

        Apple a1 = new Apple("Sweet","red","Fuji");

        // What Can i acces using reference varaible a1
        // a1 has Apple as refernce type , So we can acces anything inside apple
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.type = " + a1.type);
        System.out.println(a1);
        a1.getDigested();
        // NO POLYMORHISM YET SO FAR HRE !!



        System.out.println("------");

        Fruit f1 = a1 ; //"Sweet","red","Fuji" // idea is my fav number is your fav num
        System.out.println(f1);

        f1.getDigested();  // new Apple("sweet,"reed","Fuji).getDgiest()
        // it works comile see it in fruit class
        // Complie only care Do you have it ?

        // We reasiggnes our variable here !
        f1 = new Orange("Sour-sweet","redish",11);
        f1.getDigested();
        // Only Reference Type Decide what you can acces at compile time
        // if you have fruit as reference type, the getDigested method will point
        // to one under Fruit class
        // Since actual object is Apple | Orange ,
        // at run time it will call overriden version of the method
        // and that's the power of polymorhisim
        // makin correct decision at run time
        System.out.println(f1.toString());
        // late binding !

        //Fruit is reference type , Apple is actual object type
        Fruit f2 = new Apple("crispy","Hot red","Gala");
        Fruit f3 = new Orange("sour","orange",12);
        Fruit f4 = new Orange("very sweet", "Blood red", 10);

        Fruit [] myFruit = {f1,f2,f3,f4};
        for(Fruit each : myFruit){
            each.getDigested(); /// Burayi iyi anla !!
        }

        // in this way it is not resiazale | adding removing will not work
        List<Fruit> fruitsList = Arrays.asList(f1,f2,f3,f4);

        // this is changeable
        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1,f2,f3,f4));

        for (Fruit each : fruitList){
            System.out.println("each.toString() = " + each.toString());
            System.out.println("each.getClass().getSimpleName() = " + each.getClass().getSimpleName());
        }


    }
}

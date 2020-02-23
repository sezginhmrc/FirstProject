package day49;

public class IceCream extends Object implements Edible, Juicy {
    // I can do icecream class sub class of object super class
    // i can also implement Icecream class of edible interface
    // i must implement interface methods here otherwise it gives an error
    // Explaning line 3..

    public void eat (){
        System.out.println("eat with spon!!");
    }
    public void drink(){
        System.out.println("drink if it has melted in the cup");
    }
 //   public void digest(){
   //     System.out.println("Digesting ice cream by eating slowly");
    //}
    public void melt(){

    }

    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        i1.digest();
        // we can call the deafult method without overridden
        Juicy.squeeze();
        // we cacn call the Static method in static way here witout overridden
        System.out.println(i1.toString());
    }

}

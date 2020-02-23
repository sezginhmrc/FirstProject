package day48;

public class Kangaroo implements Bouncible , BoxerWithTheBellyPounch {


    String name ;
    int jumpDistance ;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }


    @Override
    public void bounce (){
        System.out.println("This " + name + " can jump " + jumpDistance
                + " meters forward and it would be nice to have " + gravity + " gravity");
    }

    public void eat (){
        System.out.println("Kangora " + name + " is eating");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    // those methods from  BoxerWtihTheBellyPoubch class
     // only can be called by its own type with kangaro reference
    public void kickBox(){
        System.out.println("Kangoro with name = " + name + " is boxing");
    }
    public void carryChildInThePockect(){
        System.out.println("Kangoro with name = " + name + " carry child in the pocket");
    }
}

package day41;

public class TvStore {

    public static void main(String[] args) {
        //String name ;
        //    boolean isOn ;
        //    int currentChannel ;
        TV t1 = new TV() ;
        t1.name = "Sonny"; // we only assigned the name attribute.
        System.out.println(t1); // if you print like this without toString you get a hasCode
        
        t1.turnOn(); // default value of boolean false shows up :)
          t1.setCurrentChannel(12);
        t1.setCurrentChannel(123);
        System.out.println("Current channel is = " + t1.getCurrentChannel());
        t1.turnOff();
        t1.turnOff();
        System.out.println(t1.toString());
    }
}


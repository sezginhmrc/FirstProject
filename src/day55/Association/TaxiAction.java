package day55.Association;

import day55.Association.Driver;
import day55.Association.Engine;
import day55.Association.Taxi;

public class TaxiAction {

    public static void main(String[] args) {


        Taxi yellow = new Taxi(111,new Engine("Horse",2),new Driver("Sezgin",6314234));
        System.out.println("yellow = " + yellow);


        Engine en = new Engine("v8",2000);
        Driver d = new Driver("Sezgin",123);
        Taxi t = new Taxi(688,en,d);
        System.out.println(t);


       //   Taxi t1 = new Taxi(688,new Engine("Hbyrid",2));
       // System.out.println(t1);

        // THIS IS HAS A RELATIONSHIP
        // ASSOCIATION one type to another type put as a instante variable

        Engine e1 = new Engine("V6",2000);
        Driver d1 = new Driver("Sezgin",101);
      /*  System.out.println(d1.name.charAt(0));
        System.out.println(d1.name.substring(0,3));
        System.out.println(e1.type.toUpperCase().startsWith("V"));*/
        // We can use it in this way

   //Reference type = our object contains two tpyes which we created .

        Taxi t1 = new Taxi(123,e1,d1) ;
        System.out.println(t1);

        System.out.println("t1.getPlateNumber() = " + t1.getPlateNumber());
        System.out.println("\nt1.getD() = " + t1.getD());

        Taxi t2 = new Taxi(688,
                new Engine("V8",2),
                new Driver("Sezgin",101));
        System.out.println(t2);


        // print out driver name and car horse power
       /* System.out.println( t2.d.name.charAt(0));
        System.out.println(t2.eng.horsePower);
        System.out.println(t2.d.driverId);
*/
        // How do I store the t2 plate number in a variable x ;
      //  System.out.println("t2.d.name = " + t2.d.name);
       // System.out.println("t2.eng.horsePower = " + t2.eng.horsePower);
        // since datas hidden i can not direclty acces datas from outside of class !!

        int x = t2.getPlateNumber();
        System.out.println(x);

        String name = t2.getD().name;
        System.out.println("\n"+name);

        String engineType = t2.getEng().type;
        System.out.println(engineType);

        // How do i store the t2 driver field in a variable y ;
        Driver y =t2.getD() ;
        System.out.println(y);
        // How  do i store the t2 Engine field in a variable z ;
        Engine z = t2.getEng();
        System.out.println(z);

        System.out.println();
        System.out.println(t2.getD().name+" was driving the taxi with hourse power "+t2.getEng().horsePower+
                " on the highway and When cop pulled over the " +t2.getD().name+" He asked for driver id which is "+t2.getD().driverId   );

    }
}

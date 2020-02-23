package day40;
import java.util.*;

public class HotMarketActions {
    public static void main(String[] args) {

        // We created an offer object (c1)

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();
        // we don't type by one one We created this method inside instance method
      // o1.changeAllInfo("NY","GI",120000,true);

        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 100000;
        o2.isFullTime = true;
        o2.displayInformation();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.displayInformation();


        Offer o4 = new Offer();
        // if we don't assign values for instance filed|variable
        // we get default value
        // for primitive numbers : 0 or 0.0
        // boolean : false
        // char    : ''
        // for any reference types : (string and o4 )
        // null
        o4.displayInformation();

        // UPDATED VALUES

        // add 2k to amazon offer
        // o3.salary = 96000+2000
        // o3.salary += 2000 ;
        o3.salary = o3.salary + 2000;
        System.out.println("New Amazon salary = " +o3.salary);

        // set the salary value of o4 offer object to sum of all the offer
        o4.salary = o1.salary + o2.salary + o3.salary ;

        o4.displayInformation();
        o4.turnToFullTime();
        o4.changeLocation("New Jersey"); // you need display to print it
        o4.displayInformation();





        // creating ArrayList of Offer to store multiple offer objects
        //List<Offer> myOffers = new ArrayList<>();

        // <OFFER> is variable here We using our custom data type her e !
        ArrayList<Offer> myOffers = new ArrayList<>();
        //               listName
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);
        System.out.println("myOffers = " + myOffers);
        // this printing it works here because we toString method in instance field
        // other wise hascode shows up !!



        System.out.println("\n----------myOffers ----------");
        // We go over each and every offer
        // Variable name
        for (   Offer   each : myOffers) {  // each is each objects o1,o2,o3,o4

            each.displayInformation();

        }
        System.out.println("\nmyOffers--------for loop-----");

        for (int i = 0; i <myOffers.size() ; i++) {
            // store each item to a variable each
            Offer each = myOffers.get(i); // using our custom data type here
            each.displayInformation();
            // This is the one shot version
            //myOffers.get(x).displayInformation();
        }


        System.out.println("-----");
        // call the methods here
        o1.displayInformation();
        o1.turnToFullTime();
        o1.changeLocation("DC");
        o1.displayInformation();
        o1.changeAllInfo("New york","GI",120000,true);
    //    o1.displayInformation();
        o4.changeAllInfo("Massachusetts","Amazon",110000,false);
  //      o4.displayInformation();


    }

}

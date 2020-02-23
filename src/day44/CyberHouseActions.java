package day44;

public class CyberHouseActions {

    public static void main(String[] args) {


        CyberHouse.setNeighbourName("Cybertek ave");
        // this is static method and being called without object and initialized by static method in here
        // Logically We use the static variable for the property that is common to all objects,
        // For example, in the neighborhood all the houses belong to one neighborhood name
        // Which is called "Cybertek ave".
        CyberHouse.showNeighbourName();
        // Here i already set the  my neighborhood name and printed

        CyberHouse.setNeighbourName("Park st");
        // Here i changed my neighborhood name by using the static method
        // rest of program will run with this neighbour Name.

        CyberHouse.showNeighbourName();
        // after changing my neighborhood name printed

        // i directly set the neighbour name
        CyberHouse.neighbourName = "Cybertek ave" ;

        // If i would have initialized my Static variable in the static field, and not created the static method
        // i couldn't change it here it would ne one neighborhood name
        // once you call that  method by initializying at the static field all objects belong
        // to the value what i initialized

        // i can directly call the static method in here
        CyberHouse.showNeighbourName();
        // static method belong to the class
        // logically same neighbourhoodName for all houses..

        // Here i created an object by using constructor
        // Now I can use my instance fields and instance methods
        // since it is about object
        CyberHouse c1 = new CyberHouse("Vintage",101);
        // Instance method belongs to the object !
        c1.showAllInfo();
        CyberHouse c2 = new CyberHouse("Classics",102);
        c2.showAllInfo();
        CyberHouse c3 = new CyberHouse("Modern",292);
        c3.showAllInfo();


        // we can access the static field here directly
        System.out.println("CyberHouse.neighbourName = " + CyberHouse.neighbourName);
        // if it was private it would be only accessible inside same class


        // How do i get max value of short ?
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // How do i get neighbourName of this class ?
        // almost same logic
        // IT IS ABOUT STATIC KEYWORD
        System.out.println(CyberHouse.neighbourName);
        CyberHouse.showNeighbourName();
    }
}

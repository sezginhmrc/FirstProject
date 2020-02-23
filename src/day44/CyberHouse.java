package day44;
public class CyberHouse {

    // INSTANCE FIELD EACH OBJECT BELONG OBJECT
    // STATIC EACH OBJECT BELONG TO CLASS (can be called with className
    // WHERE CAN I ACCESS STATIC FIELD ?
    // INSIDE INSTANCE METHOD
    // INSIDE STATIC METHOD,
    // INSIDE MY CONSTRUCTOR
    // INSIDE CLASS,
    // STATIC METHOD CAN ONLY ACCESS BY STATIC MEMBERS OF SAME CLASS

    // I have two Attributes for This CyberHouse Class
    // This is Instance Field
    String design ;
    int houseNum ;



    // This is Static fieldC
    // It is a Static variable without initialized
     static String neighbourName ; // or = "Cybertek Ave" ;

     // I created this Static method to  initialize my Static variable
    // i can also directly initialize above
    // main point of creating this method i can change my Static variable by calling
    // This is setter for the Static Variable
    // i can only access static members of the class
     static void setNeighbourName(String name) {
        neighbourName = name;
        // i can not use the this keyword inside static
    }



    // STATIC METHOD can only access static members of the class
    // which is only String neighbourName !!!
    static void showNeighbourName(){
        System.out.println("neighbourName = " + neighbourName);
        // CAN NOT ACCESS ANYTHING NON-STATIC INSIDE STATIC METHODS
        // for example System.out.println("HouseNum = " + houseNum) // gives an error
    }


    // CONSTRUCTOR CAN ACCESS  ANYTHING
    // (instance field instance method, static field ,static method)
    public CyberHouse(String design, int houseNum) {
        this.design = design;
        this.houseNum = houseNum;

    }
    // INSTANCE METHOD CAN ACCESS  ANYTHING
    public void showAllInfo(){
        System.out.println("house number : " +this.houseNum +
                ", designing : " +this.design+
                ", neightbourName : " + neighbourName);
                // We can add our static field inside instance method
    }

    public String toString() {
        return "CyberHouse{" +
                "design='" + design + '\'' +
                ", houseNum=" + houseNum +
                '}';
    }
}

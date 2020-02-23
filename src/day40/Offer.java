package day40;

public class Offer {
//Create Offer class with
//instance fields :
//location, company, salary , isFullTime
//instance methods :
//displayOfferDetails -- print all info about offers
//Create 5 offer objects with your ideal offers with all details , call displayOfferDetails method on each of them
//Optionally : @channel
//Store them into List<Offer> then call the method.
//Optionally :
//Add 5000 to each offers less than 100K

    String location;
    String company;
    long salary ;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information about Offer object
     * no parameter and no return type
     */
    // inside instance method we can directly access instance variable
    // all behaviours we need an object to behaviour object is offer
    public void displayInformation() {

        System.out.println("Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime);

    }
    // DO NOT CREATE A METHOD INSIDE ANOTHER METHOD EVER !

    // write a method called turnToFullTime (boolean)
    public void turnToFullTime(){
        if(isFullTime=false){
            isFullTime= true;
            } else {
            System.out.println("ALREADY FULLTIME");
        }
    }

    // write a method to change the location of the offer
    // to the location user passed
    // instance method  1 parameter ne return !
        public void changeLocation(String newLocation){
        location = newLocation ;
        }

        //write a method to accept 4 parameter to change all info
        public void changeAllInfo ( String newLocation, String newCompany, long newSalary, boolean newFullTime) {
            location = newLocation;
            company = newCompany;
            salary = newSalary;
            isFullTime = newFullTime;
            displayInformation(); // i can add this method here
            // an instance method can call another instance method
            // an instance method can use any instance field
            // this is dry principle

        }

        // write a method to check the offer belong to 100k
    public boolean is100KOffer(){ // checking offer is over 100 // return a value
        return salary>=100000; // it return a value
    }

    @Override
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';

        // this is special method come from Java
        // with this special method you can print the object directly
        // same idea you can directly print ArrayList (toString automatically)
        // without his method your object will be hasCode d#$!#%T%GWRFSD :)

    }



}

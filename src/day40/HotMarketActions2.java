package day40;

public class HotMarketActions2 {
    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.location = "Austin";
        o1.company = "Apple";
        o1.isFullTime = true;
        o1.salary = 140000;

        o1.displayInformation();
        o1.turnToFullTime();
        o1.changeLocation("Connecticut");
        o1.displayInformation(); // this this method in order to print it
        o1.changeAllInfo("New york","Google",120000,true);

        // if this guy earn more than 100k
        // move him to Atlanta
        boolean result =o1.is100KOffer();
        if(result==true){
            o1.changeLocation("Atlanta");
        }
    o1.displayInformation();





    }
}

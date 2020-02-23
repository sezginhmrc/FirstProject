package day40;

public class HotMarketAction3 {
    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;

      //  o1.displayInformation();


        // System.out.println("o1Str = " + o1Str);
        //   String o1Str = o1.toString();
        System.out.println(o1.toString());
        System.out.println(o1);

        // you can only print here when you have toString method
        // String toString  method inside offer object

    }
}

package day10;

public class SeasonAtion {
    public static void main(String[] args) {
        //what do you do in each season
        // spring -->> Hike, Easter , Navruz , Blossom
        // Summer -->> Swim , Vacation , BBQ , Holiday
        // fall   -->> Black Friday , Hiking, Harvest ,Halloween , Shopping
        // winter -->> Snowboarding , Ski , Christmast , New year

        String season = "summer" ;

        switch (season){
            case "Fall" :
                System.out.println(" Black Friday, Hiking, Harvest , Halloween, Shopping ");
                break ;
            case "Spring" :
                System.out.println("Hike, Easter, Navruz, Blossom");
                break ;
            case "summer" :
                System.out.println("Swim, Vacation,BBQ, Holiday");
                break ;
            case "winter" :
                System.out.println("Snowboarding, Ski, Christmast, New year");
                break;
            default:
                System.out.println("INVALID OPERATOR");
        }

    }
}

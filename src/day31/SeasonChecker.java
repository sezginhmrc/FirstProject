package day31;

public class SeasonChecker {

    /*
    write a static method called decideSeasionAction
    * It has one String parameter called season
     * Inside method method :
     * according to what user passed it should print correct action
     */

    public static void decideSeasonAction(String season){

        switch (season){
            case"Spring":
                System.out.println("Hiking");
                break;
            case"Summer":
                System.out.println("Swimming");
                break;
            case"Fall":
                System.out.println("chilling");
                break;
            case"Winter":
                System.out.println("Coding");
                break;
            default:
                System.out.println("Invalid Season");
        }
    }


    public static void main(String[] args) {

    decideSeasonAction("Summer");
    decideSeasonAction("Winter");
    }

}

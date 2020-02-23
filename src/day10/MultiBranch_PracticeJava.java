package day10;

public class MultiBranch_PracticeJava {

    public static void main(String[] args) {

        // 11,Burger
        // 5 , French Fries
        // 8, Nuggets
        // 35, Ice Cream
        String order = "" ;
        int itemNumber = 11 ;
        // what data type of variable I can use for switch ? -->> BYTE, SHORT,  INT , CHART , STRING
        switch (itemNumber) {

            case 11 :

                System.out.println("you have selected 11");
                order = "Burger" ;
                break ; // if you dont put this break here your complier will run on next statement which is 5 !!

            case 5 :
                System.out.println("You have selected 5");
                order = "French Fry";
                break;
            case 8 :
                System.out.println("You have selected 8");
                order = "Nuggets";
                break;
            case 35 :
                System.out.println("You have selected 35");
                System.out.println("YAY!!! YUM!!! ");
                System.out.println("ENJOY!!!! ");
                order = "Ice Cream";
                break;
            default:
                System.out.println("YOU HAVE SELECTED Unknown ITEM NUMBER@!!");
                order = "Unknown" ;
                break;
        }
        System.out.println("Your order is " + order);



    }
}

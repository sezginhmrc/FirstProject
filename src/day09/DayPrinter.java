package day09;

public class DayPrinter {
    public static void main(String[] args) {
        /* if the daycode is 1 -> Monday
           if the daycode is 2 -> Tuesday
           if the daycode is 3 -> Wednesday
           if the daycode is 4 -> Thursday
           if the daycode is 5 -> Friday
           if none of the above just print unkonown day
         */
        int dayCode = 5 ; // value can be change

        if (dayCode==1 ) {
            System.out.println("Day is monday");
        } else if (dayCode==2) {
            System.out.println("Day is tuesday");
        } else if (dayCode==3){
            System.out.println("Day is wednesday");
        } else if (dayCode==4){
            System.out.println("Day is thursday");
        } else if (dayCode==5) {
            System.out.println("Day is FRIDAY");
        }


    }
}

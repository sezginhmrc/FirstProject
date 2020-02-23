package day09;

import java.util.Scanner;

public class DayPrinter_With_SwitchStatement {
    public static void main(String[] args) {

        // switch checking exact  value
        // another version of else if
        // easier to read if we compare with if else
        // switch is like daycode==1
        //else if is more like range from 70 to 80


        int dayCode = 5 ;

        switch (dayCode) {
            case 1 :
                System.out.println("Day is Monday");
                break ; // used to get out of this branch
            case 2 :
                System.out.println("Day is Tuesday");
                break ;
            case 3 :
                System.out.println("Day is Wednesday");
                break ;
            case 4 :
                System.out.println("Day is Thursday");
                break ;
            case 5 :
                System.out.println("Day is Friday");
                break ;
            case 6 :
                System.out.println("Day is Saturday");
                break ;
            case 7 :
                System.out.println("Day is Sunday");
                break ;
            default:
                System.out.println("Day is unknown");

        }


    }
}

package day08;

public class JustIfStatement2 {
    public static void main(String[] args) {
        /*
        given your currentspeed ,speedlimit
        check whether the current speed is
        more than 90  JAIL
        more than 80 and less than or equal 90 reckless driving
        more than 70 and less than or equal 80 point taken
        more than 60 and less than or equal 70 warning
        if not speeding keep driving
        */
        int currentSPeed = 65 ;
        if (currentSPeed > 90 ) {
            System.out.println("JAIL");
        } else if (currentSPeed > 80 ) {
            System.out.println("RECKLESS DRIVING");
        } else if (currentSPeed > 70) {
            System.out.print("POINT TAKEN");
        } else if (currentSPeed > 60) {
            System.out.println("WARNING") ;
        } else {
            System.out.println("KEEP DRIVING");

        }


    }
}

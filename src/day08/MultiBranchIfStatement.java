package day08;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        // pseudo code
        /*
        given your currentSpeed , SpeedLimit
        check whether the current speed is

        more than 70 and less than 80 -> point taken
        more than 60 and less than 70 -> warning

        if not speeding keep driving
        */
        int currentLimit = 45 ; // try 45 , 65 ,90

        if (currentLimit >70 ) {
            System.out.println(" you are speeding more than 70 --POINT TAKEN !! ");
        } else if (currentLimit > 60 ) {
            //System.out.println("your speed is less thank 70 but more than 60 ");
            System.out.println("your are speeding more than 60 and less than 70 -- WARNING TAKEN");
        } else {
            System.out.println("KEEP DRIVING");
        }


    }
}

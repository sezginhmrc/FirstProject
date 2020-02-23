package day18;

public class DowhileAtleastRunOnce {
    public static void main(String[] args) {
        // do while at least once
        // WHILE LOOP VS DO WHILE LOOP

        /*
         * while loop check the condition first then enter the statement
         * do while loop will take the action at least once then check the condition
         * semi colon !
         * DO WHILE LOOP ALWAYS RUN AT LEAST ONE ITERATION
         * WHILE LOOP MIGHT NOT EVEN RUN !!
         * */

        int x = 1 ;
        do {
            System.out.println("KEEP GOING");
            ++ x ;
        } while (x<=5) ;
        System.out.println("THE END");
         // int this statement do while runs at first statement if it was while it would not even started !!

        while (x<5) {
            System.out.println("KEEP GOING IN WHILE");
        }



    }
}

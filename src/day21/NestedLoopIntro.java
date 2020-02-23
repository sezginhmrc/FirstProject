package day21;

public class NestedLoopIntro {

    public static void main(String[] args) {

        // count from 1 to 5 // use = in most statements !
        // repeat this 3 times
        //
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int x = 1; x <= 5; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x = 1; x <= 5; x++) {
            System.out.print(x + " ");

        }
        System.out.println();
            // yukardaki yontem regular way to count 3 times count from 1 to 5 ..
            // nested loop is gonna make it easier
            // like excel char  one cell
            //  loop inside another loop !
            // now i am gonna use nested loop to make it easier !

        for (int i = 1; i <=3 ; i++) {  // this line is iteration line
            System.out.println("ITERATION : " + i);
            for (int x = 1; x<=5; x++) { // this is another loop inside of iteration line  !
                System.out.print(x + " ");  // debug it to check whats going on ?

            }
            System.out.println();
        }



            }

        }



package day21;

public class OddPrintingNestedLoop {
    public static void main(String[] args) {


        // conunt from 1 10 times
        // only odd numbers if (x%2==1) ;
        // repeat this 3 times // put this step at top after you done another steps !

        for (int i = 1; i <= 3; i++) {


            for (int x = 1; x <= 10; x++) {
                if (x % 2 == 1) {
                    System.out.print(x + " ");


                }

            }
            System.out.println();

        }


    }
}

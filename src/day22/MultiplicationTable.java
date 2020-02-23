package day22;

public class MultiplicationTable {
    public static void main(String[] args) {



        for (int i = 1; i <= 12; i++) {

            System.out.println("Multiplication Table of " + i ) ;

            for (int j = 1; j <= 12; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");

            }
            System.out.println();


        }
        System.out.println("-----");

        for (int x = 1 ; x <=12 ; x ++){
            System.out.println();
            for (int y = 1 ; y <=12; y ++ ){
                System.out.print(x+" * "+y+ " = " + x * y + " ");
            }
        }
    }
}
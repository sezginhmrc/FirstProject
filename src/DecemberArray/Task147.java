package DecemberArray;

import java.util.Scanner;

public class Task147 {

    Scanner scan = new Scanner(System.in);


    public static void printSunset() {

        System.out.print("GUNDOGUMU");
    }

    public static void printEarth() {

        System.out.print("GEZEGEN");
    }

    public static void printDesert() {

        System.out.print("COL");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("select image:");
        System.out.println("Enter a number ? ");
        int num = scan.nextInt();

        if (num == 1) {
            printSunset();
        } else if (num == 2) {
            printEarth();
        } else if (num == 3) {
            printDesert();
        }


    }
}

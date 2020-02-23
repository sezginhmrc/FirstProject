package day17;

public class BackwardEvenNumberFinder {
    public static void main(String[] args) {

        int number = 100;
        while (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is even number");
            }
            --number;
        }
        System.out.println("-------");

        // only odd number
        int x = 100;
        while (x > 0) {
            if (x % 2 != 0) {
                System.out.println(x + " is odd number");
            }
            --x;
        }

        System.out.println("------");
        // if we do from 0 to 100
        int y = 0;
        while (y <= 100) {
            if (y % 2 == 0) {
                System.out.println(y + " is even number");
            }
            ++y;
        }
        System.out.println("------");
        // if we do from 0 to 100 odd number
        int z = 0;
        while (z <= 100) {
            if (z % 2 == 1) {
                System.out.println(z + " is odd number");
            }
            ++z;
        }
    }
}
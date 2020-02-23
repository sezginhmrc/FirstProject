package Repl_And_Practice;

public class CountingDown {

    public static void displayNumber(int number) {

        if (number <= 0) {
            return;
        }
        System.out.println(number + " ");
        --number;
        displayNumber(number);
    }


    public static void main(String[] args) {

        displayNumber(10);
        displayNumber(4);
    }
}

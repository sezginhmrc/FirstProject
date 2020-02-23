package DecemberArray;

public class Task150 {


    //Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

    //hint:you will need to use two nested for loops for that,
    // and an if that checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")

    public static void printHollowRect () {

        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            for (int j = 0; j <5 ; j++) {
                switch (j){
                    case 0:
                    case 4:
                        System.out.println("*"); break ;
                    default:
                        System.out.println(" ");
                }
                System.out.print("*");

            }
        }

    }
    public static void main(String[] args) {

printHollowRect();

    }
}

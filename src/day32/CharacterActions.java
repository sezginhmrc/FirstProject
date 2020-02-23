package day32;

public class CharacterActions {



    // /**
    //     * if beginning character is before ending character
    //     * for example beginning A , ending D  print as -->> ABCD
    //     * we did similar action with printing A-Z
    //     * if beginning character is after ending character
    //     * for example beginning D , ending A  print as -->> DCBA
    //     * we did similar action with printing Z-A
    //     */

    public static void printAlphabetInRange(char beginning, char ending) {

        if (beginning < ending) {
            System.out.println("We need to increment from " + beginning + " till " + ending);

            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.print(iChar + " ");
            }
            System.out.println();
        } else if (beginning > ending) {
            System.out.println("We need to decrement from " + beginning + " till " + ending);

            for (char iChar = beginning; iChar >= ending; iChar--) {
                System.out.print(iChar + " ");
            }
            System.out.println();
        } else {
            System.out.println("THEY ARE SAME CHARACTER!");
        }
    }


    public static void main(String[] args) {


        printAlphabetInRange('a', 's');
        printAlphabetInRange('s', 'h');
        printAlphabetInRange('a','o');

    }

}

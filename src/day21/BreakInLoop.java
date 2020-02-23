package day21;

public class BreakInLoop {
    public static void main(String[] args) {


        String name = "Rana";
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);

            if (currentChar == 'n') {
                System.out.println("FOUND IT ");
                break;

            }
            System.out.println(currentChar);
        }

    }
}

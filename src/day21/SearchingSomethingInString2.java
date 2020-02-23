package day21;

public class SearchingSomethingInString2 {
    public static void main(String[] args) {

        String myName = "Hasan Mammadov";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount - 1;
        System.out.println("lastCharIndex = " + lastCharIndex);

        System.out.println("---2 chars ---");
        //for (int x = 0; x < charCount-2 ; x++) {
        for (int x = 0; x <= lastCharIndex - 1; x++) {

            String current2Chars = myName.substring(x, x + 2);

            if (current2Chars.equalsIgnoreCase("ma")) {

                System.out.println("The index of an is " + x);


            }
        }
    }}
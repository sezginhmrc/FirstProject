package day15;

public class ReversinAString {
    public static void main(String[] args) {

        String name = "Akbar";
        System.out.println(name.charAt(0) + " " + name.charAt(1) + " " + name.charAt(2) + " " + name.charAt(3) + " "
        + name.charAt(4));

        System.out.println(name.charAt(4) + " " + name.charAt(3) + " " + name.charAt(2) + " " + name.charAt(1) + " "
                + name.charAt(0));


        // how do you find out last chracter of any String
        // counting chracter start with '1'
        // counting index(location) start with '0'
        //so last character index/location will be always one less than actual character count

        // akbar has 5 character
        //01234 and last character index is 4 not 5 !!

        int characterCount = name.length(); // using lenght method to find out the total character count !
        int lastCharIndex = characterCount -1 ;
        char lastChar = name.charAt(lastCharIndex);

        System.out.println("LAST CHAR IS " +lastChar );
        System.out.println("last char in on shot " + name.charAt(name.length() - 1));












    }
}

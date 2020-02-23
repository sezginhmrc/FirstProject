package day12;

public class CheckingStringEqualityWithoutCase {
    public static void main(String[] args) {

        // store your name is name variable
        // check for equality using differn uppercase and lowercase example
        // using equals and equalsIgnoreCAse

        String myName = "SeZGiN28";

        boolean myNameIsCorrect = myName.equals("sezgin28");

        System.out.println(myNameIsCorrect);

        // boolean myNameCheckingIgnoreCase = myName.equalsIgnoreCase("sezgin28");
        // System.out.println(myNameCheckingIgnoreCase);

        System.out.println(myName.equalsIgnoreCase("SezGin28"));
        System.out.println( myName.equalsIgnoreCase("sscawsd213"));





    }
}

package Repl_And_Practice;

public class SmokeTest {
    public static void main(String[] args) {

        String name = "Global Market";
        // give me first name last letter in Upper Case ad give me the first letter of second word

        String firstName = name.toUpperCase().substring(name.indexOf(" ")-1,name.indexOf(" "));
        String  lastWord = name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2);

        System.out.println(firstName+""+lastWord);

    }
}

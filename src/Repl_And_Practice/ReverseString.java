package Repl_And_Practice;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Sezgin";
        name.charAt(0);
        name.charAt(1);
        name.charAt(2);
        name.charAt(3);
        name.charAt(4);
        name.charAt(5);
        System.out.println(name.charAt(5)+ " " + name.charAt(4)+ " " + name.charAt(3)+ " " + name.charAt(2)+ " "
          +name.charAt(1)+ " " +name.charAt(0));

        // charAt tells you Chart Location of your value !!
        // counting character is name.lenght(); !!

        String loved = "Rana Ikra Nurdan" ;
        int charCount = loved.length();
        int lastCharIndex = charCount-1 ;
        String reversedLoved = "";

        for (int i = lastCharIndex; i >=0 ; i--) {
            char currentChar = loved.charAt(i);
            System.out.println(currentChar);
            reversedLoved = reversedLoved + currentChar ;


        }

        System.out.println("reversed the name is " + reversedLoved);
    }
}

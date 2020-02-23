package DecemberArray;

public class StringMethods {

    public static void main(String[] args) {

        String name = "Sezgin Hamurcu" ;
        System.out.println(name.length());
        System.out.println("Last index of name is = " + (name.length()-1) + " Last character is = " + name.charAt(5)) ;
        System.out.println(name.equalsIgnoreCase("sezgin"));
        System.out.println(name.endsWith("n"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("r"));

        String s = "I like the word JAVA" ;

        boolean containsWord = s.contains("word");
        System.out.println(containsWord);

        String txt = "Sezgin" ;

        // how to print without last letter ? ->Sezgi

        System.out.println(txt.substring(0,txt.length()-1));


        





    }
}

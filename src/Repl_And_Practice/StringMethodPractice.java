package Repl_And_Practice;

public class StringMethodPractice {
    public static void main(String[] args) {
        //chart index //01234
        String str =   "Koala";

        // * when you click . after str it tells you what action it takes !!
        // **counting chracter start with '1'
        // counting index(location) start with '0'

        System.out.println(str.equals("Koala")); // BOOLEAN

        System.out.println(str.equalsIgnoreCase("koala")); // it does not care case !! BOOLEAN

        System.out.println(str.indexOf("l")); //chart index of 'l' is 3 !!  INT

        System.out.println(str.indexOf("a")); // chart index of 'a' is 2 !!  INT

        System.out.println(str.lastIndexOf("a")); // last index of 'a' is 4 !! INT

        System.out.println(str.toUpperCase()); // it makes the word UPPERCASE  STRING

        System.out.println(str.toLowerCase()); // it makes the workd lowercase  STRING

        str = "Pumpking";

        System.out.println(str.length()); // it counts how many character and it cares about space !! INT

        System.out.println(str.startsWith("Pum")); // it is Case Sensitive !!   BOOLEAN

        System.out.println(str.endsWith("king")); // it is Case Sensitive !!    BOOLEAN

    }
}

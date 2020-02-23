package Repl_And_Practice;

public class Task66 {
    public static void main(String[] args) {
        //       You have 2 words, both of them have 3 characters.
        //     If either of them does not have exactly 3 characters, print "cannot merge"
        //   Merge their characters one by one and print together like below:
        //  aok
        // lol
        // alookl
                 String word1 = "Ali";
                String word2  = "Ela";
                System.out.println("" +word1.charAt(0)+ word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2));
    }
}

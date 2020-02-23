package day16;




public class WakeUpTaskString {
    public static void main(String[] args) {

        //Task 1

        String word1 = "Java";
        System.out.println(word1);
        // in order to reverse a word , we need to take last characater and put it in first character.

        String word2 = "";
        word2 = "" + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
       //  word2 +=  "" + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
       // word2 = word2 + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
      // word2 = (""+ word1.charAt(word1.length()-1) + word1.charAt(word1.length()-2)+ word1.charAt(word1.length()-3) + word1.charAt(word1.length()-4));

        System.out.println("word2 = " + word2);


    }
}

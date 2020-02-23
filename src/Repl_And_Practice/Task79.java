package Repl_And_Practice;

public class Task79 {

    public static void main(String[] args) {

        String word = "Java";

        // how to print Java ?

        if(word.substring(0,1).equalsIgnoreCase("x") &&
                word.substring(word.length()-1).equalsIgnoreCase("x")){
            System.out.println(word.substring(1,word.length()-1));
        } else if (word.substring(0,1).equalsIgnoreCase("x")){
            System.out.println(word.substring(1));
        } else if (word.substring(word.length()-1).equalsIgnoreCase("x")){
            System.out.println(word.substring(0,word.length()-1));
        } else {
            System.out.println(word);
        }

        //You have a word, do the following:
        //
        //If the word has odd number of characters
        //and has 5 or more characters, print the middle three
        //characters of the word.
        //Otherwise print "invalid".

        // middle 3
        System.out.println("-----");
        String kelime = "Jubiler" ;
        int middle = kelime.length()/2;
        System.out.println(middle);
        if(kelime.length()%2==1 && kelime.length()>=5){
            System.out.println(kelime.substring(middle-1,middle+2));
        } else {
            System.out.println("INVALID INPUT");
        }
        System.out.println("-----");

        // first 3
        String input = "Babos";
        for (int i = 0; i <=input.length()-3 ; i++) {
            System.out.println(input.charAt(i));

        }
        System.out.println("----");



        }

    }




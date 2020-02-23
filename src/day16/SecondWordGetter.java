package day16;

public class SecondWordGetter {
    public static void main(String[] args) {
        // given a sentence with 3 words
        // get the second word

        //Steps;
        // second word is between first space and last space // this is introduction

        //(getting location of space reminds me of indexOf)
        //(getttin string inside another string by beginning and  ending index remind me substring !!
     //                    01234567890
        String sentence = "I love Java";

        String secondWord ;

        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring (1+1,6) );
        secondWord = sentence.substring(firstSpaceIndex+1, lastSpaceIndex );
        System.out.println("secondWord = " + secondWord);

        // How to get first word :
        // in plain english : first word is starting from first character till first spcace
        String firstWord = sentence.substring(0, firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);

        //how to ger last word from any sentence
        // last word in a sentence means from last space till the rest
        
        String lastWord = sentence.substring(lastSpaceIndex + 1);
        System.out.println("lastWord = " + lastWord);


    }
}

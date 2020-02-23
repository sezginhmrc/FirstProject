package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequenceOfCharacters {

    public static void main(String[] args) {

        String str = "AAAABBBBBBBCDDDDD";

        Map <Character,Integer> charFreq = new HashMap<>();

        // we are iterating over String

        for (int i = 0; i <str.length() ; i++) {
            char curretChar = str.charAt(i);
            if(!charFreq.containsKey(str.charAt(i))){
                System.out.println("Enter for the first time " + curretChar);
                charFreq.put(curretChar,1);
            } else {
                // if we come to this point it means it has already showed up
                // so we update the count with 1 extra than existing count
                charFreq.replace(curretChar,charFreq.get(curretChar)+1);
            }
        }
        System.out.println(charFreq);
    }
}


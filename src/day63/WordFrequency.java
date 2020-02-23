package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {


    public static void main(String[] args) {


        String str = "Finding Word Frequecny Sounds Fun Becasue Fun Comes in When you Count" +
                " But How do I count the Words With that I already Know previously" +
                " Do it and find out Words Words Words";

        String [] alWords = str.split(" ");
        System.out.println(alWords.length);

        // We want to solve this using the Map
        // Because map only can have unique key, so we can use it for unique words
        // Word and Count twho data type
        // First Create Map object HashMap implemnattion

        // Loop through the word Array
        // Check if we already have the word in the key or not
        // If we do not have the key, it means we are entering for the first time
        // so the count will be 1 , add using put method

        Map<String, Integer> wordFreMap = new HashMap<>();
        // Loop thourh the word Array
    }
}

package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyMethod {

    public static void main(String[] args) {

        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No it is never Ending";


    }

    public  static Map<String, Integer> getFrequencyMap (String str){

        Map<String,Integer> wordFrequencyMap = new HashMap<>();

        for(String word : str.split(" ")){
            System.out.println(word);
        }
    return  wordFrequencyMap;
    }
}

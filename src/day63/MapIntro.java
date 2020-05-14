package day63;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapIntro {

    // map is key value pair
    // We store key and value together

    public static void main(String[] args) {

        // Collection of key value pair.
        // it is like dictionary
        // We store key value pair
        // Together as one element
        // everything we have done so far single
        // map is on the other hand
        // and it store two object for element
        // not iterable since it not extended by collection framework
        // but it is part of collection framework
        // Map is interface HashMap is implementation
        // First one is key second one is value

        // Lets store Map
        // Implemented class is HashMap

        Map<String,String> nameAndState = new HashMap<>();

        //we couldn't use add method because Map doesn't extends Collection...
        nameAndState.put("Sezgin","VA");
        nameAndState.put("Fatih","FL");
        nameAndState.put("Muge","PA");


        System.out.println(nameAndState.get("Sezgin")); // returns value according to key
        System.out.println(nameAndState.containsKey("Fatih")); // return boolean  // checking if certain key exists


        Map <Integer,String> nameAndStatePair = new HashMap<>();

        Map <String,Double> groceryNameAndPricePair = new HashMap<>();

        Map <String, Boolean> voterAndEligibilityPair = new HashMap<>();

        Map <String,Integer> gameNameAndScoreMap = new HashMap<>();

        Map <Byte,Character> questionNumAndCorrectAnswerPair = new HashMap<>();



    }
}

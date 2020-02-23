package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingUniqueChracters {

    public static void main(String[] args) {

        String str = "The new Link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signing page, once you signin with okta" +
                " Then you will be able to joing right away. Please do not try to register , the link is already in the email" +
                " Click to join";

       // Set<Character> chars = new HashSet<>(Arrays.asList('A','A','A','A','a'));
       // System.out.println(chars);

        //str.split(""); // split by nothing giving you each char
        String [] eachCharStringArray = str.split("");
        System.out.println(Arrays.toString(eachCharStringArray));

        List<String> charList = Arrays.asList(eachCharStringArray);
        System.out.println(charList);

        Set <String> charSet = new HashSet<>(charList);
        // We can add a collection object into hashSet since it is also collection.

        // Summary ; We have string at first place we turned into String array to get each an every char
        // And we create String List added out charArray to List.
        // AND EVENTUALLY WE CREATED A HASHSET OBJECT BY COPYING EVERYTHING INSIDE THIST LIST

        // THE ONE SHOT WAY OF DOING ABOVE CODES.

        Set <String> sList = new HashSet<>(Arrays.asList(str.split("")));
        sList.forEach(each-> System.out.print(each+" "));


    }
}

package day37;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeArrayList {

    public static void main(String[] args) {
        //Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
        //* print pass if its more than 60 fail if not
        //* count how many score are more than 90
        //* get the average score
        //* update the values with score-grade pair
        //  for example
        //79C , 54F, 100A, 65D, 44F , 89B , 95A
        //Optionally create 4 methods according to above criteria
        List<String> numList = Arrays.asList("79" , "54" , "100", "65", "44","23","11","98","33","28");
        System.out.println("numList = " + numList);
        for(String each : numList){
            int eachNum = Integer.parseInt(each);
            if(eachNum>60){
                System.out.println("pass = " +eachNum);
            } else {
                System.out.println("fail = " +eachNum);
            }
        }
        //* count how many score are more than 90
        int count = 0 ;
        for (String each : numList){
            if(Integer.parseInt(each)>90){
                ++count;
            }
        }
        System.out.println("count = " + count);


        //* get the average score


        int sum = 0;
        for (String each : numList) {

            sum = sum + Integer.parseInt(each);

        }
        System.out.println("average = " + sum / numList.size());

        // create a method that accept String object
        // and return list<Character> that contins each character
         //     System.out.println(nameChars("Sumeyye"));
        //  * * update the values with score-grade pair
        //         *   for example
        //         * 79C , 54F, 100A, 65D, 44F , 89B , 95A

        // go through each and every number
        // check the number for the range value so we can decide it's A, B, C, D, F
        // THEN use the set method to update the current value to new value
        numList.set(0, numList.get(0) + "C");
        //TODO Finish the rest using this logic

    }


    public static List<Character> nameChars (String name){

        List<Character> charLst = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            charLst.add(name.charAt(i));
        }

        return charLst;

    }



        
    }


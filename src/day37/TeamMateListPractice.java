package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamMateListPractice {
    public static void main(String[] args) {


        List<String> teamMates = new ArrayList<>();

        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Maruf");
        teamMates.add("Vasyl");
        teamMates.add("Muhtar");
        teamMates.add("Asiya");
        teamMates.add("Mike");
        teamMates.add("Guljannat");

        // printing the all items dircetly as is no need extra data or something
        System.out.println("teamMates = " + teamMates);

        // size of this arraylist
        System.out.println("Size of the List is = " +teamMates.size());


        //first item
        System.out.println("First item " + teamMates.get(0));
        // last item
        System.out.println("Last item " + teamMates.get(teamMates.size()-1));
        // print by one bye
        System.out.println("\nAll Items ");
        for (int i = 0; i <teamMates.size() ; i++) {
            System.out.println("\tItem = " + teamMates.get(i));
        }
        System.out.println("ALL items in reverse order");
        // all items print in reverse order
        for (int x = teamMates.size()-1; x >=0 ; x--) {
            System.out.println("\tItem = " + teamMates.get(x));

        }

        // print 2 items at a time
        // for example : 1-2 , 3-4 , 5,6, 6-7  without repeating
        System.out.println("\n Print 2 items at a time : " );
        for (int i = 0; i <=teamMates.size()-2 ; i+=2) {
            System.out.println("\t" + teamMates.get(i) + "---" + teamMates.get(i+1));

        }

        //challenge : pair them up by 3
        // concat everyone in one string separated by
        String result = "";
        for (int i = 0; i <teamMates.size() ; i++) {
            result = result + teamMates.get(i) + "-" ;
        }
        System.out.println("\nresult = " + result);
        // TODO : remove the last dash ! 
        
        // How can we turn a list into a String and Store it ? and manipulated
        
        String lstToString = teamMates.toString();
        System.out.println("\nlstToString after replacgin comma space and [] = "
                + lstToString.replace(", ","-").
                replace("[","").
                replace("]",""));



        
        
        


    }
}

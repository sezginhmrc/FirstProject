package day64;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        // what if we want to have multiple value for one key ?
        // for example groupName (bugHunter)
        // -> Group member names (abc,asd,ffg,kln)


        Map <String, List<String>> groupMap = new HashMap<>();

        groupMap.put("Group9", Arrays.asList("Sezgin","Ziyoda","Abbos","Nailya","Ainura"));
        groupMap.put("BugHunter",Arrays.asList("Mehmet","Ahmet","Osman","Ali"));
        groupMap.put("Achievers",Arrays.asList("Ayse","Rabiya","Gulnazli","Seyma","Sumeyra"));
        System.out.println(groupMap);

        groupMap.forEach((groupCode,allMembers)-> System.out.println("GroupCode = "+groupCode + " ; Members = " +allMembers ));

        // how to get ali
        System.out.println(groupMap.get("BugHunter").get(3));

        // check wheter this map has Ali or not in BugHunter
        System.out.println("groupMap.get(\"BugHunter\").contains(\"Ali\") = " + groupMap.get("BugHunter").contains("Ali"));



    }
}

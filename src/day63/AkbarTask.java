package day63;

import java.util.*;

public class AkbarTask {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Abraham Hope");
        names.add("Zeliha Sezer");
        names.add("Tugba Bekar");
        names.add("Birnigar Ozyurt");
        names.add("Seda Civan");
        names.add("Nuran Demir");
        names.add("Murat Kilinc");
        names.add("Hakan Durmus");
        names.add("Nuran Demir");
        names.add("Mariia Lukianenko");

        Map<String,Integer> nameCharCountPair = new HashMap<>();

            for(String eachMember : names){
                nameCharCountPair.put(eachMember,eachMember.length());
            }
        System.out.println(nameCharCountPair);
            // Created Map of Name and char count pair from List of String.
    }
}

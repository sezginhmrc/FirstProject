package day62;

import java.util.*;

public class SetInterface2 {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>(Arrays.asList(10,10,20,20,20,30,30,30,30,40));

        Set<Integer> numSet = new HashSet<>(numList);

        System.out.println(numSet);
        // avoid to duplicate
        // unique elements
        // random order
        // no index
        // your output can be in any order java desire..

        Set<String> states = new HashSet<>(Arrays.asList("Massascuhest","Florida","Florida","Connecticut","Virginia","New york","New york"));


        // How to  Print elements of this Set data structuor

        // FIRST WAY !!
        // any kind of collection has this forEach method..
        // directly printing each elements
        states.forEach(each -> System.out.println(each));
        // called lambda expression

        // SECOND WAY !!
        for (String each : states){
            System.out.println("Each states = " + each);
        }

        System.out.println(states.size()); // size is used to get how many elements on any type of collection!!!

        // for loop does not work // No index only List...
        // but we can use iterator for any type collection at all time

        // THIRD WAY !!
        Iterator<String> myIter = states.iterator();

        while (myIter.hasNext()){
            System.out.println(myIter.next());
        }






    }
}

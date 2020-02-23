package day61;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {

    public static void main(String[] args) {

        // created a LinkedList of Job obects
        // Arrays.asList is easiest way.
        // added 5 jobs object and sorted as you can see
        List<Job> listOfJobs = new LinkedList<>(Arrays.asList(
                new Job("Florida",100000,"GI"),
                new Job("New York",120000,"Bayern"),
                new Job ("New Jersey",90000,"BOFA"),
                new Job("Boston",105000,"CapitalOne")));

        System.out.println("Before sort List = "+ listOfJobs);
        Collections.sort(listOfJobs);
        System.out.println("After sort List = "+ listOfJobs);

        Job j1 = new Job("Ga",120000,"BOFA");
        Job j2  = new Job("VA",110000,"Amazon");

        System.out.println(j1.compareTo(j2));
        // return 1 since j1's salary is bigger than j2
        // Comparing two object according to salary
        // We put a logic to compare.
        // Watch to CompareTo Short.


        // Collections.reverseOrder() will also give you an object with reverse
        // below code will try to sort the list in reverse order form natural order
        Collections.sort(listOfJobs,Collections.reverseOrder());
        System.out.println(listOfJobs);


        List<Job> aList = new LinkedList<>();
        aList.add(new Job("Ca",120000,"Apple"));
        aList.add(new Job("Tx",100000,"Google"));

        Job j3 = new Job("Utah",90000,"HealthOperation");
        Job j4 = new Job ("New hampshire", 88000,"UnitedBank");

        System.out.println(j3.compareTo(j4));


    }
}

package day61;

import java.util.*;

public class JobHunter1 {

    public static void main(String[] args) {

        List<Job1> desiredJobs = new LinkedList<>(Arrays.asList(
                new Job1("Boston",100000,"Apple"),
                new Job1("New york",120000,"Bayern"),
                new Job1("New Jersey",90000,"USA Health")));

        System.out.println("Befoere sorted it = " + desiredJobs);
        Collections.sort(desiredJobs);
        System.out.println("After sorted it =" +desiredJobs);
        Collections.sort(desiredJobs, Comparator.reverseOrder());
        System.out.println("After reverse it = " +desiredJobs);
        // Comparator.reverseOrder() will give you an object with reversed comparing logic .

        Collections.sort(desiredJobs,Collections.reverseOrder());
        //Collections.reverseOrder() will give you an object with reversed comparing logic
        System.out.println(desiredJobs);


        // How does the sort method know how to sort ?
        // it uses the comparing logic provided inside
        // compareTo(Job Other) method
        // then sort them accordingly

        Job1 a = new Job1("Ct",85000,"AccessHealth");
        Job1 b = new Job1("Ma",80000,"MassHealth");

        System.out.println("a.compareTo(b) = " + a.compareTo(b));



    }
}

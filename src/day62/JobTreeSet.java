package day62;

import day61.Job;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

        // We want the job automatically sorted by natural order (salary)
        // while we are adding them into Collection object
        // so we chose sortedSet for this
        // Create a sortedSet of Job (from day 61)

        SortedSet<Job> favoriteJobs = new TreeSet<>();
        favoriteJobs.addAll(Arrays.asList(new Job("FL", 100000, "GI"),
                new Job("New York", 100000, "Bayern"),
                new Job("New Jersey", 90000, "BOFA"),
                new Job("Boston", 105000, "CapitalOne")));


        System.out.println(favoriteJobs);
        //  since it is treeSet it gives low to high order(salary) that i can make my decision faster...

        for(Job each : favoriteJobs){
            System.out.println("Each = "+each);
        }

        System.out.println(favoriteJobs.first());
        System.out.println(favoriteJobs.last());

        Iterator<Job> itr = favoriteJobs.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        favoriteJobs.forEach(each -> System.out.println(each));

        // i used all the way i know for iterate over Collection
        // Which way should i use in order to remove an element ?
        // of course iterator..

    }
}
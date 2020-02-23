package day51;

import java.util.*;

public class PersonComparing {

    public static void main(String[] args) {


        Person p1 = new Person("Sezgin", 26);
        Person p2 = new Person("Ozlem", 28);
        Person p3 = new Person("Eddie", 36);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // requirement is comparing the persons by ages
        // this is the MEAT !
        // I created couple person and compared them by the code that i have in Person Class
        // Person can be data type
        // Person has a function to compare to person objects
        System.out.println(p1.compareTo(p2));
        System.out.println(p3.compareTo(p2));

        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("John Snow",28));


        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);
        // sorted by the age


        // only thing matter is - or + or 0
        String s1 = "a";
        String s2 = "b";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s1));
    }

    // all point is comparting the objects with custom type !
    //
}

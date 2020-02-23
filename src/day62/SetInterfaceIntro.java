package day62;

import java.util.*;

public class SetInterfaceIntro {

    public static void main(String[] args) {


        // Set is data structure to store uniqe elements
        List<Integer> my = new ArrayList<>();
        // anything related to index about List..

        Set<Integer> myNums = new HashSet<>();
        // this is impilitcly casting(upcasting)
        // Polymorhism
        // we refer hasSet as a Set
        // same logic just implement everything what collection interface hae
        // The only thing Set care about is ignore the DUPLICATE ELEMENT.
        // IT DOES NOT KEEP INSERTION ORDER while list is keeping in order according insertion
        // IT DOES NOT HAVE INDEX while list has index.

        // What kind of collection you want use if you wanna store unique element
        // SET..
        //Set is an interface which extends Collection.
        // It is an unordered collection of objects in which duplicate values cannot be stored.

        myNums.add(10);
        myNums.add(11);
        myNums.add(10);
        System.out.println(myNums);
    }
}

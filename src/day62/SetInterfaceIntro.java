package day62;

import java.util.*;

public class SetInterfaceIntro {

    public static void main(String[] args) {


        // Set is data structure to store uniqe elements
        // HashSet implement Set interface and always default choice
        // anything related to index is about List..


        List<Integer> my = new ArrayList<>(Arrays.asList(10,10,20,20,20,30,30,30,30));
        System.out.println("my = " + my);
        // List has index and it store duplicate values insertion order.

        Set<Integer> myNums = new HashSet<>(my);
        System.out.println("myNums = " + myNums);
        // Set doesnt have index and it store unique values in random order .

        Set<String> names = new HashSet<>(Arrays.asList("Sezgin","Hasan","Esma","Ali","Osman","Apo","Ferit","Ozlem","Ali","Ali","Osman","Osman"));

        // ITERATE OVER THEM USING EACH AND EVERY WAY YOU KNOW.

        names.forEach(each -> System.out.println(each));

        // output -> stored without duplicating elements
        // it stored in randomly (HashSet)

        for(String each : names){
            System.out.println("each = " + each);
        }

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // i cannot use for loop since set doesnt have index
        // List is only collection that have index..






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

    }
}

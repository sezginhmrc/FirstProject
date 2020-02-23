package day62;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SerOfUniqueStates_Deleting {

    public static void main(String[] args) {


        Set<String> states = new HashSet<>();
        // all collection type has adAll method
        states.addAll(Arrays.asList("GA","NY","FL","FL","NY","VA","VA"));
        //    states.remove("GA");
      //   System.out.println("STATES BEFORE = "+states)



        // remove all the states with letter A
        Iterator<String>  stIter = states.iterator();
        // this is how get the iterator type of any collection !!!
        // iterator has 3 only methods hasNext(), next(), remove works together
        // to remove item while iterating over a collcetion

       while (stIter.hasNext()){ // this is keep shifting
            String each = stIter.next();
            if(each.contains("A")){
                System.out.println("Each before removing = "+each); // Ga, Va contains a...
                stIter.remove(); /// removing the states which contains a
            }
        }
        System.out.println("Each after removing 'A' " +states); // after removing elements we print it

       // this is another way
        // ONE LINE !!!!
        // LAMBDA EXPRESSION COOL BUT INTERVIEWRS ASK ITEARTOR.
        // How do i remove item while im iterating over collection ? --> using iterator !!!
        states.removeIf(each -> each.contains("A"));
        System.out.println(states); //

      //  System.out.println(stIter.hasNext());
    //    System.out.println(stIter.next());
        // if you try to get the next  item that you dont have using iterator

    }
}

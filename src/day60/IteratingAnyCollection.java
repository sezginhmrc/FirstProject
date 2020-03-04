package day60;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// THIS IS ONEMLI !!!!!!!!!!!!!!!!!!!!

public class IteratingAnyCollection {

    public static void main(String[] args) {
        // iterating while using For loop
        // iteratin while using For each (not for List no index)
        // Iterator is another way to iterator over COLLECTION


        Collection<Integer>  numbers = new ArrayList<>(Arrays.asList(10,4,22,12,78));


        // ITERATIN OVER A COLLECTION OBJECT USING ITERATOR
        Iterator<Integer> myIter = numbers.iterator();

       /* while (myIter.hasNext()){
            System.out.println(myIter.next());
        } if (myIter.next()<=10){
            myIter.remove();
        }*/


        System.out.println("myIter.hasNext() = " + myIter.hasNext());
        // checks if we have an element at next position returns boolean

        System.out.println("myIter.next() = " + myIter.next()); // 10
        System.out.println("myIter.next() = " + myIter.next()); // 4
        System.out.println("myIter.next() = " + myIter.next()); // 22
        System.out.println("myIter.next() = " + myIter.next()); // 12
        System.out.println("myIter.next() = " + myIter.next()); //78
        //removing whatever is the iterator is pointing to at this location
        myIter.remove(); // REMOVED 78..
        System.out.println("myIter.hasNext() = " + myIter.hasNext());
        // NO MORE ELEMENTS AT TIHS LOCATION
        System.out.println(numbers);
        // PRINTING MY ARRAYLIST AND SINCE 78 REMOVED  IT WILL PRINT REST OF LIST.
        // How do you remove in element while iterating a collcetion ?
        // iterator calling each and every collection type
        // Using iterator to iterate over collection removing item with certain condition


        // ITERATOR IS LIKE FLASHLIGHT CHECKS (hasNext method) and IF IT HAS IT (next method) CHECKS NEXT ELEMENTS AND PICKIN THEM UP
        // YOU DONT HAVE TO DEAL INDEX OR ANYTHING IN ORDER TO GET ELEMENTS AND REMOVE ELEMENTS
        // JUST BECAUSE ITERATOR METHODS ARE CALLED
        // USING ITERATOR WE ARE ABLE TO GET ELEMENTS AT CERTAIN CONDITION
        // USING ITERATOR WE ARE ABLE TO REMOVE ITEM AT CERTAIN CONDITION
        // ITERATOR CAN BE CALLED BY ANY OTHER COLLECTION TYPE
        // TO ITERATE LIST WE CAN  ALSO USE FOR LOOP BECAUSE IT HAS INDEX
        // BUT WHAT ABOUT TO OTHERS THAT DOESNT HAVE INDEX ->
        // ITERATOR OVER COLLECTION THAT DOESNT HAVE INDEX
        // WE CAN ALSO ITEARATOR OVER LIST
        // ITERATOR CAN BE USED FOR ANY TYPE OF COLLECTION
        // IT IS SAFEIST WAY TO REMOVE AN ELEMENT
        // I USE ITERATOR AND  HASNEXT METHOD IF I HAVE ELEMENT OR NOT
        // IF I DO KEEP GOING AND REMOVING ITEM ACCORDINGLY REQUIREMENT
        // ITEARTOR IS FLASHLIGHT EACH AND EVERY ITEM AND TAKE CARE OF THEM
        // WHAT IS THE BEST WAY TO REMOVE AN ELEMENT WHILE ITEARTOR OVER THE COLLECTIONS
        // -> USING THE ITERAATOR INSTEAD OF FOR EACH LOOP / FOR LOOP /





    }
}

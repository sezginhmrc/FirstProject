package day61;

import java.util.LinkedList;
import java.util.List;

public class List_LinkedList {

    public static void main(String[] args) {

        // ArrayList and LinkedList Differences ???

        // ArrayList is backed by array in the back
        // So if we have ArrayList with 4 elements sized(4)
       //  in the back We have array with size 4 holding all those elements
        // if you add one item to the list using add method
        // it will create an array with size 5 then copy all for above
        // and will add the new item at the end...


        // LinkedList is backed by something called Node
        // see it as 4 people holding each other hands
        // the neighbour person have pointer to previous and next person
        // Because they are holding hands (Halay)
        // if you want to add one person new person will just have to hold last person's hand
        // if you want to insert in the middle this new person will hold previos and next person hands..

        //LinkedList is fast for adding and deleting elements,
        //Insert and remove operations give good performance in LinkedList
        // just changing the pointer while adding item
        //  LinkedList consists of nodes/values that are related to each other
        // Only difference performance...


        List <String> lst = new LinkedList<>();
        lst.add("Sezgin") ;
        lst.add("Ozlem");
        lst.add("Zeynep");
        lst.add("Murat");
        // those elements holdin each other hands
        System.out.println("lst = " +lst);
        lst.remove("Zeynep");
        System.out.println(lst);




        // List is subclass of Collection
        // Internal different ArrayList and LinkedList ?
        // any kind of List has index..
        // adding and removing is good for LinkedList



        // ArrayList internally use Array
        // LinkedList internally use Node
        // since ArrayList has less job to do
        // ArrayList is good for getting items while LinkedList is good for removing and adding elements
        // there is no faster or slower we are not even gonna feel difrrences in programs.
        // Just for interview Differences...
        // Arraylist is default choose for programmers
        // LinkedList value is know next and previous element (Node)
        // pointer is check the neightbord for checking item in LinkedList
        // therefore it is good for adding and deleting items





    }
}

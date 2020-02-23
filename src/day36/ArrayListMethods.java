package day36;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        // create a ArrayList object of long and assign it to  a variable 
        
        ArrayList<Long> lst = new ArrayList<>();
        
        // CRUD (ArrayList Methods)
        // Create Read Update Delete
        
        lst.add(12l); // lst is Long object and assigned a primitive it is AUTOBOX !
                    // 12L is automatically converted to new Long (12L); beacuse ArrayList only store object !

        lst.add(100l);
        lst.add(150L);
        lst.add(200l);

       // lst.add(null); // practically you won't add null but you can add null element into a list

        // priority is top to bottom index[0] = 100 ;
        System.out.println("first item is " + lst.get(0));

        System.out.println("lst = " + lst); // you can dirrectly print no need toString and it shows you inside array brackets



        // ArrayList Size
        // Counting Items
        System.out.println("Counting items using lst.size() = " + lst.size() );

        // Getting items inside ArrayList object
        System.out.println(lst.get(0)); // got the first item value with lst.get(index) method
        System.out.println(lst.get(lst.size()-1)); // got the last item value 



        // TASK1
        // Get the sum of above ArrayList 
        long sum = 0 ; // We use long primitive data type and converting to Long -> long -> Long is Autounboxing;
        for (int i = 0; i <lst.size() ; i++) {
             sum = sum +   lst.get(i) ; // i in here is index , so it's data type int
        }
        System.out.println("sum = " + sum);

        // another solution
        for(Long each : lst){
            sum = sum + each ;
        }
        System.out.println("sum = " + sum);
        // result might be double of sum beacuse of first Statement :)


        //TASK2
        // Get the mx of above ArrayList Items
        long max = lst.get(0);
        for (int i = 0; i <lst.size() ; i++) {
            if(lst.get(i)>max){
                max = lst.get(i);
            }
        }
        System.out.println("Max item is = " + max);


        // TASK3
        // i want to insert 125 between 100l aand 150l , basically 2nd 3rd item.
        lst.add(2,125L); // basically adding another item at index 2 ;
        System.out.println("New list is = " + lst);
        System.out.println("index of 3 is " + lst.get(3));


        // Updating value at certain index (set method) ;
        lst.set(3,195L); // replacing index of 3 new value 195L;
        System.out.println("New value for index of 3  = " + lst.get(3));

        // Removing item by its value ;
        lst.remove(100l); // removing the item
        System.out.println("after removing 100l = " +lst);

        // Removing item by its index
        lst.remove(2); // removing the item whose at index 2
        System.out.println("after remove the index of 2 = " + lst);

        // Looking for location of certain item (IndexOf)
        System.out.println("Location of 200l " +lst.indexOf(200l)); // if you don't have it, it turns -1

        // Check wwheter a list is empty or not
        System.out.println(lst.isEmpty()); // result is Boolean

        // How do i delete everything inside my ArrayList
        // lst.clear();
        // System.out.println("After i clear the ArrayList object = " + lst); // lst is empty no elements !
        // System.out.println("Check after clear the list = " + lst.isEmpty()); // true ;

        //Checker whether we have certain item or not ?
        System.out.println("if list contains 100l = " + lst.contains(100l)); // always false beacuse you need to remove the lst.clear method :)

        // How do I check whether a list contains an item wihout using contains method
        System.out.println("DO i have 10l = " + (lst.indexOf(10L)!=1)); // beacause index of 1 is not equal 10L  // true !



    }
}

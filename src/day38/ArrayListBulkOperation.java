package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {


    public static void main(String[] args) {


        // this is unmodified list !
        List<String> groceries = Arrays.asList("Eggs","Milk","Butter","Apple");
        System.out.println("groceries = " + groceries);

        // this is modifiable list
        // will create another list and copy above list as new list and will add more item
        ArrayList<String> newLst = new ArrayList<>(groceries);
        newLst.add("Orange");
        newLst.add("Banana");
        System.out.println("newLst = " + newLst);


        // acutally i have list of items your here : pasta, spinach, avacodo, coke
        // good news is i already created a list object for you so you can just add them all to your existing list
        List<String> newItemsToAdd = Arrays.asList("Pasta","Spianch","Avacodo","Coke");

        // Now Adding one list to another list (onemli);
        // we want toa add all items inside newsItemTOadd to newLst

        newLst.addAll(newItemsToAdd);
        System.out.println("newLst = " + newLst);
        // we added newitmstoadd to newLst

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(2000);
        nums2.add(1000);

        // add all nums2 items into nums1
        nums1.addAll(nums2); // we added the numbers from num2 to nums1
        System.out.println("nums1 = " + nums1); // this is printing all items
        System.out.println("nums2 = " + nums2); // same items .

        
        
        // add 4 items to num2 using ad all 100 200 300 400
        nums2.addAll(Arrays.asList(100,200,300,400));
        System.out.println("nums2 = " + nums2);


        
    }
}

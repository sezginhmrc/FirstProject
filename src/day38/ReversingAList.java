package day38;

import java.util.* ;

public class ReversingAList {

    public static void main(String[] args) {

        //reversing an ArrayList object

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200,100,700,400,500));
        System.out.println("original = " +nums1);


        Collections.reverse(nums1);
        System.out.println("Reversing nums = " +nums1);
        // this is reversing !! not sorting !! two different method
        Collections.sort(nums1);
        System.out.println("Sorting nums = " + nums1);

        Collections.sort(nums1, Collections.reverseOrder());
        System.out.println(nums1);
        // this is sorting in reverse order :)

        Collections.sort(nums1,Comparator.naturalOrder());
        System.out.println(nums1);

    }
}

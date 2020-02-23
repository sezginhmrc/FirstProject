package day22;

public class LoopingArrayReversing {
    public static void main(String[] args) {


        int[] scores = new int[4];

        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100 ;

        int itemCount = scores.length ;  // 4 size of array // array count !!
        int lastItemIndex = itemCount -1 ;  // 3 // this is for reversing the array !!

        // reversing
        // we start with highest index till lowest index which is 0

        for (int i = lastItemIndex ; i >=0 ; i--) {
            System.out.println(scores[i]);
            // todays homework is do while and while loop this statement !!
        }


    }
}

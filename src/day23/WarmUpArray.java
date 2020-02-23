package day23;
public class WarmUpArray {
    public static void main(String[] args) {

        //  create an int array of 7 items
        //  assign values
        // 1,  print out in reverse order
        // 2 , store last item in a variable called lastItem
        // print it out separately
        // 3 , print the item right in the middle
        // OPTIONALLY : find sum , find average , find max , find min

        int [] nums = {10,20,30,40,50,60,70};  // 2th way : int[] nums = new int[] {10,20,30,40,50,60,70};
        int arraySize = nums.length;
        int sum = 0 ;
        double average = 0 ;
        int max = nums[0];
        int min = nums[0];
        int evenNum = 0 ;
        int oddNum = 0 ;

        for (int i = arraySize-1; i >=0 ; i--) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int lastItem = arraySize-1 ;
        System.out.println(nums[lastItem]);

        int middleItem = arraySize/2 ;
        System.out.println(nums[middleItem]);


        System.out.println("--");
        for (int i = 0; i <arraySize ; i++) {
            sum = sum + nums[i];
        }
        System.out.println("sum of arrray " + sum);
        System.out.println("---");




        for (int i = arraySize-1; i >=0 ; i--) {
            System.out.println(nums[i] + " ");
            sum = sum + nums[i];
            average = average + nums[i] / arraySize ;
            if (nums[i]>max){
                max = max + nums[i];

            } else if (nums[i]<min){
                min  = min + nums[i];

            }


        }
        int lastItemIndex = arraySize-1;
        int lastItemValue = nums[lastItemIndex];
        int middleIndex = arraySize/2 ;

        System.out.println("sum of array " + sum);
        System.out.println("Last item index " + lastItemIndex);
        System.out.println("Last item value is " + lastItemValue);
        System.out.println("average of array is " + average);
        System.out.println("middle item value " + nums[middleIndex]);
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);





    }
}

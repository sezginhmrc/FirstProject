package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

        // simplest way to store array elements
        int[] numbers = {2,4,8,16,32}; // size(count) of array is 5
        int itemCount = numbers.length;
        System.out.println("item count is " + itemCount);

        for (int i = 0; i < itemCount ; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        int[] areaCodes = {701 , 300 , 225 , 895} ; // square bracket ! // this is the lazzy way :)
        // if you do it this way : IT MUST HAPPEN IN ONE LINE TOGETHER  !!!
        for (int i = 0; i <areaCodes.length ; i++) {
            System.out.println(areaCodes[i]);
        }

    }



}

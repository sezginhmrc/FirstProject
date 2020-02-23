package DecemberArray;

import java.util.Scanner;

public class ArrayScannerMinMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of elements in array");
        int n = scan.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Please enter value of element "+i);
            nums[i]=scan.nextInt();
        }
        int min=nums[0];
        int max=nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Minimum number of array "+min);
        System.out.println("Maximum number of array "+max);
    }
}



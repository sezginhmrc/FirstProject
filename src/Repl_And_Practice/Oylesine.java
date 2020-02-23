package Repl_And_Practice;

public class Oylesine {
    public static void main(String[] args) {

        int numbers[]={1,3,6,9,2,7};
        int average,sum=0,sumE=0,sumO=0,max=0,min=numbers[0];
        for (int i = 0; i < 6; i++) {
            sum+=numbers[i];
            if(numbers[i]%2==0){
                sumE+=numbers[i];
            }else sumO+=numbers[i];
            if(max<numbers[i]){
                max=numbers[i];
            }
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("Average is "+sum/6);
        System.out.println("Sum of all elements is "+sum);
        System.out.println("Sum of even numbers in the array is "+sumE);
        System.out.println("Sum of even numbers in the array is "+sumO);
        System.out.println("Max number in the array is "+max);
        System.out.println("Min number in the array is "+min);



    }
}

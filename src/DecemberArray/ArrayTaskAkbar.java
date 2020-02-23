package DecemberArray;

public class ArrayTaskAkbar {
    public static void main(String[] args) {

        //create an int array of 6 elements and find out
        //average of the array
        //sum of all elements
        //sum of even numbers in the array
        //sum of odd numbers in the array
        //max number in the array
        //min number in the array

       int [] numbers = {2,4,8,16,32,64} ;
       int charCount = numbers.length ;
       double average = 0 ;
       int sum = 0 ;
       int evenNum = 0 ;
       int oddNum = 0 ;
       int max = 0 ;
       int min = 0 ;

        for (int i = 0; i <charCount ; i++) {
            sum += numbers[i] ; // sum of all elementss
            average = sum / charCount ; // sum 2 , 6, 14, 30, 62 , final sum is 126 and 126/6(sizeArray)

             if (numbers[i]%2==0){
                 evenNum += numbers[i];
             }  else if  (numbers[i] % 2 == 1) {
                oddNum += numbers[i];
            }   else if (numbers[i]>max){
                     max=numbers[i];
                 } else if  (numbers[i]<min){
                     min = numbers[i];
                 }

             }
            System.out.println("sum is " + sum );
            System.out.println("average of elements in array is " + average);
            System.out.println("sum of even number is " + evenNum);
            System.out.println("sum of odd Number is " + oddNum);
           // System.out.println("max number is " + max);
          //  System.out.println("min number is " + min );
        }






    }

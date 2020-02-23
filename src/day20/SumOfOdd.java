package day20;

public class SumOfOdd {
    public static void main(String[] args) {

        // give me the sum of odd numbersf rom 10 -100 use for loop
        //hint ;
        //create a variable sum as int
        // loop through 10-100
        // in each interation check it's a even number or not
        // if it is add that number to sum
        int sumOfOdd= 0 ;

        for (int  i = 10 ; i <=100 ; i++) {
            if(i % 2==1){
                sumOfOdd = sumOfOdd + i ;
            }
        }

        System.out.println(sumOfOdd);

        }


    }



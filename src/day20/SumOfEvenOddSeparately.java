package day20;

public class SumOfEvenOddSeparately {

    public static void main(String[] args) {

        int sumOfEven = 0 ;
        int sumOfOdd = 0 ;

        for (int i = 10 ; i <100 ; i++) {   // debug it for better understanding !!
            if (i%2==0){
                sumOfEven = sumOfEven + i ;
            } else {
                sumOfOdd = sumOfOdd + i ;
            }
        }

        System.out.println("sumofeven = " + sumOfEven);
        System.out.println("sumofodd = " + sumOfOdd);







    }







}


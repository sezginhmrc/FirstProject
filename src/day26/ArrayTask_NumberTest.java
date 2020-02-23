package day26;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        // given an int array
        //  write a program to test all the element in an int array more than 100

        String finalResult = "" ; // if all numbers are more than 100 then make it yes, if not make it no .

        int[] scores = {156,123,75,124,67,126};

        int countOfLessThanHundered = 0 ;

        for (int eachNum : scores){
            if(eachNum<100){
                System.out.println("eachNum = " + eachNum);
                countOfLessThanHundered ++ ;


            }
        }
        System.out.println("count = " + countOfLessThanHundered);
        if(countOfLessThanHundered>0){
            finalResult = "yes" ;
        } else {
            finalResult = "No" ;
        }
        System.out.println("finalResult = " + finalResult);
    }
}
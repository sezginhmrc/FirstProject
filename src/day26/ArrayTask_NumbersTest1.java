package day26;

public class ArrayTask_NumbersTest1 {

    public static void main(String[] args) {

        String finalResult = ""; // if all numbers are more than 100 then make it yes, if not make it no .

        int[] scores = {156, 123, 75, 124, 67, 126};

        int cntMoreThan100 = 0;

        for (int eachNum : scores) {

            if (eachNum > 100) {
                ++cntMoreThan100; // increasing the counter
            }

        }
        System.out.println("cntMoreThan100 = " + cntMoreThan100);

        if(cntMoreThan100==scores.length){
            finalResult = "yes" ;
        } else {
            finalResult = "no" ;
        }
        System.out.println("final result is = " + finalResult);
    }

}

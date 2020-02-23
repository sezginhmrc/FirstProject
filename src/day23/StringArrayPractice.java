package day23;

import java.util.Arrays;

public class StringArrayPractice {

    public static void main(String[] args) {

        String [] shows = {"Behzat C", "Breaking Bad", "Arrow", "Prison Break", "Ezel", "Kurtlar Vadisi"};
        int showsArraySize = shows.length;
        System.out.println("Shows size is " + showsArraySize);

        for (int i = 0; i <showsArraySize ; i++) {
            String currenShow = shows[i];
            System.out.println(currenShow + " has character count : " + currenShow.length());





        }




    }
}

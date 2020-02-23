package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {

    public static void main(String[] args) {

        String sentence = "I love Java Java Java";
        String [] wordsArray = sentence.split(" ",2); // that means only 2 array in sentence !
        System.out.println("wordsArray = " + Arrays.toString(wordsArray));
        System.out.println("wordArraySize = " +wordsArray.length); // 2 because limit is two !
        System.out.print(wordsArray[1]);

    }
}

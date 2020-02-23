package day26;

public class SplitPractice {

    public static void main(String[] args) {

        // 2 additional string methods related to Array
        //toCharArray(), another is split (bySomething)
        // toCharArray() is getting character of it !


        String survey = "Complete B15 Online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();

        for (char each : surveyChars) {
            System.out.print(each+" ");
        }
        System.out.println();
        // using for loop fur fun
            for (int i = 0; i <surveyChars.length ; i++) {
                System.out.print("each char is " + surveyChars[i]+" ");

            }

        // just for fun why don't we try while loop
        int x = 0;
        while (x < surveyChars.length) {
            System.out.println("each char is " + surveyChars[x]);
            x++;

        }
        // for fun do while
        int y = 0 ;
        do {
            System.out.println(surveyChars[y]);
            y++ ;
        } while (y<surveyChars.length);
    }
}
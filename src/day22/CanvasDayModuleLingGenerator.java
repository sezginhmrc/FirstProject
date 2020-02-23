package day22;

public class CanvasDayModuleLingGenerator {
    public static void main(String[] args) {

        String baseUrl = "https://learn.cybertekschool.com/courses/278/modules#";
        String dayMsg = "this will lead you to day";
        for (int i = 21; i < 56; i++) {
            System.out.println(dayMsg + i);
            System.out.println(baseUrl + (3317 - 21 + i));

        }
        // 3297 is first day module ID BECAUSE I TOLD YOU SO
        // get the link from day 1 till day 22

        System.out.println("---------");

        for (int day = 1; day <= 22; day++) {

            System.out.println(dayMsg + day);
            //  if day is 1 the number is 3297 according to requirement
            //  if day is 2 the number is 3298 according to requirement

            System.out.println(baseUrl + (day + 3296));
        }
    }
}


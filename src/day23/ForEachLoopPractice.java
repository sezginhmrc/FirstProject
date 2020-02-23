package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        /*
         * create a long array or 5 items called salaries
         * put your salary amounts that ok for your offerr
         * use for each loop to iterate over them
         * and print them out
         * OPTIONALLY : use different for each loop to
         * print only the salary more than 100000
         *
         * */

        long[] salaries = {100000, 120000, 130000, 140000, 150000};
        for (long eachSalary : salaries) {
            System.out.println("My desired salaries are " + eachSalary);


            }
        // if i wanna print the salary only more than 130000 ;
        for ( long salary : salaries){
            if (salary>130000){
                System.out.println("salary = " +salary);
            }

            }

        }

}







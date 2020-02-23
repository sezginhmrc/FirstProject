package day23;

public class ForEachLoopMax {
    
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

        long [] salaries1 = new long[]{90000,93000,89000,95000,92000};
        for ( long eachSalary1 : salaries1){
            if(eachSalary1>90000){
                System.out.println("eachSalary1 = " + eachSalary1);
            }
        }






        long[] salaries = new long[] {100000, 120000, 130000, 140000, 150000};
        
        long max = salaries[0]; // no changing in the result even if you change variable

       for ( long salary : salaries){

            if(salary>max){
                max = salary ;
            }

            }
        System.out.println("salary = " + max);
        
        
        
        
    }
}

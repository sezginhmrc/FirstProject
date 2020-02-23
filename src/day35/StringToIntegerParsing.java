package day35;

import day54.IndoorPet;

public class StringToIntegerParsing {
    public static void main(String[] args) {

        // i have a employe ID "FB-457"
        // give me the employe number and store it into a number(int) ;

        String strNum = "100" ;
        int num = Integer.parseInt(strNum);
        int number = Integer.parseInt(strNum);
        int n = Integer.parseInt(strNum);
        Integer n1 = Integer.valueOf(strNum);

        System.out.println(num);
        System.out.println(number);
        System.out.println("n = " + n);
        System.out.println("n1 = " + n1);



        String empId = "FB-457";
        // It will turn a String that has only numbers and return int result

        // How Do I get the Number from a String ??
        // -> We use the Integer method

        int id = Integer.parseInt(empId.split("-")[1]);
         //parseInt method is turning either integer and int

        // another solution
         /* String [] empIdSplit = empId.split("-");
        String idStr = empIdSplit[1];
        int id = Integer.parseInt(idStr) ;*/

        System.out.println(id);

        // i have a string called twoNumbers
        String twoNumbers = "100,600";
        // i want you to add them and give the result  700
        String [] splitNum = twoNumbers.split(",");
        int num1 = Integer.parseInt(splitNum[0]);
        int num2 = Integer.parseInt(splitNum[1]);
        System.out.println("Sum of two Numbers = " + (num1+num2));
        /*String [] splitNum = twoNumbers.split(",");
        int num1 = Integer.parseInt(splitNum[0]);
        int num2 = Integer.parseInt(splitNum[1]);
        System.out.println("sum Of nums = " + (num1+num2));*/
        //A/C

        int i = Integer.parseInt(twoNumbers.split(",")[0]);
        System.out.println("i = " + i);






    }
}

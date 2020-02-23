package day35;

import day32.StringActions;

public class RepLs {
    public static void main(String[] args) {
        // TASK
        // get the number out of this string
        // and store it into Integer variable num  OPTINOLLY FIND THE SUM OF THIS NUMBERS
        String str = "A123S123C5412F";
        int sum = 0;
        // sodukodu is i will check each and every char of the string if it s digit i will save it
        // first i need a variable to store digists number and will convert these numbers into integer num !
        String numInString = "";

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                numInString+= str.charAt(i);
                int eachNumber = Integer.parseInt(str.charAt(i)+"");
                sum+= eachNumber;
            }
        }
        Integer num = Integer.valueOf(numInString);
        System.out.println("num = " + num);
        System.out.println(" sum = " +sum);


            //Task
        // use this number IPR2012-00001 and store the year into a int variable
        // i wanna get 20102 out of it..
        String caseNumber = "IPR2012-00001";
        
        int year = Integer.parseInt(caseNumber.substring(caseNumber.indexOf("-")-4,caseNumber.indexOf("-")));
        System.out.println("year = " + year);

        String s = "Naber 1204SEZGIN";
        int y = Integer.parseInt(s.substring(s.indexOf(" ")+1,s.indexOf("S")));
        System.out.println("y = " + y);



    }
}

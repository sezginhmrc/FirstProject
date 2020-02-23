package day35;

public class WrapperTypePrimitiveTypeConversion {

    public static void main(String[] args) {

        // use this number IPR2012-00001 and store the year into a int variable
        // i wanna get 20102 out of it..

        //    String caseNumber = "IPR2012-00001";
        //    int year = Integer.parseInt(caseNumber.substring(caseNumber.indexOf("-")-4,caseNumber.indexOf("-")));
        //    System.out.println(year);

        System.out.println(getYearOutOfCaseNumber("DER2012-00034"));
        System.out.println(getYearOutOfCaseNumber("IPR2012-99003"));
        System.out.println(getYearOutOfCaseNumber("IRS2018-70000"));

        // Integer.parseInt ("NumberHere")
        // it returns an int value converted from String

        //Integer.valueOf("numberHere")
        // it return an Integer object by wrapping up the number



      /*Integer num1 = 100 ; // auto boxing
        int num2 = Integer.valueOf("200");
        int num3 =Integer.parseInt("200");
         */
    }

    public static int getYearOutOfCaseNumber(String caseNumber) {

        return Integer.parseInt(caseNumber.substring(caseNumber.indexOf("-") - 4, caseNumber.indexOf("-")));


    }
}




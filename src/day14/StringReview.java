package day14;

public class StringReview {
    public static void main(String[] args) {

        String str = "I like pumpkin";

        //System.out.println( str.equals("pumpkin"));

        // String methods 1-contains
        // it checks wheter a string exists in another string
        // and it returns True or False Result !

        System.out.println( "Does it contains pumpkin : ? ");

        System.out.println( str.contains("pumpkin")  );

        boolean gotPumpkin = str.contains("pumpkin") ;
        //shortcut to print variable value in nice format soutv + tab

        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith endsWith
        //check whether a string start with another string
        //check wheter a string end with another string
        // and return true or false result

        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);

        // above statement are String Methods !!!





        // Task PASSWORD VALIDATOR
        String password = "Abcdsezgin ";
        // Minimum 8 character max 16
        boolean min8max16 = password.length()>=8 && password.length()<= 16;
        // _ or $
        boolean mustContains_or$ = password.contains("_") || password.contains("$");
        // no Spcae
        boolean mustNotContainsSpace = !password.contains(" ");
        // must start Ab
        boolean mustStartWithAb = password.startsWith("Ab");

        // if any of above condition does not mach say INVALID PASSWORD
        // else say GOOD PASSWORD

      if (min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartWithAb) {
          System.out.println("VALID PASSWORD");
      } else {
          System.out.println("INVALID PASSWORD");
      }














    }
}

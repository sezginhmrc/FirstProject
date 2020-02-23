package day33;

public class ReturnActions {

    /**
     * getSumFrom1toX
     * This method should calculate the sum of
     * the numbers from 1 to the number user passed
     * @param x final number to be added
     * @return the sum of numbers from 1 to x as int
     */


    public static int getSumFrom1toX (int x){
        int sum = 0 ;
        for (int i = 1; i <=x ; i++) {
            sum += i ;

        }
        return sum ;

    }
    /**
     * build_GOT_Email
     * This method should build email using user's first and last name
     * for example Jon Snow --->> JSnow@NightWatch.com  this is the requirement output should be like this
     * firstName user's first name
     * lastName  user's last name
     * @return the email created using
     * firstName initial+lastname+@NightWatch.com
     */

    public static String buildEmail (String first, String last){

        String firstNameFixed = "";
        firstNameFixed+=firstNameFixed+first.charAt(0); // first.charAt(0);

        String lastNameFixed = "";
        for (int i = 0; i <last.length() ; i++) {  //last.length();
            lastNameFixed += last.charAt(i);

        }
        String nameFixed = firstNameFixed+lastNameFixed+"@NightWatch.com";


        return  nameFixed ;
    }

    // another solution of buildEmail
    public static String build_GOT_Email (String first, String last){
       //  String email = first.charAt(0) + last + "@NightWatch.com";
        // return  email ;
        // another way to print i can say this is the simplest way
         return first.charAt(0) + last + "@NightWatch.com";

    }


    public static void main(String[] args) {

        System.out.println(getSumFrom1toX(10));
        System.out.println(buildEmail("Sezgin","Hamurcu"));
        System.out.println(build_GOT_Email("Sezgin","Hamurcu"));
        System.out.println(build_GOT_Email("Ozlem","Hamurcu"));
        System.out.println(build_GOT_Email("Jhon","Snow"));
        
        // if i want one string with 2 words 
        String fullName = "Susan Cure";
        String part1 = fullName.split(" ")[0];
        String part2 = fullName.split(" ")[1];
        String herEmail = build_GOT_Email(part1,part2);
        System.out.println("herEmail = " + herEmail);
        
        // if i want one string with 2 words another solution (By Array)
        String[] fullNameSplit = fullName.split(" ");
        String herEmaill = build_GOT_Email(fullNameSplit[0],fullNameSplit[1]);
        System.out.println("herEmaill = " + herEmaill);
        // we already declared a return inside build_GOT_email here inside main method
        // we generating that piece of rerturn code while creating varialbe

    }
}

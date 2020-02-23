package Repl_And_Practice;

public class Task76 {
    public static void main(String[] args) {

        //In this task, you need to swap first name with last name in the email.
        // If email doesn't contains underscore - do not anything.

        //Example:
        //input: mike_tyson@gmail.com
        //output: tyson_mike@gmail.com
        String firstName = "" ;
        String lastName =  "";

        String email = "miketyson@gmail.com";
        if(email.contains("_")){
            firstName = email.substring(0,email.indexOf("_"));
            lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            email = lastName+"_"+firstName+"@gmail.com";
            System.out.println(email);
        } else if (!email.contains("_")){
            System.out.println(email);
        }


    }
}

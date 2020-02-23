package Repl_And_Practice;



public class Task77 {
    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

      //  Example:
      //  Input: craig_federighi@apple.com
      //  Output:
      //  First name: Craig
       // Last name: Federighi
       // Domain: apple
       // Top-Level Domain: com

        System.out.println("First name: " + email.substring(0,1).toUpperCase() +email.substring(1,email.indexOf("_")));
        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        //federighi
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        //Federighi
        System.out.println("lastName = " + lastName);
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        // apple 
        System.out.println("domain = " + domain);
        String topLevelDomain = email.substring(email.indexOf(".")+1);
        System.out.println("topLevelDomain = " + topLevelDomain);
    }

}

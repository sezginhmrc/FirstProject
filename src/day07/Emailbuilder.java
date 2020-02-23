package day07;

public class Emailbuilder {
    public static void main(String[] args) {

        String firstName = "Sezgin" ;
        String lastName = "Hamurcu" ;
        String fullName = firstName  +   lastName ;
         String companyName = "microsoft" ;
         String email = "sezginhamurcu@microsoft.com";

        System.out.println("My name is "+ fullName +  " and i work for " + companyName + " and my email is " +email);

        //another shorter way  3 string in one shot

       // String firstName ,lastName, company, email ;
       // firstName = "Banega" ;
       //  lastName  =  "Enver" ;
       //  company   = "Verizon" ;
        // firstName_lastName@company.com Banega_Enver@Verizon.com

        //email = firstName+"_"+lastName+"@"+company+".com" ;

        // System.out.println("My name is " + firstName + " " + lastName + " and i wor for " + company + "and my email is : " + email );


    }
}

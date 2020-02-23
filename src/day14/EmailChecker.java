package day14;

public class EmailChecker {
    public static void main(String[] args) {
        //variable named email
        // check for below conditions
        // if it does not contain character @ say invalid email
        // if it contains spca say invalid email
        // if it endsWtih @gmail.com -> gmail
        // if it endsWith @yahoo.com -> yahoo mail
        // if it endsWtih @mail.ru -> russian email

        String email = "sezginhamurcu@hotmail.com";
       // boolean notContainsCharacterAndSpace = !email.contains("@") && email.contains(" ") ;

        if(!email.contains("@") && email.contains(" ")) {
            System.out.println("INVALIID EMAIL");
        } else if (email.endsWith("@gmail.com")){
            System.out.println("gmail");
        } else if (email.endsWith("@yahoo.com")){
            System.out.println("yahoo email");
        } else if (email.endsWith("@mail.ru")) {
            System.out.println("Russin email");
        } else {
            System.out.println("there is no such a email");
        }






    }
}

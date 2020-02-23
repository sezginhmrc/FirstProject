package day12;

import java.util.Scanner;

public class LoginTask {
    public static void main(String[] args) {

      //  String str = "abc" ;
       // str.equals("abc") —> true       ! str.equals("abc") —>> false
        //Create class called LoginTest with main method
        //Create 2 String variable called userName , password
        //and do following
        // your correct username password is  user123  and pass123
        //Check if your username and password correct
        //If so print login successful
        //If not
        //Check whether your username correct
        //if not print  , username is not correct
        //Check your password is correct or not
        //If not print password is not correct



        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name and password ?");
        String userName = scan.next() ;
        String password = scan.next() ;


        // user 123 , pass123

        if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Login completed succesfully");
        } else if ( ! userName.equals("user123") && password.equals ("pass123")) {
            System.out.println("Username is not correct ");
        } else if ( userName.equals("user123") && ! password.equals("pass123")) {
            System.out.println("Password is not correct ");
        } else if ( ! userName.equals("user123") && ! password.equals("pass123")){
            System.out.println("Username and password is incorrect");
        } else {
           // System.out.println("USERNAME AND PASSWORD ARE BOTH WRONG");
        }




    }
}

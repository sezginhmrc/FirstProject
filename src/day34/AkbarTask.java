package day34;

public class AkbarTask {


    public static void loginActivity (String username ,String password){

        if(username.equals("user")&& password.equals("abc123")){
            System.out.println("login succesful");
        } else {
            System.out.println("login failed");
        }
    }

    public static Boolean loginActivity1 (String username,String password){
        if(username.equals("user")&& password.equals("abc123")){
            return true ;
        } else {
            return  false ;
        }
        }


    public static void main(String[] args) {

        // work on when use soutv in main method !
        loginActivity("user1","abc1234"); // it s void !!!
        loginActivity("User","abc123"); // i can not print it beacuse it is a void method !
        System.out.println(loginActivity1("user","abc123"));
        System.out.println(loginActivity1("naa","123"));
        System.out.println(loginActivity1("sess","asd123"));

        if(loginActivity1("user","abc123")){
            System.out.println("Add java book to cart");
            System.out.println("View the order");
        } else {
            System.out.println(" No shopping unless you signed in");
        }
    }
}

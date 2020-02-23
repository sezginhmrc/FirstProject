package Repl_And_Practice;

import java.util.Arrays;

public class Task119 {

    public static void main(String[] args) {

        String email = "info@cybertek@school.com";

        String [] split = email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        System.out.println(Arrays.toString(split));
      /* if(email.contains("@")&& email.indexOf("@")==email.lastIndexOf("@")){
           System.out.println("Email id: " + split[0]);
           System.out.println("domain: " + split[1]);
       } else {
           System.out.println("invalid email");
       }*/


        //email -> info@cybertekschool.com
        //Print:
        //Email id: info
        //Email domain: cybertekschool.com

       /* email -> hello-gmail.com
        print:
        invalid email

        email -> my@fancy@email.com
        print:
        invalid email*/

    }
}

package Repl_And_Practice;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {


        //Enter your code here
        String firstName , lastName, fullName, email, street, state, city, address, contacts ;
        int age, zipCode ;
        double height, weight ;
        boolean isMarried ;
        long workPhoneNumber,personalPhoneNumber ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        firstName = scan.next();

        System.out.println("Enter your last name");
        lastName = scan.next();

        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();

        System.out.println("Enter your street");
        street = scan.nextLine();

        System.out.println("Enter your city");
        city = scan.next();

        System.out.println("Enter your state");
        state = scan.next();


        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();



        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();


        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        age = scan.nextInt();

        System.out.println("Enter your height");
        height = scan.nextDouble();

        System.out.println("Enter your name weight");
        weight = scan.nextDouble();

        System.out.println("Are you marreid?");
        isMarried = scan.nextBoolean();


        fullName =  lastName + "," + firstName;
        contacts = "work phone number - " + workPhoneNumber + "," + "personal phone number - " + personalPhoneNumber + "," + "email: " +email;
         address = street + "," + city + "," + state + " " +zipCode;




        System.out.println("Patient personal information") ;
        System.out.println( "Full name: " + fullName + "\n" + "Address: " + address + "\n" + "Contacts:" + contacts + "\n" + "Age:" + age + "\n" + "Height:" + height + "\n" + "Weight:" + weight + "\n" + "Married?:"  +isMarried);

















    }
}
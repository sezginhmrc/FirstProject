package Repl_And_Practice;

import java.util.Scanner;

public class AkbarTAskPractice {
    public static void main(String[] args) {
        //Task 2:
        //When searching from google ,
        //it will always show your search keyword in tab name
        //for example if you search Java
        //your tab title is : Java - Google Search
        //Create a program to ask user to
        //enter a String with any number of word
        //Create a variable called searchKeyword to save user input
        //Create another String variable called tabTitle
        //assign tabTitle value to searchKeyword +  "- Google Search"
        //Check if tabTitle start with your searchKeyword
        //and end with - Google Search
        //(Assume you don't know tab title is already correct
        //in real world , we will capture it with automation)


       //Task 3:
        //Ask user to enter full name
        //assuming full name is 2 word
        //Write a program to print users initials
        //for example :
        //Jon Snow -->> Initial is JS

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        int lastNameInitial = fullName.indexOf(" ")+1 ;


        System.out.println( fullName.charAt(0)+""+fullName.charAt(lastNameInitial));


    }
}

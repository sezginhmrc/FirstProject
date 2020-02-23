package Repl_And_Practice;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {


        //Write the program that will calculate average grade.
        //Declare 6 String variables: subject1,  subject2, subject3,  subject4, subject5, summary;
        //Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;
        //-Create a Scanner object named scan.

        //Execution flow with example;


        String subject1, subject2, subject3, subject4, subject5, summary;
        Double grade1, grade2, grade3, grade4, grade5, average;

        Scanner scan =new Scanner(System.in);
        System.out.println("Welcome to the Grader!");

        //-Display prompt: "Please enter subject name number 1 and score for this subject"
        //Math
        //5.0
        System.out.println("Please enter subject name number 1 and score for this subject");
        subject1 = scan.next();
        grade1 = scan.nextDouble();

        //-Display prompt: "Please enter subject name number 2 and score for this subject"
        //Biology
        //4.2
        System.out.println("Please enter subject name number 2 and score for this subject");
        subject2 = scan.next();
        grade2 = scan.nextDouble();

        //-Display prompt: "Please enter subject name number 3 and score for this subject"
        //English
        //4.4
        System.out.println("Please enter subject name number 3 and score for this subject");
        subject3 = scan.next();
        grade3 = scan.nextDouble();

        //-Display prompt: "Please enter subject name number 4 and score for this subject"
        //Chemistry
        //4.8
        System.out.println("Please enter subject name number 4 and score for this subject");
        subject4 = scan.next();
        grade4 = scan.nextDouble();

        //-Display prompt: "Please enter subject name number 5 and score for this subject"
        //Music
        //3.4
        System.out.println("Please enter subject name number 5 and score for this subject");
        subject5 = scan.next();
        grade5 = scan.nextDouble();

        //-build summary variable by concatenating subject names and grades
        //calculate average score and define that value into average variable.
        //-Display prompt: "Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4"
        //-Display prompt: "Your average score is: 4.36"
        //-Display prompt: "Thank you for using Grader!"
        //-Display prompt: "Goodbye!"

        summary = "Summary: " +subject1+ " - " +grade1+ ", " +subject2+ " - " +grade2+ ", " +subject3+ " - " +grade3+ ", " +subject4+ " - " +grade4+ ", " +subject5+ " - " +grade5;
        average =  (grade1+grade2+grade3+grade4+grade5)/5 ;

        System.out.println(summary);
        System.out.println("Your average score is:  " +average);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");


























    }
}

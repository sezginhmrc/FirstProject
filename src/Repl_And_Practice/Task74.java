package Repl_And_Practice;

import java.util.Scanner;

public class Task74 {

    public static void main(String[] args) {

        //he wants to write a program that gets a string (the email) and determines if his name "alejandro"
        //appears in that string. if so it will output "read this mail" else it will output "dont read".
        //
        //for example:
        Scanner input = new Scanner(System.in);
        System.out.println("Give a name ");
        String a = input.next();
        if(a.contains("alejandro")){
            System.out.println("read this mail");
        } else {
            System.out.println("don't read");
        }
        System.out.println("-----");
        System.out.println("Give a job tittle");
        String job = input.next();
        if(job.contains("project")){
            System.out.println("read this mail");
        } else {
            System.out.println("dont read");
        }
    }
}

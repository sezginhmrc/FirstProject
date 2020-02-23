package day05;


import java.util.Scanner;

public class ScannerPractice_NextBoolean {
    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner (System.in);

        // asking user are your recording
        System.out.println(" are you recording ");


        boolean isRecording =  input.nextBoolean();

        // The result of concatenating a string to any data type -->> String
        // to create output only true or false

        System.out.println("We are recording " + isRecording);

    }
}

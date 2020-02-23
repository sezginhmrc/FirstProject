package day10;

public class AnswerWithMain {
    public static void main(String[] args) {
        String myAnswer = "";
        int myNumber = 28;

        System.out.println(myNumber / 5);
        System.out.println(myNumber % 5);
        int remainder = myNumber % 5;

        if (myNumber % 5 == 0) {
            myAnswer = ("Fizz Number");
        } else
            myAnswer = ("Not a Fizz Number");
            System.out.println("my answer is " + myAnswer);
    }
}
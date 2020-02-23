package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);

        //'B' is represented by 66 in ascii table
        // here type char is automatically widened to int
        // and stored as number
        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        char myNote =  100 ;
        System.out.println(myNote);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        // -------------------------------
        // saving the number as char
        // so we can get the character representation
        // of the number in ascii table
        char myFirstChar = (char) 100;
        System.out.println(myFirstChar);

        // find out your number of each character in your first name

        char letterA = 'a';  //a is 97 in ascii table
        //  adding a character to a int number will result in int
        //  (int) letterA   + 1
        System.out.println(letterA + 1);
        System.out.println(" " + letterA + 1);

        //homework your name in number

       int myNameInNumber = 'S' ;
       System.out.println(myNameInNumber);
       int myNameSecondNumber = 'E';
       System.out.println(myNameSecondNumber);
       int myNameThirdNumber = 'Z' ;
       System.out.println(myNameThirdNumber);
       int myNameFourthNumber = 'G' ;
       System.out.println(myNameFourthNumber);
       int myNameFifthNumber = 'I' ;
       System.out.println(myNameFifthNumber);
       int myNameSixthNumber = 'N' ;
       System.out.println(myNameSixthNumber);




    }
}

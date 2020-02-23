package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {

        //checking for string equality  should be always done usigng equal method of the string
        // oneString.equals(anotherString) --> true or false

        String myStr = "Java";
        String yourStr = new String ("Java");



        //System.out.println(" is my string same as your string ?");
        //System.out.print( myStr.equals(yourStr));



        // myStr value is Java
        // if true -> "Correct Word ! "
        // if false -> "Say JAVA !! "

        if (myStr.equals("Java")) {
            System.out.println("Correct Word ! ");
        } else {
            System.out.println("Say JAVA !! ");
        }



    }
}

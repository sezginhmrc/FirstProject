package day11;

public class StringEqualityPractice_Condition {

    public static void main(String[] args) {

        // create a variable called myStr and assign a value
        // check whether myStr value is Java
        // if true  -> Correct World !
        // if false -> Say Java !

        String myStr = "Java";

        if (myStr.equals("Java")) {
            System.out.println("Correct Word !");
        } else if( ! myStr.equals("Java")){
            System.out.println("Say Java !!");
        } else if (myStr.equals("Cava")) {
            System.out.println("pumpkin! ");
        } else {
            System.out.println("NOT JAVA OR PUMPKIN");
            // update this program to add more condition
            // using else if in the middle

            // check value of myStr
            // if it is Java  - > correct word
            // if it is Cava - > pumpkin !
            // else say Not Java nor Pumpkin !


        }
    }
}

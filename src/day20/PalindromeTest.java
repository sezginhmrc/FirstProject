package day20;

public class PalindromeTest {
    public static void main(String[] args) {

        // if you reverse string it does not change it means string is palindrome !!!
        // palindrome is kayak, level, madam.

        String name = "Nurses run";
        System.out.println("name = " + name );
        String reversedName = "";
        
        for (int i = name.length()-1; i >=0 ; i--) {
            reversedName = reversedName + name.charAt(i) ;

        }
        System.out.println("reversed name = " + reversedName);

        if(name.equalsIgnoreCase(reversedName)){

            System.out.println("Palindrome test is passed");
        } else {
            System.out.println("Palindrome test is failed");
        }

        // this is my homeworkd
                    // you should make replcase spaces. replace spaces replace ( " " , "")







    }
}

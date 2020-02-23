package day13;

public class StringMethods {
    public static void main(String[] args) {

        // String actions that we already know so far ;
        // equals,
        String s1 = "hello " ;
        System.out.println(s1.equals("hello")); // s1 remote hello is Tv // anything non prmitive is object

        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("hello"));

        //toUpperCase method of String is used to make String all character uppercase
        System.out.println( s1.toUpperCase()   );
        System.out.println( s1.toLowerCase()   );


        String myName = "Sezgin" ;

       System.out.println("My name is " +myName.toUpperCase());
       System.out.println("My name is " +myName.toLowerCase());

       // in order to get how many character we have in String s1
        // we can use length method of String

        System.out.println(s1.length()); // it care about space !!

        int lengthOfStr = s1.length() ;
         if (lengthOfStr>4){
             System.out.println("More than 4 character");
         } else {
             System.out.println("Not More Than 4 ");
         }







    }
}

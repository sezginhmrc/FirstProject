package day20;

public class ReversingAString {
    public static void main(String[] args) {
        //given a String variable name with value
        // reverse this name and store reversed value into
        // another String Variable reversedName
        //             01234567
        String name = "Sezgin Hamurcuoglu";
        String reversedName = "";


    //    System.out.println( name.charAt(7));
        // and rest in 6,5,4,3,2,1 ....
        // to find string name with scanner just
        // name.length () -1 is lastchracter of index so from there you can just count down to 0 !!
            int lastCharIndex = name.length()- 1; // to make it with scanner !!! use this method insted of putting 7

        for ( int x = lastCharIndex ; x >=0 ; x--){ // instead of 7 you put lastCharIndex to find out any name !!
            System.out.print(x + " index : "); // this
            char currentChar = name.charAt(x);  // x is starting from 7 to reverse name !!
            System.out.println(currentChar);

            reversedName = reversedName + currentChar ;

        }
        System.out.println("reversed name = " + reversedName);  // debug itt for better understanding !!



    }
}

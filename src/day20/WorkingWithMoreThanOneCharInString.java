package day20;

public class WorkingWithMoreThanOneCharInString {
    public static void main(String[] args) {
        // given a string with even number character count
        // print 2 characters in one line
        // for example : Gokyuzum
        //               01234567
        // go
        // ky
        // uz
        // um

        String name = "Gokyuzum";
        int charCount = name.length();
        int lastCharIndex = charCount-1 ;

        System.out.println(name.substring(0,2));
        System.out.println(name.substring(2,4));
        System.out.println(name.substring(4,6));
        System.out.println(name.substring(6,8));

  //      int x = 0 ;

 //         System.out.println(name.substring(x,x+2));
  //      x = x + 2 ;

//        System.out.println(name.substring(x,x+2));
  //      x = x + 2 ;

   //     System.out.println(name.substring(x,x+2));
  //      x = x + 2 ;

   //     System.out.println(name.substring(x,x+2));


        for ( int x = 0 ; x <= lastCharIndex-2 ; x +=2) {
            System.out.println(name.substring(x,x+2));
        }


    }
}

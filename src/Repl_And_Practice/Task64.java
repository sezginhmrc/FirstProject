package Repl_And_Practice;

public class Task64 {
    public static void main(String[] args) {

        String name = "ayrana" ;
        int charCount = name.length() ;
            if(charCount==1){
                System.out.println(name + name + name);
            } else if ( charCount==2){
                System.out.println(name + name );
            } else if ( charCount>2)
                // if word has more than 2 word i worry about if it is even or odd !!
                if (charCount%2==1){         // When word has even number of characters and  4 or more characters,
                 int indexOfMiddleTwo = charCount/2 ;  //  print middle 2
                    System.out.println(name.charAt(indexOfMiddleTwo));                                     //      java ==> av

                } else {
                    int indexOfFirstHalf = charCount / 2 - 1;
                    int indexOfSecondhalf = charCount / 2;
                    System.out.println(name.charAt(indexOfFirstHalf) + " " + name.charAt(indexOfSecondhalf));

                }



    }
    //You have a word, do the following:

    //1. When word has odd number of characters and 3 or more characters,
    //      print middle letter
    //      oak ==> a
    //      javav ==> v
    //           Single character, print that character 3 times
    //      # ==> ###
    //      q ==> qqq
    //
    //2. When word has even number of characters and  4 or more characters,
    //           print middle 2
    //          java ==> av
    //           apples ==> pl
    //            #$%^&* ==> %^
    //          2 characters, print those 2 characters twice
    //      @@ ==>@@@@
    //      $$ ==>$$$$
    //      hi ==> hihi


}

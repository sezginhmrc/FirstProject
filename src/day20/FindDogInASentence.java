package day20;

public class FindDogInASentence {
    public static void main(String[] args) {

        // given sentence , find out the location of the dog !

        String msg = "I like Dog, Dogs are cute, Dogs are friendly";
         int lastCharIndex = msg.length()-1 ;
         for (int x = 0; x <= lastCharIndex-2 ; x ++ ){
             String current3chars = msg.substring(x,x+3) ;
         //   System.out.println(x + " : " + current3chars );
             if (current3chars.equals("Dog")){
                 System.out.println("BINGO !! AT " + x );

             } else {
                 System.out.println("Word is not DOG ! ");
             }
         }






    }
}

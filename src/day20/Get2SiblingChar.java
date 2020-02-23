package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {


        //  given a String with even number character count
// print 2 characters in one line as below example
//                 0123
// for example  :  Ayra
/*
    Ay      -> 01     02
    yr      -> 12     13
    ra      -> 23     24

 */

        String name = "Ayra";
        int charCount = name.length();
        int lastCharIndex = charCount - 1;

   //     System.out.println(name.substring(0, 2));
    //    System.out.println(name.substring(1, 3));
    //    System.out.println(name.substring(2, 4));

        for (int i = 0; i < lastCharIndex ; i++) {  //
            System.out.println(name.substring(i,i+2));

        }


        for (int x = 0; x <= lastCharIndex - 1; x++) {
            System.out.println(name.substring(x, x + 2));
        }
        //0123
        // for example  :  Ayra
         /*
                          Ayr 012  -->> 03
                          yra 123  -->> 14

              //        System.out.println(  name.substring(0,3) );
              //        System.out.println(  name.substring(1,4) )'
                */

         //String name = "Ayra";
        // int charCount = name.length();
        // int lastCharIndex = charCount - 1;

        System.out.println("GETTING 3 CHARACTER ");
        for (int x = 0; x <= lastCharIndex - 2; x++) {

            System.out.println(name.substring(x, x + 3));

        }
    }
}
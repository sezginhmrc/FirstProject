package day21;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        //DAY 21 :
        //Create a class called WakeUpTask1_NamePrinter
        //Given your name stored in a variable myName as String
        // for example :  String myName = "My name is Yourname here" :
        // 1, loop through each and every character print them out like this :  M->y-> >n->a->m->e-> and so on
        // put arrow in beterrn the character
        //Optionally
        // 2 , print the sentence by 2 character at a time
        // 		just by incrementing by 1
        // 3 , print the sentence by 3 character at a time
        // 4 , print the sentence by 4 character at a time

       // String myName = "Sezgin";
       // System.out.println("My name is :" + myName);
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name !");
        String myName = scan.next();
        int characterCount = myName.length();
        int lastCharacterIndex = characterCount-1 ;

        for (int x = 0 ; x<characterCount ; x ++ ){
            System.out.print(myName.charAt(x) + "->");
        //    System.out.print(myName.substring(x,x+1)+ "->");
        }


        System.out.println();

        for ( int y = 0 ; y<=myName.length()-2 ; y ++ ) {
            System.out.println(myName.substring(y,y+2)); // getting 2 char if you dont use = equal decrement by 1
        }
        System.out.println();
        for ( int z = 0 ; z<=lastCharacterIndex-3 ; z ++) {
            System.out.println(myName.substring(z,z+3));
        }

    }
}

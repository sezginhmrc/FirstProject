package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

        //replace method of the String

        String message = "I love Pumpkin , Pumpkin IS FUN! ";
        message.replace("Pumpkin","Java!") ;
        System.out.println(message); // does not change becasue string message is holding pumpkin
        // you need assign another string !


        message = message.replace("Pumpkin","Java!") ;
        System.out.println(message);

        // what if i want to replace space from eveywhere ?

        String message2 = "Happy Thanks Giving to All" ;
        // "Happy Thanks Giving to All" -->> "Happy Thankgiving to All" // correcting
        message2 = message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println("message 2 = " + message2);
        // replacing is simply metthod of string if you wanna chance any word any character from statement
        // you need to use replace !!

        //remove all the space

        message2 = message2.replace(" ", "");
        System.out.println("message2 = "+ message2);

        // how do remove specific word from statement ?
        String message3 = "TOMORRO IS OFF NO!";
        // remove no word
        System.out.println(message3.replace("NO",""));
    }
}

package day22;

public class LoopControlStatement {
    public static void main(String[] args) {
//Store this sentence in a variable msg
//I struggle with Java I Like Java I love Java Everything is Awesome!
//loop through each and every letter
//1, print every other letter
// meaning : skip a letter each time you go through the letter
//	0123456789
//	I struggle with  -->> Isrgl ih  // skipping odd numbers !! LOGICCCCAL
//	USE CONTINUE FOR THIS TASK
//2,  when you reach letter a break the loop
//OTIONALLY ; BREAK WHEN YOU SEE 3RD A case insensitve

        String msg = "I struggle with Java I Like Java I love Java Everything is Awesome! ";

        // task 1

        int [] arr1 = {1,2,3,4,5};
        for (int e = 0; e < arr1.length; e++) {
                if(e%2==1) {
                    continue; }
            System.out.println(arr1[e]);
            //    System.out.println(msg.substring(e,e+1)); //  System.out.print(msg.charAt(e)); this is another way
            // char currentChar = msg.charAt(e);
               // System.out.println(msg.substring(e,e+1)) ;

                }
    /*        // task 2 ;
                for (int i = 0; i <msg.length() ; i++) {
            String currentChar = msg.substring(i,i+1);
            if (currentChar.equalsIgnoreCase("j")){
                break ;
            }
               //     System.out.println(currentChar);
        }
                //task 1 2 combined
        for (int i = 0; i < msg.length(); i++) {
            if(i%2==1){ // skipping odd numbers
                continue;
            }
            String currentChar = msg.substring(i,i+1);
            if(currentChar.equalsIgnoreCase("j")){
                break ;
            }
            System.out.println(currentChar);*/
        }
        }
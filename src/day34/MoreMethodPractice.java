package day34;

public class MoreMethodPractice {

    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, true));
        System.out.println(monkeyTrouble(false,false));
        System.out.println(monkeyTrouble1(true,true));
    }

    /*a method that return true only if both monkeys are smiling or not smiling
     * aSmile first monkey smiled or not
     * bSmile second monkey smiled or not
     * @return true only if both monkeys are smiling or not smiling*/

    // in here i have two methods

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // TODO : Your code goes here

        /*if ((aSmile && bSmile) || (!aSmile && !bSmile)){
            return true ;
        } else {
            return  false ;
        }*/
        //another solution
      //  return (aSmile && bSmile) || (!aSmile && !bSmile);
        // another solution !
         return  aSmile==bSmile ;
    }


    // return yes and no instead of true or false !

    public static String monkeyTrouble1(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return "yes";
        } else {
            return "no";

        }

    }
}



package day34;

public class MonkeyPractice {

    /* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     For example :
     monkeyTrouble(true, true) → true
     monkeyTrouble(false, false) → true
     monkeyTrouble(true, false) → false
     public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
         //TODO : Your code goes here*/
    public static boolean monkeys(boolean aSmile, boolean bSmile) {
      /*  if (aSmile == true & bSmile == true) {
            return true;
        }
        if (aSmile != true & bSmile != true) {
            return true;
        } else return false;

    }*/
        return aSmile == bSmile;
    }
        public static void main (String[]args){

            System.out.println(monkeys(true, false));
            System.out.println(monkeys(false, false));
            System.out.println(monkeys(true,true));
        }

}




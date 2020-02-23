package day36;

public class MethodPractice {

    //write a static method to accept a String and return Boolean(Yes Uppercase) .
    //it should return true if the String contains at least one number.
    
    // true Boolean object if the string at least has one number

    public static Boolean ifStringHasNumber (String str) {
        /*// return true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }

        }
        return false;*/

        //teacher solution
        for (int i = 0; i <str.length() ; i++) {

            char eachChar = str.charAt(i);

            if(Character.isDigit(eachChar)){
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }

    public static void main(String[] args) {

        System.out.println(ifStringHasNumber("asd123sfd"));
        System.out.println(ifStringHasNumber("sadasdasd"));

        // created a Boolean object
        Boolean result1 = ifStringHasNumber("ASDDSA");
        System.out.println("result1 = " + result1);


    }
}

package Office_hour;

public class Practice_12_23 {

    // method it's just a reusable piece of code
    // with return type without void
    // method can be with parameters or w/out parameters

    public static String reverseString (String str ){
        String reversedString = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedString+=str.charAt(i);
        }
        return reversedString ;
    }

    public static void add(int num1, int num2){
        System.out.println((num1+num2));
    }

    public static int addWithReturn (int num1, int num2){

        return num1+num2;

    }

    public static void main(String[] args) {

        System.out.println(reverseString("sezgiN"));
        add(5,10);
     //   int result = add(5,10); // does not work
        int result2 = addWithReturn(5,10);
        System.out.println("result2 = " + result2);

    }

}

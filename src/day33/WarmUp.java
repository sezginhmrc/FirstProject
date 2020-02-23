package day33;

public class WarmUp {

    //getspelledname
    //this method will put dash in beetween given string
    // for example Akbar -> A-k-b-a-r

    public static String getSpelledName(String name){

        String result ="";
        for (int i = 0; i <name.length() ; i++) {
            result = result + name.charAt(i);
            if(i!=name.length()-1){
                result = result + "-" ;
            }
        }
        return result;
    }
    //another solution of the same task
    public static String getSpelledName2 (String name){
        String result = "";

        // keep adding dahs until right before last character
        // then concatenate last character

        for (int i = 0; i <name.length()-1 ; i++) {
            result += name.charAt(i)+"-";

        }
        // at this point result has everything but last character
        // so now we need to add last char back to the result
        return result +name.charAt(name.length()-1);
    }

    public static void main(String[] args) {

        System.out.println(getSpelledName("Sezgin"));
        System.out.println(getSpelledName2("Sezgin"));
        System.out.println(getSpelledName2("Ozlem"));

    }

}

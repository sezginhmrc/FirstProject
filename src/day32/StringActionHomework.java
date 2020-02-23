package day32;

public class StringActionHomework {

    public static void reversePrintMyOwnName(){
        //reversePrintMyOwnName
        //* create a method that has no parameter
        //	and print your name in reversed order
        // i declared the valu here sezgin
        // no parameter
        String name = "Sezgin";
        for (int i = name.length()-1 ; i >=0 ; i--) {
            System.out.print(name.charAt(i));
            }
        System.out.println();
        }
        //reversePrintAnyName
    //* create a method that has 1 String parameter called name
    //	and print that name in reversed order
    // i want you to declare a value by main method it has parameter !
    public static void reversePrintAnyName(String name){
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i)+"");
        }
        System.out.println();
    }
    //printLastCharacterOfName
    //* create a method that has 1 String parameter called name
    //	and print last character of that name
    // this is also has a parameter name will be given by main method !
    // if method don't have the return type we don't print it by main method !
    public static void printLastCharOfName(String name){
            //System.out.println(name.charAt(name.length()-1));
           for (int i = 0; i <name.length() ; i++) {
        }
        System.out.println(name.charAt(name.length()-1));
    }
    public static void main(String[] args) {

        reversePrintMyOwnName();
        reversePrintAnyName("Hamurcu");
        printLastCharOfName("Sezgin");


    }


}

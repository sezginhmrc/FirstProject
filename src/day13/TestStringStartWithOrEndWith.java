package day13;

public class TestStringStartWithOrEndWith {
    public static void main(String[] args) {

        String name = "Muge";

        //check if a String start with another string
        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("mu")); // it's case SENSITIVE
        System.out.println(name.startsWith("Mac"));

        System.out.println(name.endsWith("e"));
        System.out.println(name.endsWith("i"));
        System.out.println(name.endsWith("E"));




    }
}

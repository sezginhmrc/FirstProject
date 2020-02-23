package day37;

public class MethodOverLoadiginWithWrapper {

    public static void main(String[] args) {

        printNum(100);
        printNum(Integer.valueOf(100));
        printNum(100);
        printNum(Integer.valueOf(200));
        printNum(Integer.parseInt("100"));
    }

    public static void printNum (Integer x){
        System.out.println("Printing Integer object = " +x );
    }
    public static void printNum (int x){
        System.out.println("Priniting primitive int x = " +x);
    }

}
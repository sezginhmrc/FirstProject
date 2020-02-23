package day11;

public class StringEquality {
    public static void main(String[] args) {

        String name = "Ozlem";  // string literal // literally string //without any scanner or somethinh
        String name2 = new String("Ozlem");

        System.out.println(name);
        System.out.println(name);
        System.out.println(name==name2);
        // print false because == eqaulity of string is like below statement !

        System.out.println(name.equals(name2));






    }

}

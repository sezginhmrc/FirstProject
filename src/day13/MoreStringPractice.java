package day13;

public class MoreStringPractice {
    public static void main(String[] args) {

        String name = "Pumkin";
        System.out.println(name);

      //  name = "Ankara" ;
        //System.out.println(name);
        // frist name is goes to garbage collection new object is ankara

        // String is immutable , once created it can not be changed
        // any string action methods

        name.toUpperCase();
        System.out.println(name);

        System.out.println(name.toUpperCase());

        // if i want to change name ;

        name = name.toUpperCase();
        System.out.println(name);

        System.out.println( name.toUpperCase().contains("KI"));

    }
}

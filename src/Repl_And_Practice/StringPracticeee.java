package Repl_And_Practice;



public class StringPracticeee {
    public static void main(String[] args) {
        // in order to make first letter Uppercase and rest to lowercase !

        String name = "sezgin";

        String nameFixed1 = name.substring(0,1).toUpperCase() ;
        String nameFixed2 = name.substring(1).toLowerCase() ;
        String nameFixed = nameFixed1 + nameFixed2 ;

        System.out.println("Name fixed is = " + nameFixed);

        // another way (best way)
        String nameFixedd = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() ;
        System.out.println("Name fixedd is = " +nameFixedd);

        //another way (poor way)
        String nameFixeddd = (name.charAt(0)+"").toUpperCase() ; // Chart() is int to make it string we add "" () !
                nameFixeddd = nameFixeddd + name.substring(1);
        System.out.println("name fixeddd is = " + nameFixeddd);





    }
}

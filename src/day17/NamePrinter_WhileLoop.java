package day17;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {

        String name = "Alexander" ;
        // get each and every character and print them out vertically
        int x = 0 ;
                while(x<name.length()) {
                    System.out.print("index " + x + " : ");
                    System.out.println( name.charAt(x));
                    ++ x ;
     //   System.out.println( name.charAt(x));
       // ++ x ;
        }

                String n = "AYSO" ;
                for (int i = n.length()-1; i>=0 ; i--){
                    System.out.println(n.charAt(i));
                }

                 String letters = "Ja@V@2a" ;
               letters = letters.replace("@","")
                       .replace("@","")
                       .replace("@","")
                       .replace("2","")
                       .toUpperCase() ;
        System.out.println("letter = " + letters);


    }
}

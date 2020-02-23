package day09;

public class IntoSwitchStatemnt {
    public static void main(String[] args) {
        /* 1 -> "Hello"
   2 -> "Salam"
   3 -> "Hola"
   4 -> "Privet"
   5 -> "Merhaba"
   6 -> "Szia"
   7 -> "Bonjour"
 */
        //turn above to the switch statemnet
        // everything you do withc switch can be done by if else !!!


        String greeting = "" ;
        int grettinCode = 4 ;

        switch (grettinCode) {
            case 1 :
                 System.out.println("Hello");
            break ;
            case 2 :
                System.out.println("Salam");
            break ;
            case 3 :
                System.out.println("Hola");
                break ;
            case 4 :
                System.out.println("Privet");
                break ;
            default :
                System.out.println("language is unknown"); ;
        }



    }
}

package day09;

public class LanguagePicker {
    public static void main(String[] args) {
     /* 1 -> "Hello"
        2 -> "Salam"
        3 -> "Hola"
        4 -> "Privet"
        5 -> "Merhaba"
        6 -> "Szia"
        7 -> "Bonjour"
      */
        String greeting = "" ;
        int languageCode = 5 ;
        if (languageCode ==1 ) {
            greeting = "Hello" ;
        }  else if (languageCode==2) {
            greeting = "Salam" ;
        }  else if (languageCode==5) {
            greeting = "Merhaba" ;
        }
           System.out.println("This is how the greeting meesage you get : "+ greeting);
        

    }
}

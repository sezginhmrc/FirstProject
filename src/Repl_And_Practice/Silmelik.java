package Repl_And_Practice;

public class Silmelik {
    public static void main(String[] args) {

        String [] str = {"OZLEM","SEZGIN","EDI","BU","GIRAL","Yok"};
        String shortest = str[0];
        int length = str[0].length();
        for (int i = 0; i<str.length; i++) {
            if(length>str[i].length()){
                length = str[i].length();
                shortest =  str[i] ;
            }
        }
        System.out.println(shortest);

    }
}

package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

     //   int x = 'A' ;
        char myChar = 100 ;

      //  System.out.println(x);
        System.out.println(myChar); // d
        System.out.println(++myChar); // 100 + 1 = 101  --> e
        System.out.println(++myChar); // 101 + 1 = 102  --> f
        System.out.println(++myChar); // 102 + 1 = 103  --> g
        System.out.println(++myChar); // 103 + 1 = 104  --> h !!

            for ( char ichar = 'A' ; ichar<='Z' ; ichar++  ){
                System.out.print(ichar + " ");
            }
        System.out.println();
        for (char kChar = 'Z'; kChar>= 'A' ; kChar --)
            System.out.print(kChar+ " ");
        }


    }


package day58;

public class RunTimeErorDemo {
 //   static int num = 0 ;
    public static void main(String[] args) {
       /*num ++ ;
        System.out.println("num = " + num);
        main(null);
        */

       for (int i = 0 ; i <5 ; i++)
       {
           if (i == 3)
           { continue;// only can be used with loop statements

        }
           System.out.println(i);
       }
       for (;;){
           System.out.println("INFINIte LOOP");
       }
    }
}

package day16;

public class Count1To10LOOP {
    public static void main(String[] args) {

        int counter = 1 ;

        while (counter< 11 ) {
            System.out.println("counter count is = " + counter );
            // something has to be done to change the condition along the way
            // or it just keep running forever
           counter ++ ;
           
        }

            // 10 <= 10 -->> true       11 <=10 false
            // 10 < 11 -->> true        11 < 11 false
        
        int cnt = 1 ;
        
        while (cnt <= 10 ) {
            System.out.println("cnt = " + cnt);
            cnt ++ ;
        }

         int x = 1 ;
        while (x<=10){
            // ++x -->> x + x + 1
            System.out.println(x++);
        }

        int y = 1 ;
        while(y<=10){
            System.out.println(++y);
            // ++ y -->> y = y +1
            // result is 11 !!!
        }

        int z = 0 ;
        while (z<=10){
            System.out.println(z);
            ++z ;
        }

        int a = 0 ;
        while (++a <=10 ) {
            System.out.println(a);
        }

        int count = 1 ;
        while (count++ < 10 ){
            System.out.println(count);
        } // check the results and try to make it straight !!!

        int coun = 0 ;
        while (coun++ < 10 ) {
            System.out.println(coun);
        }
    }
}

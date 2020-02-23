package day16;

public class CounFrom10To1 {
    public static void main(String[] args) {

        int counter = 10 ;
        while (counter>=1){
            System.out.println(counter);
            -- counter ;
        }
        //another way
        while (counter != 0){
            System.out.println(counter);
            --counter ;
        }
        System.out.println("final value of count " + counter);
    }
}

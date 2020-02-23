package day07;

public class PostIncrement {
    public static void main(String[] args) {

        //int apple = 8 ;
        //apple ++ ; // incrementing by one ->9

        //System.out.println( apple ); // printing the increased value which is 9

        //apple ++ , when ++ comes after the variaable
        // it's called post increment
        // it will increase the value
        //but it will reflect the increased the value nex time the variable show up !!

        //System.out.println( apple ++ );
        //System.out.println(apple);

        int score = 50 ;

        System.out.println( ++score ); // 51
        System.out.println( score++ ); // 51 and ready to be 52 next time it shows up
        System.out.println( score ); //52
        System.out.println(--score); // 51
        System.out.println( score -- ); //still 51 ready to be 50 next time it shows up
        System.out.println(score); // 50


    }
}

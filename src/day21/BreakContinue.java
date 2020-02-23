package day21;

public class BreakContinue {
    public static void main(String[] args) {


        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
            // this is also pointles
            // after the 5th iteration
            // the loop will stop by itself
            // no point doing his
            if(i==5){
                break; // this is pointless
                        // because after each iteration
                        // it is going to next iteration anyway !
            }
            continue;

        }



    }
}

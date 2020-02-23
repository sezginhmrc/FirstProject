package day21;

public class SkipAll5s {
    public static void main(String[] args) {

        // count 1 to 100
        // skip all the number divisible by 5

        // x %5==0
        for (int i = 1; i < 100 ; i++) {
            if(i%5==0){
                //System.out.println("SKIPPING " + i); // skipping numbers that divisible by 5 !
                continue;
            }
            System.out.println(i);
        }



    }
}

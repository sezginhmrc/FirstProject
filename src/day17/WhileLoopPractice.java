package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {

        // count 1 to 5 then count 5 to 1

        int counter = 1 ;
        while(counter<=5){
            System.out.print(counter + " "); // to add space + " " ;
            counter++ ;
        }
        System.out.println();
        System.out.println("counter after increment is = " + counter); // at this point counter value is 6
                                                                    // it gets out but includinn 6 for counter value

        // now count from 5 to 1 same counter

        while(counter>1){ // at this point counter is 6
            --counter ;
            System.out.print(counter + " ");



        }
        System.out.println();
        System.out.println("counter after decrement = " + counter); // 1 at this point it gets out !!
    }       // this task is a good statement for debuggin step by step !!
}

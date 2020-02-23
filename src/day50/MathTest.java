package day50;

import java.util.Arrays;
import java.util.List;

public class MathTest {


    public static void main(String[] args) {

        // final variable inside block called local v
        final int i ;
        i = 20 ;
        System.out.println(i);

        Addition q1 = new Addition(5,5);
        q1.calculate();
        System.out.println(q1);
        Addition q = new Addition(-2,0);
        q.calculate();
        System.out.println("q = " + q);

        Subtraction q2 = new Subtraction(100,100);
        q2.calculate();
        System.out.println(q2);

        Multiplication q3 = new Multiplication(10,10);
        q3.calculate();
        System.out.println(q3);

        Division q4 = new Division(10,5);
        q4.calculate();
        System.out.println(q4);


        List<Question> allTestQuetions = Arrays.asList(q1,q2,q3,q4);
        for(Question eachQ : allTestQuetions){
            System.out.println("Each Quetion = " + eachQ);
        }
    }
}

package day30;

import java.util.Arrays;

public class SplitPractice {

    public static void main(String[] args) {

        String car = "Lexus-IS-F" ;
        String[] carSplitted = car.split("-"); // it splitting 3 array item ! 2 dash
        System.out.println("carSplitted = " + Arrays.toString(carSplitted));

        String model = carSplitted[2];
        System.out.println("model = " + model);



        String [] carSplitted1 = car.split("-",2); // Lexus first array carSplitted[0] and IS-F second array
        System.out.println("carSplitted1 = " + Arrays.toString(carSplitted1));


        String model1 =carSplitted1[1];
        System.out.println("model 1 = " + model1);

    }
}

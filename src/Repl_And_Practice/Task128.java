package Repl_And_Practice;

public class Task128 {

    public static void main(String[] args) {

        int k = 0;
        double total = 0;
        double avgTemp = 0;

        double [] temps = {10,20,30,40,50,60,70,80} ;

        int arraySize = temps.length;

        for (int i = 0; i <temps.length ; i++) {
            avgTemp = temps[i]/arraySize ;

        }
        System.out.println(avgTemp);
    }

}

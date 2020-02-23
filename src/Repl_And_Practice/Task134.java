package Repl_And_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task134 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);


    }
}

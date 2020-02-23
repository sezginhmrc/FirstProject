package DecemberArray;

import java.util.Arrays;

public class SplitArray {

    public static void main(String[] args) {

        String sentence = "Java is fun";
        String reversed = "";

        String [] split = sentence.split(" ");
        for (int i = split.length-1; i >=0 ; i--) {
            reversed += split[i] + " ";
            //   System.out.print(split[i]+" ");
        } reversed = reversed.trim();
        System.out.println(reversed);

    }

    }


package day07;

import java.util.Scanner;

public class ReplTest20 {
    public static void main(String[] args) {

        int hour, minute, second ;
        String  am0rPm ;

        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        am0rPm = sc.next ();

        System.out.println(hour + ":" + minute + ":" + second + "" +am0rPm );
    }
}

package day24;

public class ArrayOdev {

    public static void main(String[] args) {

        int [] myNumbers = new int [3];
        myNumbers [0] = 10;
        myNumbers [1] = 40;
        myNumbers [2] = 30;


        // 1.1 i WANT TO add 1 to the second item value
        myNumbers[1] = myNumbers[1] + 1 ;
        System.out.println(myNumbers[1]);

        // 1.2 i WANT TO double the second item value
        myNumbers[1] = myNumbers[1] * 2 ;
        System.out.println(myNumbers[1]);

        // 1.3 I want to assign 3 item value to
        // sum of first and second item


        //1.3 sum of first and second to third!
        myNumbers[2] = myNumbers[0] +myNumbers[1];
        System.out.println(myNumbers[2]);

        //1.4 Swap the first item value with last item value

        int temp = myNumbers[0];

        myNumbers[0] = myNumbers[myNumbers.length-1];
        myNumbers[myNumbers.length-1] = temp ;


        System.out.println(myNumbers[0]);
        System.out.println(myNumbers[2]);

        // one line one statement is different each other







    }
}

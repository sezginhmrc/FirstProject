package day17;

public class FizzBuzzTEst {
    public static void main(String[] args) {


        int num =1 ;
        while (num<=47){

        if(num%5==0 && num%3==0) {
            System.out.println(num + " is Fizz Buz Number");
        }  else if (num%5==0){
            System.out.println(num + " is Fizz Number");
        } else if (num%3==0){
            System.out.println(num+" is Buzz Number");
        }
            ++ num ;
        }

    }
}

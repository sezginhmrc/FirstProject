package day12;

public class FizzBuzzNumber {
    public static void main(String[] args) {

      /*  int num = 99;

        if (num%3==0 && num%5==0) {
            System.out.println("FizzBuzz Number");
        } else if (num % 3 == 0) {
            System.out.println("Buzz Number");
        } else if ( num%5==0) {
            System.out.println("Fizz NUmber");
        } else {
            System.out.println("NOT MY NUMBER");
        }*/

        FizzBuzzNumber.fizBuz();
    }




    private  static void fizBuz (){

        for (int i = 0; i <=30 ; i++) {

            if(i%3==0){
                System.out.println("Sezgin");
            }  if (i==5){
                System.out.println("Ozlem");
            }  if ((i%3==0 && i%5==0)){
                System.out.println("SEZGINOZLEM");
            }


        }


    }
}

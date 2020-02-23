package day31;

public class MethodPractice3 {

    // Create a class called MethodPractice4
    // no need for object when being called                : static
    // it should be accessible anywhere in your project    : public
    // it does not return any value                        : void
    // does not need any external data when being called   : (nothing inside)

    // Create a method called countDownFrom20tillOne
    // Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
    // Create a method to spell your name :  Seda -->> S-e-d-a

    public static void countDownFrom20tillOne(){ // whole line Method Header !

        for (int i = 20; i >=1 ; i--) {    // until line 20 it is called Method Body !
            System.out.print(i+" ");

        }
        System.out.println();
    }

    public static void print0ddNumbers1to100(){
        for (int i = 0; i <=100 ; i++) {
            if(i%2==1){
                System.out.print(i + " ");
            }
        }
        System.out.println("======");
    }

    public static void  nameSpell() {
        String name = "Ozlem";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + "-");
        }
    }

    public static void main(String[] args) {

        countDownFrom20tillOne();
        print0ddNumbers1to100();
        nameSpell();

    }
}

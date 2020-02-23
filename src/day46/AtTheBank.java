package day46;

public class AtTheBank {

    public static void main(String[] args) {

        CheckingAcoount c1 = new CheckingAcoount("Sezo",123456,1000);
        c1.deposit(3000);
        System.out.println("c1.toString() = " + c1.toString());
        c1.deposit(5000);
        System.out.println("c1.toString() = " + c1.toString());




    }
}

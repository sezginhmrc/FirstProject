package day50;

public class Multiplication  extends Question {

    public Multiplication(int num1, int num2) {
        super("*", "Multiplcaition");
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate() {
        answer = num1 * num2;
        // we inhertid this variables from Super class
        calculated = true;
    }

    public String toString() {
        if (calculated == true) {
            return //super.toString()
                    num1 + operator + num2 + " = " + answer;
        } else {
            return num1 + operator + num2 + " = ";
        }
    }
}

package day50;

public class Division extends Question {

    public Division(int num1, int num2) {
        super("/", "Dvision");
        // swampping logic in orde to make a logical division
        if (num1 < num2) {
            int tem = num1;
            num1 = num2;
            num2 = tem;
        }
        this.num1 = num1;
        this.num2 = num2;

    }

// We creating different implementation of calculate method
    // like division calculate has its own division body
    // like addition calculate has  its own additiob body
    @Override
    public void calculate() {

        // if num2 is 0 instead of throwing error, lets make answer 0
        // if num2 is 0 return 0
        if (num2 == 0) {
          answer = 0;
        } else {
            answer = num1 / num2;
            calculated = true;
        }

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

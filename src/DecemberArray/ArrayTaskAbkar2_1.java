package DecemberArray;

public class ArrayTaskAbkar2_1 {

    public static void main(String[] args) {

        //2, loop through each prices  and print them in one line
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        float sum = 0;
        float average = 0;

        for (float s : prices) {
            if (s < 3) {
                System.out.println("Price under $3 is " + s);
            }


        }
    }
}

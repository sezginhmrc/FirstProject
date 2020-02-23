package DecemberArray;

public class ArrayLoop {

    public static void main(String[] args) {

        int [] numbers = {2,4,8,16,32,64};

        System.out.println("size of numbers is " + numbers.length);

        for (int i = 0; i <numbers.length ; i++) {
          //  System.out.println(numbers[i]);
                if (numbers[i]%2==1){
                    System.out.println("Even numbers is " + numbers[i]);
                }
        }

        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[numbers.length/2]);
        System.out.println(numbers[numbers.length/2-1]);


    }





}

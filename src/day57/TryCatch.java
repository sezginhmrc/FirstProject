package day57;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Before TRY CATCH");
        try {
            System.out.println("In first Try Block");
            int result = 10/0;
            System.out.println("After 10/0 line");
        } catch (ArithmeticException e){
            System.out.println("Exception happened, and was caught and handled " );
        }
        System.out.println("After TRY CATCH");
        // Analyize which lines ran.
        try {
            System.out.println("IN second Try Block");
            String  str = "java is fun";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        } catch ( Exception e ){
            System.out.println("Exception happened in try Block and caught !");
        }
        System.out.println("After Second TRY CATCH");



        try {
            // System.out.println(9 / 0);
            int[] arr = {1,2,3};
            System.out.println(arr[50]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception is handled");
        } catch (IndexOutOfBoundsException e){
            System.out.println("index out of bondException is handled");
        } catch (ArithmeticException e){
            System.out.println("Airthmatic exception is handled");
        } catch(IllegalStateException e){
            System.out.println("Illigal State exception");
        }catch (RuntimeException e){
            System.out.println("Runtime ");
        } catch( Exception e){
            System.out.println("Exception");
        }
        System.out.println("Test Completed");


        int[] numbers = {10,20,30,40};
        System.out.println(numbers[0]);
        try {
            System.out.println(numbers[100]);
        } catch (RuntimeException e){
            System.out.println("Runtime exception is occured");
        }
        System.out.println(numbers[2]);
        System.out.println("test completed");
    }
    }


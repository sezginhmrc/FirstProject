package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String name1 = "Sezgin";
        System.out.println("Chracter at what index you want to get from Sezgin's name ? ");
        try {
            int targetIndex1 = scan.nextInt() ;
            System.out.println(name1.charAt(targetIndex1));
            System.out.println("end of try");
        } catch (StringIndexOutOfBoundsException e){ // as i user if i input character instead of number ? (etc ebc)
                                                     // now multi catch block ocoours
                                                     //
            System.out.println(e.getMessage());
            System.out.println("your are out of bound !");
            System.out.println("You better to enter a number between 0 and  " +name1.length());
        } catch (InputMismatchException i){
            System.out.println("input mismatch, enter a Number !!");
        }  catch ( Exception e) {
            System.out.println("If i dont catch above 2 type i will come here!!");
        }
        System.out.println("The end ");


    }
}

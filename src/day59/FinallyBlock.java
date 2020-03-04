package day59;

public class FinallyBlock {

    public static void main(String[] args) {

        int [] nums = {1,4,6};
        //  System.out.println(nums[22]);

        try{
            System.out.println(nums[5]); // index out of bond
        } catch (Exception e ){
            System.out.println("Exception caught\n" + e.getMessage());
        } finally {
            System.out.println("This code will always run no matter we have expection or not");
        }


        // What is the difference final and finally keyword ?
        // FINAL IS NON ACCESS MODIFIER and it can be used variables, block, methods, classes
        // it is used for restricting some functionalities
        // idea of final variable is to be constant variable
        // you can not reassign final variable
        // idea of final method is cannot be overidden
        // idea of final class is cannot be superclass


        //FINALLY IS A BLOCK ALONG TRY CATCH BLCOK
        // Finally block code will be executed if we have exception or not
        // Finally is part of try catch block
        // Finally block always run






        //catch ( ArrayIndexOutOfBoundsException a){ // if expection is caught we can not create another catch block !
        //System.out.println("Esma ");
        //     }




    }
}

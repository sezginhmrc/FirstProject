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





        //catch ( ArrayIndexOutOfBoundsException a){ // if expection is caught we can not create another catch block !
        //System.out.println("Esma ");
//     }




    }
}

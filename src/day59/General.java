package day59;

public class General {

    public static void main(String[] args) {

        Object o = "abc";
        // Can i get the first char using o ?
        System.out.println("The start");
        String str = null ;

        try {
            System.out.println(str.charAt(0));
            System.out.println("End of try");
        } catch (NullPointerException bla ){
            System.out.println("No object Here.");
            System.out.println("bla.getMessage() = " + bla.getMessage());
        } catch (Exception e ){
            System.out.println("This is the rest of expections");
        }
        System.out.println("The end");

        // order is top to buttom once it's caught from first catch block it not even gonna bother to next catch blocks
        // Exception is at the top of all other expections
        // if it was before nullPointerExpection it would be caught for expection object


    }
}

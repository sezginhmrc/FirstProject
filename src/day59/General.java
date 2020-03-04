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

        // COMMAND OPTION T --->>>> TO SHORTCUT OF TRY CATCH



        // order is top to buttom once it's caught from first catch block it not even gonna bother to next catch blocks
        // Exception is at the top of all other expections
        // if it was before nullPointerExpection it would be caught for expection object

        // EXCEPTION IS SUPER CLASS AND IT IS AT THE TOP OF ALL OTHER EXCEPTIONS
        // WHY DO WE NEED THROWS AND THROW ?
        // SOMETIMES YOU MIGHT HAVE DIFFERENT EXCEPTIONS
        // EVEN WE DO MULTIPLE CATCH  BLOCK
        // IF WE THINK O PROGRAM MIGHT THROW AN EXCEPTION
        // WE USE THROW AND THROWS.
        // AND WE CAN NOT CATCH EVERY EXCEPTION ACCORDINGLY TO ACTION



    }
}

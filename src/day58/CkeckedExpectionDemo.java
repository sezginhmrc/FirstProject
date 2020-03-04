package day58;

public class CkeckedExpectionDemo {

    public static void main(String[] args) {

        System.out.println("Checked Expection in next line");

        try {
            Thread.sleep(5000);
            System.out.println("In try block "); // this executed because no exception !!
            // it pauses it  for a 5 second
            // pausing and printing according the millis
            //Thread.sleep just pauses the application then continues after certain time,
        } catch (InterruptedException e ){
            System.out.println("Exception is caught!");
        }

        System.out.println("After thread it");






        System.out.println("Before try catch");
        try{
            System.out.println("HEllo from try block");
            String str = null ;
            System.out.println(str.length());
            System.out.println("THIS LINE DOESNT RUN");
            System.out.println("OLSUN");
        }  catch ( Exception e){
            System.out.println("EXPECTION happned and caught" + e);
        } finally {
            System.out.println("Finally block, Run if there is expection or no expection");
        }

    }
    }


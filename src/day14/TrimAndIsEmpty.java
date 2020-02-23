package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {

        // trim features
        String message = "     REPL IS COMING !    ";
        System.out.println(message);
        System.out.println("message character count is "+ message.length());
        System.out.println(message.isEmpty());
        message = message.trim(); // it cuts spaces !!
        System.out.println(message);
       // System.out.println(message.trim());
        System.out.println("message character count is "+ message.length());
        // empty
        System.out.println( message.isEmpty() ); // it checks if it is "" or not !!

    }
}

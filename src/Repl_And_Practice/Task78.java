package Repl_And_Practice;

public class Task78 {
    public static void main(String[] args) {

        String message = "Sender:<Mike Tayson>. From Number [202-123-2323]. Message: {I love programing and problem solving}";
        String sender ;
        String phoneNumber;
        String messageBody;


        sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        phoneNumber = message.substring(message.indexOf("[")+1,message.indexOf("]"));
        messageBody = message.substring(message.indexOf("{")+1,message.indexOf("}"));

        System.out.println("Sender: " +sender);
        System.out.println("Phone Number: " +phoneNumber);
        System.out.println("Message body: " + messageBody);

        //output
        //Sender: Mike Smith
        //Phone Number: 202-123-3456
        //Message body: I love programing and problem solving

    }
}

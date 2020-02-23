package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {
    //Create 1 subClass SlackAdminUser
    //attribute :
         //	 adminId
    //behaviour :
        //	 sendAtChannelMessage
        //	 deleteMessage
        //	 addChannel
        //	 toString method
    //   constructor :
       //	 3 argument constructor to set all fields value

    //protected String name
    // protected String status ;

    int adminId;

    // This my 3 arg Constructor
    public SlackAdminUser(String name, String status, int adminId) {
        this.adminId = adminId;
        this.name = name;
        this.status = status;
    }

    public static void main(String[] args) {
        SlackAdminUser s1 = new SlackAdminUser("Sezgin", "Online", 102);
        // inherited methods we are calling
        s1.sendMessage();
        s1.callSomeone();
        s1.addEmoji();
        // our own methods we are calling
        s1.sendAtChannelMessage();
        s1.deleteMessage();
        s1.addChannel();
        System.out.println("s1 = " + s1);
    }

    public void sendAtChannelMessage() {
        System.out.println(name + " sending channel message ");
    }

    public void deleteMessage() {
        System.out.println(name + " deleting slack mesages");
    }

    public void addChannel() {
        System.out.println(name + " adding new channels");
    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

package day12;

public class CheckinStringEqualityWithoutCase1 {
    public static void main(String[] args) {

        String userName = "abc123" ;

        boolean userNameCorrcet = userName.equals("ABC123");

        System.out.println( userNameCorrcet);

        boolean nameCheckUsercase = userName.equalsIgnoreCase("ABC123");

        System.out.println( nameCheckUsercase);



    }
}

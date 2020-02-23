package day13;

public class NestedIf_DoYouWannaShop {

    public static void main(String[] args) {

        //create a boolean store the result of you want to shop
        // if yes, do you want to go to the Store or do you wanna shop online
        // if user do not want to shop at all, print GOOD JOB

        boolean youWantToShop = true;
        String preference = "online";

        if (youWantToShop == true) {

            if (preference.equals("Store")) {
                System.out.println("GOING TO STORE SHOPPING");
            } else {
                System.out.println("GOING TO ONLINE SHOPPING");
            }

        } else {
            System.out.println("GOOD JOB");
        }

    }


}

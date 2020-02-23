package Repl_And_Practice;

import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {
        //create a boolean store the result of you want to shop
        // if yes, do you want to go to the Store or do you wanna shop online
        // if user do not want to shop at all, print GOOD JOB

        Scanner shoppingMethod = new Scanner(System.in);
        System.out.println("DO YOU WANT TO SHOP ?");
        boolean wantToShop = shoppingMethod.nextBoolean();

        System.out.println("WHAT IS THE WAY YOU SHOPPIG ?");
        String onlineOrStore = shoppingMethod.next();

        if(wantToShop==true) {
            if (onlineOrStore.equals("Online")) {
                System.out.println("GOING TO ONLINE SHOOPING");
            } else {
                System.out.println("GOING TO STORE SHOPPING");
            }
        } else {
                System.out.println("GOOD JOB");
            }

        }






    }


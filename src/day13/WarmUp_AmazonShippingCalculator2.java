package day13;
public class WarmUp_AmazonShippingCalculator2 {
    public static void main(String[] args) {
        // create a boolean store the result of youWantToShop
        // if yes , do you want to go to Store or do you wanna shop online
        // if user do not wanna shop at all , print good job stay home coding !!!!
        boolean youWantToShop = false ;
        String preference = "Store" ;
        //if(youWantToShop )

        if( youWantToShop == true  ) {
            if( preference.equals("Store" ) ){
                System.out.println("GOING TO STORE FOR SHOPPING");
            }else {
                System.out.println("GOING TO ONLINE FOR SHOPPING");
            }
        }else {
            System.out.println("good job stay home coding !!!!");
        }
    }
}





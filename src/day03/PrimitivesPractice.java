package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {


        byte letterCount = 26;
        System.out.println("The letter count is " +letterCount );


        short sheepCount = 300;
        System.out.println("The sheep count is  "+sheepCount);


        int catCount = 20 ;
        System.out.println("The cat count is  "+catCount);


        long mileToMoon = 5000000L ;
        System.out.println("The mile to moon is  " + mileToMoon);


        long mileToSun = 1000000L ;
        System.out.println("The mile to sun is "+mileToSun);




        // ------floating point-------
        // you must add f at the end of number to indicate this is float data type
        // lowercase or Uppercase does not matter


        float priceOfBanana = 1.99f ;
        System.out.println("the price of banana is  "+priceOfBanana);
        float priceOfPotato = 2.49f ;
        System.out.println("the price of potato is  "+priceOfPotato);

        //----- larger floating point number ------

        double priceOfIpad    = 355.99d ;
        System.out.println("the price of ipad is  "+priceOfIpad);

        double priceOfIpadPro = 1024.99D ;
        System.out.println("the price of ipadpro is "+priceOfIpadPro);

        //complier automatically assume it's a double so it's not reqired to have d
        //However for good programming habbit, add them always
        double priceOfMac     =2299.99 ;
        System.out.println("the price of mac is "+priceOfMac);



        ///*If you have a whole number by itself complier automatically assume it's an int
        ///*If you have a fractional number by itself complier automatically assume it's an double







    }


}

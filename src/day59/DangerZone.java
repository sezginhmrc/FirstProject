package day59;

import java.io.IOException;

public class DangerZone {

    public static void main(String[] args) throws IOException  {

        // WE MUST DECLARE IT OR HANDLE IT PLAYWITHFIRE METHOD SINCE IT THROWS IOEXCEPTION

        // We handled it by try catch
        // Throws is a document the method might throw exception
        try {
            playWithFire();
        } catch (Exception e) {
            e.printStackTrace();
        }


        // We declared it by adding throws keyword method signature
        playWithFire();

    }



    // this is a method that declare it might throw a checkedException IOEXCEPTION
    // whoever calls handle the consequences themselves.

    // it throws a checked expection
    // and we can only handled it by handle or declare

    public static void playWithFire() throws IOException{
        System.out.println("some consequences might happen");
    }
}

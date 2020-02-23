package day59;

import java.io.IOException;

public class DangerZone {

    public static void main(String[] args)   {

        // We handled it by try catch
        // Throws is a document the method might throw expection
        try {
            playWithFire();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // this is a method that declare it might throw a checkedException IOEXCEPTION
    // whoever calls handle the consequences themselves.

    // it throws a checked expection
    // and we can only handled it by handle or declare
    public static void playWithFire() throws IOException{
        System.out.println("some consequences might happen");
    }
}

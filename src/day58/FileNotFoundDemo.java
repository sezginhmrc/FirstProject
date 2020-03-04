package day58;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("BEFORE TRY CATCH");
        try {
            Files.readAllLines(Paths.get("file.txt"));
            System.out.println("Try block");
            System.out.println("NOt being printed");
        } catch (IOException e){
            System.out.println("EXCEPTION HAPPEND AND CAUGHT !" +e) ;
        }
        System.out.println("AFter try catch");


        Files.readAllLines(Paths.get("GroupBela"));
        // THrows is used for checked Exceptions




    }
}

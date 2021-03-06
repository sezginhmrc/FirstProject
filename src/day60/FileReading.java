package day60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileReading {

    public static void main(String[] args) throws IOException {

        // reading a file is one line of code as below
        // it return List of String as each line as element

        try {
            List<String> allLines = Files.readAllLines(Paths.get("src/day60/Heros"));
            // PRINTING ALL LINES AT HERE !!
            for (String eachLine : allLines) {
                System.out.println(eachLine);
            }
        } catch (Exception e) {
            System.out.println("BOOM");
            System.out.println("e.getMessage() = " + e.getMessage());
        }
            // here we declared checked Exception by throws IOexception and handled with try catch block

        // We need add throws in method signature
        // make compile happy and declare the exception
        // Files.readAllLines (Paths.get ("copy of file path")

        List<String> NotesThrowAndThrows = Files.readAllLines(Paths.get("src/day60/Note.txt"));
        System.out.print(NotesThrowAndThrows);
        System.out.println();


        List <String> cities = Files.readAllLines(Paths.get("src/day60/Cities.txt"));
        System.out.println(cities);

    }
}
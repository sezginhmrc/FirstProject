package day48;

import java.util.Arrays;
import java.util.List;

public class HR_STUFF {
    public static void main(String[] args) {


        // employe is abstract super type
        // HourlyEmployee and FulltimeEmployee is spesicic type

        // if we have Employe data type for e1 variable
        // we can write down the adres of anything IS-A employe

        Employee h1 = new HourlyEmploye("Sezgin", 101, 55, 200);
        h1.calculateSalary();
                 h1 = new FullTimeEmployee("Esma", 103, 10000);
        h1.calculateSalary();

        Employee h2 = new HourlyEmploye("Roksana",102,56,2080);
        Employee h3 = new FullTimeEmployee("Dennis",104,10000);

        // How Can i store this 3 objects together ?

        List <Employee> allEmploye = Arrays.asList(h1,h2,h3);


        // to see everything inside in ArrayList ?

        for (Employee each : allEmploye){
          //  System.out.println("each = " + each);
            System.out.println("Name is " + each.name);
            each.calculateSalary();
        }


        // in real life Any Animal could be reference by Animal (dog, cat, vb)
        // Q1 What Can I do with Abstract type ?
        // A1 ABSTRACT type !


    }
}

package day55.Association2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseXRunner {

    public static void main(String[] args) {


        List<Student> myList = new ArrayList<>();
        // old fashion way
        myList.add(new Student("Sezgin",12));
        myList.add(new Student("Hasan",13));
        myList.add(new Student("Zehra",14));
        myList.add(new Student("Ayjeren",15));

        CourseX c = new CourseX("HAS-A",myList);

        //adding new student the way String class creataion
        c.addStudent(new Student("Esma",16));
        c.addStudent("Goksel",17);
        System.out.println(c);


    }
}

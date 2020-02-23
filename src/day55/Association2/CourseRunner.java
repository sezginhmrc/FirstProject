package day55.Association2;

import day55.Association2.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

// Swap 2 varaiable without using third variable

        int a = 50 ;
        int b = 100 ;
        a = a+b ; // a = 50 +100 = 150
        b = a-b ; // b = 50 - 100 = -50
        a = a-b ;  // a = 150-50 ;
        System.out.println(a);

       // using empty variable
        int x = 100 ;
        int y = 50 ;
        int tem ;

        tem = x ;
        x = y ;
        y = tem ;
        System.out.println(x);
        System.out.println(y);


        // First We created a list and filled it that we can add this list inside our object
        // Constructor has Subject and List (StudentNames)
        // This  Constraction occurs creation an object ..

        List<String> lst = new ArrayList<>(Arrays.asList("Muge","Sumeyye","Hasan","Zehra"));
        // We declared List new ArrayList <>Arrays.asList(...)
        // That We can update it.

        Course java = new Course("Java",lst);
        System.out.println(java);
        java.studentNames.add("Sezgin");
        // studentNames is a list it should be a list while creating object

        // I wanna add a few more student my jaa course

        java.addStudent("Gail");
        java.addStudent("Muhammed");
        java.addStudent("Ayse");

        // Bad Idea if we have more class and wanna add more student that class
       /* java.studentNames.add("Gail");
        java.studentNames.add("Muhammed");
        java.studentNames.add("Ayse");
        java.studentNames.addAll(Arrays.asList("Serife","Esma","Gulnazli"));*/
       java.addManyStudent(Arrays.asList("Esma","Gulanizli","Serife"));

        System.out.println("Afer adding  more student = " +java.studentNames);
        // We added more people to lst
        System.out.println(lst);
        System.out.println(java);

        Course selenium = new Course("Selenium",new ArrayList<>(Arrays.asList("Muge","Sumeyye","Hasan")) );
        selenium.addManyStudent(Arrays.asList("Esma","Sezgin"));
        selenium.addStudent("GIRAL");
        selenium.studentNames.add("KIRAL");
        System.out.println(selenium);
    }
}

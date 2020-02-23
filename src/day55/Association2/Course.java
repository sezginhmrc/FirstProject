package day55.Association2;

import java.util.List;

public class Course {

    String subject ;
  // String [] studentNames ; this will work but fixed in size (Array)


    List<String> studentNames ; // ASSOCIATION HERE
    // Course object have its own life time
    // Students have its own life time
    // no need inheritance realationship
    // Basically building realationship using the instance variables
    // Course HAS A  Student


   // ArrayList is dynamic size
    // We can crud (create read update delete)
    // List can be data type member

    public Course(String subject, List<String> studentNames) {
        this.subject = subject;
        this.studentNames = studentNames;
    }


    public void addStudent(String name){
        studentNames.add(name); // it is a list of string
    }
    public void addManyStudent(List<String> student){
        studentNames.addAll(student);
    }
    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}

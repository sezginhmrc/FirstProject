package Office_hour;

import java.util.Arrays;
import java.util.List;

public class Student {
    //create a class called Student:
    //			instance variables: String studentName
    //			initialize the ins variable within a
    //			constructor
    //	create a class called School:
    //			instance variables: String schoolName
    //								List<Student> AllStudentsList;
    //			initialize instance variables within a constrcutor
    //			create a method called addNewStudent() that can add students to the AllStudentsList
    //	create a class called AssociationExample:
    //			create 5 objects of the students class
    //			creata a List of students called CybertekStudents and store those 5 objects into the List
    //			create the object of the School and initialize school name to "Cybertek"
    //			add two more new students "Denis" and "Irina" to cybertek school' student list
    //			use for each loop to print out entire cybertek student' names
    String studentName ;

    public Student(String studentName) {
        this.studentName = studentName;
    }

}

 class School {

    String schoolName ;

    List<Student> allStudentList ;

     public School(String schoolName, List<Student> allStudentList) {
         this.schoolName = schoolName;
         this.allStudentList = allStudentList;
     }

     public void addNewStudent(Student student){
         this.allStudentList.add(student);
     }
     public  void addNewStudent(Student[] students){
         this.allStudentList.addAll(Arrays.asList(students));
     }
     public void addNewStudent(List<Student> listOfStudents){
         this.allStudentList.addAll(listOfStudents);

     }

 }
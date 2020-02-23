package day47;

public class Student {

   final int studentId ;

   public static final String SCHOOL = "Cybertek";
   // it is constant !!!
    // if interview asks how do i define CONSTANT for this
    // you would say will create public static final field like above
    // it is italic and and UPPERCASE
 //  A constant is a variable whose value cannot change once it has been assigned.


    public  Student( int studentId){
        this.studentId = studentId ;

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                '}';
    }
}

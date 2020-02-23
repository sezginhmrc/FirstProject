package day47;

public class FinalVariablesPractice {

    public static void main(String[] args) {

        Student s1 = new Student(101);
        System.out.println("s1 = " + s1);
        // final is object s1 not attribute

        // since my studentId attribute is not final
        // i can reassign it
      //  s1.studentId = 200 ;
     //   System.out.println("s1 = " + s1.toString());

        System.out.println(Student.SCHOOL);

        // cannot change it because of final
      //  Student.studentNo = 28 ;

        System.out.println(Byte.MAX_VALUE);
        // this BYTE class's is final value is 127 cannot be change


        // PI in java
        System.out.println(Math.PI);


        printDoubledNumber(12);
        printDoubledNumber(2);
        printDoubledNumber(10);
        printDoubledNumber(3);


      // a void method that accept a number an print out doubled number
      // anywhere we declare a variable we have option  to make it final
        // making method parameter final
        // it will make the method only use the argument user passes without modifying it


    }

    public static void printDoubledNumber( final int x){
        System.out.println(x*2);
    }



}

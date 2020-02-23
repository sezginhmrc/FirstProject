package day44;

public class Student1 extends Person1{
    // protected     String name;
    //  protected     int age;
    //   private String gender ;

    // above  super class attributes
    // protected means same package accessible so  i can access it here,
    // even it is in different package by means of sub class we could still access it

    // This is my Sub class attribute
    int studentId ;


 public void show(){
     // overrides person1 show
    // overriding have same method name same signature in super class
   super.show(); // calling super class method
    System.out.println("Sub class called");
    // overriding is about inheritance !!!!
     // i can override here in sub class
     // purpose of overriding is unique implementation
}
    // this is my subclas behavior
    public void studentGrade (int grade){
        if(grade == 4){
            System.out.println("Our student going to graduate at the end of this year");
        } else if ( grade>0 && grade<3 ) {
            System.out.println("Our student is still full time student");
        }
    }

    public static void main(String[] args) {

        Student1 p1 = new Student1() ;
        // it is all about the referenced object after = part :)
        // that determines which version of an overridden method will be executed.
        p1.show(); // overriding here

        System.out.println("p1 = " + p1);
        p1.age = 14 ;
        System.out.println("p1 = " + p1);

        Student1 s1 = new Student1();
      //  Student1 s1 = new Student1(); //
        s1.studentGrade(4); // called my sub class method
        s1.studentId = 688 ; // called my sub class instance variable
        System.out.println("s1.studentId = " + s1.studentId);
        System.out.println(s1);

        // now since i inherit the super class(Person1) behaviours and attributes
        // i can call them here
        s1.name = "Sezo";
        System.out.println("s1.name = " + s1.name);
        s1.name = "Oz";
        System.out.println("s1.name = " + s1.name);
        s1.age = 25 ;
        System.out.println("s1.age = " + s1.age);
        System.out.println(s1);
        // since gender is private  onlly accesuble same class
        // i used the getter and setters to be call them outside class
        s1.setGender("Male");
        System.out.println("s1.getGender() = " + s1.getGender());
        s1.talk();
        s1.walk();
        // hascode beacuse  don't have a toString method in super class
        System.out.println("s1 = " + s1);

        Person1 s2 = new Student1();
        System.out.println("s2.age = " + s2.age);
        System.out.println("s2.name = " + s2.name);
        s2.setGender("male");
        System.out.println("s2.getGender() = " + s2.getGender());
    }

}

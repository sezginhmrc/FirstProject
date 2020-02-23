package day44;

public class Person1 {
    // This is my super class

  protected     String name;
       int age = 23 ;
  private       String gender ;

  /* public Person1(){
     System.out.println("default constructor");
    }*/
    void   show(){
        System.out.println("Super class called");
    }
    public void walk (){
        System.out.println(name + " walking around the town");
    }
    public void talk (){
        System.out.println(name + " speaking loud in the public");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    // this is constructor
   /* public Person1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }*/
}

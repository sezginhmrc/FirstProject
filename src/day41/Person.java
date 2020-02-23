package day41;
// this class is about encapsulation
public class Person {


    //Good Encapsulation practice is :
    // •Making instance fields private
    // •Provide public methods to access data or modify data

    // all the variable and methods here called instance variable and instance methods
    private String name ;
   private int age ;
  private long ssn ;
  // only accessible only same class (it means you can call them to modify by another class)
    // Attributes of person class object can only be accessible here this class
    // and modified by getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// getter is return type and it returns instance variable
    public int getAge() {
        return age;
    }
// setter is void and one arg wee need pass an arg
    public void setAge(int age) {
        this.age = age;

    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }
/* // what if i want to only get the name
    public String getName(){
        return name;
    }
    // what if i want to only change the name
    public void setName (String newName){
        name = newName;
    }
     // i want to get the age
    public int getAge(){
        return age ;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    // i want to get the ssn
    public long getSsn(){
        return  ssn ;
    }
    public void setSsn(long newSsn){
        ssn=newSsn;
    }*/
public void eat(){
    System.out.println(name + " Eating");
}


   // write a method to give to the field
   public void setAll (String newName , int newAge, long newSnn){
     // you can put whatever check here to make sure
       // the data is correct or any other logic
       name =newName;
       age = newAge;
       ssn = newSnn;
   }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}

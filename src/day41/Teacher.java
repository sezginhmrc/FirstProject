package day41;

public class Teacher {
    
    private String name ;
    private  int age ;
    // bad idea to have main method here, anyway lets do it


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // a method to set both age and name
    public void initializeFields(String name , int age){
        setName(name);
        setAge(age);

    }
    public static void main(String[] args) {
        Teacher t1 =new Teacher();


       // t1.setName("Sweaty");
     //   t1.setAge(25);
        t1.initializeFields("Sezgin",26);

        System.out.println("t1.getAge() =  " + t1.getAge());
        System.out.println("t1.getName()= " +t1.getName());



    }
}


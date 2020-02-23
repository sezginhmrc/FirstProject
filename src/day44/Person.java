package day44;

public class Person {
    // instance field : belong to the instance(object)
    // every Person object will get their own name and age
    // changing the value of one object does not affect another
    private String name;
    private int age;

    //static field initialized
    static double salary = 100000.0;

    // static field : belong to the class (type itself)
    // there is only one copy of this value shared by all the objects
    // created out of this Person template|blue print

    // this is static field
    public static String species ;
    // We don't need object to create static field
    // i can directly call them by its name
    // they belong to class

    // this is static method
    public static void showInfo(){
        System.out.println("Salary of this person is = " + salary);
        // we can only call static members in the static method
    }

        // consturctor with 2 arg
        public Person(String name, int age) {
        this.name = name;
        this.age = age;
   }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}


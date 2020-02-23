package day48;

public abstract class Employee {

    String name ;
    int id ;

    // better to add empty Constructor
    public Employee(){
    }

    // all kind of employe object are common in name and id
    // that why i provide a constructor here
    // every and each object that created declared by name and id
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    // This is abstract method
    // We provide a method which will be shared by all of its subclasses
    // Leave it to each subclass to fill in the details according their implemenation

    public abstract void calculateSalary ();

    public abstract String toString ();




}

package day51;


//Person IS-A Comparable
// yes it implements comprable interface
// COMPARABLE INTERFACE !
// it is a inheritance | Super-Sub relationship


public class Person implements Comparable <Person>{
    String name ;
    int age ;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // we created a reusable code here
    // any person i created it has a functionallty to compare a person with another person by age

    // we overridden this method from Comparable Interface
    // I put my logic here to copareTo method,
    // it will print according this logic
    // when we call it
    public int compareTo (Person anotherPerson){
       /* if(this.age > anotherPerson.age){
            return 1 ;
        } else if ( this.age < anotherPerson.age){
            return -1 ;
        } else {
            return  0 ;
        }*/
       // modifiy this method to make your natural order, comparing by name
    /*    if(this.name.charAt(0)>anotherPerson.name.charAt(0)){
            return  1 ;
        } else if (this.name.charAt(0)<anotherPerson.name.charAt(0)){
            return -1;
        } else {
            return 0;
        }*/
        return this.name.compareTo(anotherPerson.name) ;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }





}

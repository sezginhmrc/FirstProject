package day39;

public class StudentCreation {

    public static void main(String[] args) {
        
        // How do we create an object out of template
        // this our first object (Student)
        Student s1 = new Student();
        s1.name = "Sezgin";
        s1.age = 25 ;
        s1.gender = 'M';

        System.out.println("s1.toString() = " + s1.toString());


        System.out.println("s1 = " + s1.age);

        Student s2 = new Student();
        s2.name = "Juma";
        s2.age = 31;
        s2.gender = 'M';
        s2.age = 35 ; // updatin the value
        System.out.println("s2 = " +s2.age);

        /* *Variable types :
    according to what kind of data it store :
	primitive variable -->> pure value
	reference variable -->>
					the pointer to the object in the heap
					the address of the obejct in the heap
					remote of the TV
					leash of the dog
    according to the location it shows up :
	 inside method : --> local variable
	 inside ( ) of method header -->>
	 				method parameter
	 outside method inside class
	 		--> Field
	 			instance field or instance variable
	 			static filed (will learn later)
    * */
        // s1 and s2 is local variable inside method
        // instance(objects) field is in other class which called Student ( String name, int age, char gender)
        // reference variable is s1 and s2 and name is string that mean reference
        // primitive variable is  age , gender

        //Task
        //Akbar 4:36 PM
        //Create a Car Object template by creating a Car class
        //	it  has these attributes
        //		year , model , make , color


    }
}

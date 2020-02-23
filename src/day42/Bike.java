package day42;

public class Bike {
// this class about definition of CONSTRUCTOR

     int speed ;
     int gear ;


    // constructor is block of code (What is the Constructor) ;
    // that has same name as className
    // and has no return type (Constructor is not Method)
    // the only time you can call this is
    // when object is being created
    // WHY DO I NEED CONSTRUCTOR IS ??
    // we dont wanna get empty object
    // Answer you initializing the data types in one shot

    // you can only call constructor inside class
    public Bike(){  // this is my constructor without parameter
        System.out.println("Message from constructor ");
        gear = 1 ;
    }
    public Bike(int newGear){ // this my constructor with 1 parameter
        gear = newGear ;
        // this .gear = gear
    }
    public Bike (int speed , int gear){
        this.speed = speed;
        this.gear = gear ;

        // so far we have 3 constructor and 3 way to create constructor
        // How many constructor we have means we have that many way to create object
    }
    public Bike(String str){
        System.out.println("ACCEPT STRING");
    }

}

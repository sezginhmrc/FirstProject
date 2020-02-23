package day43;

// We just created our own Data type

public class Pet {

    // TASK
    // Pet
    //    attributes :
    //		type
    //		name
    //  constructor :
    //  		no arg constructor
    //  			set the type to "unknown"
    //  			set the name to "no-name"
    //  		2 args constructor
    //  			set the name and breed to what the caller passed
    // behaviours :
    // 		getters , setters , toString
    // 		speak
    // 			accept no parameter
    // 			according to the type speak following
    // 				cat --> meow
    // 				dog --> woof
    // 				cow --> mooo
    // 				horse --> neinei

   private String type ;
   private String name ;


    // constructor  no arg // default value constructor
    // main focus creating this default value constructor to avoid getting null value
    // All this methods behaviours are INSTANCE METHOD !
    // intance methods are most likely about use it to add behaviour to your object
    public Pet (){
        this.type = "unknown";
        this.name = "no-name";
    }
    // const with 2 param
    public Pet(String type, String name ){
        this.type = type;
        this.name = name;
    }

    // speak constructor
    public void speak(){
        if(type.equalsIgnoreCase("cat")){
            System.out.println("meov");
        }
       else if(type.equalsIgnoreCase("dog")){
            System.out.println("woff");
        }
        else if(type.equalsIgnoreCase("cow")){
            System.out.println("moo");
        }
       else if(type.equalsIgnoreCase("horse")){
            System.out.println("neiniein");
        }else {
            System.out.println("UNKNOWN ANIMAL");
        }
    }

    // adding a static method inside my class (my data type)
    // here i dont deal with any object !!!!!
    public static void showGeneralPetInfo(){
        System.out.println("Pets are firend of humans");
        //This won't work
        // STATIC METHOD CAN NOT ACCESS ANYTHING NON-STATIC
        // System.out.println(name);
    }

    // getters and setters
    public String getType(){
        return type ;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // toString method
    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

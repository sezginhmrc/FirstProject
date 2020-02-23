package day49;

public interface Juicy {

    void melt(); // it automatically  public abstaract

    // JAVA 8 added two features to the Interface
    // We can add default method with a body
    // We can also add static method with a body
    // Static method is have a body
    // Static method of interface are not inherited
    // this is kinda special static method in interfcae

    // this is static method in interface
    // THIS METHOD Doesn't have to overidden in my sub class
    // it is not gonna give an error
    // implicityl the method is always public
    // it must be called in static wa y
    static void squeeze(){
        System.out.println("static squezzeng");

    }
}

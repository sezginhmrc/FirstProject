package day48;

public interface Bouncible {

    // THIS IS INTERFACE SOURCE
    // IT MUST HAVE ABSTRACT METHODS



    // it has one Constant called gravity as double and assign 9.81
    public static final double gravity = 9.91 ;

    // if we don't add any part of public static final for the field
    // all INTERFACE field are automatically public static final

    // double gravity = 9.81 ;





    // it has 1 abstract methods called bounce
    public abstract void bounce ();

    // Every member of interface automatically PUBLIC
    // if no acces modifier is given
    // all the method no body aoutmatically PUBLIC ABSTRACT

    //   void bounce ();



}

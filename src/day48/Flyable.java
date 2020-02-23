package day48;


// this is how we create an interface
// interface is abstract type just like abctract class
// no object can be created from it
// it provide guideline for implementing classes
// it is like signing a contrcat

public interface Flyable {

    // an interface can only have public static final fiedl

    public static final boolean HAVE_WING = true;

    // can we have constructor ? ; NOOOOO !!!!

    public void fly ();

}

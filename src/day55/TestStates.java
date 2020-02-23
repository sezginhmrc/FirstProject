package day55;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestStates {

    public static void main(String[] args) {

        Kentucky s1 = new Kentucky();
        s1.tax();
        s1.KFC();
        s1.method(2);
        // the reference type decides what can be accessible
        // Kentucky is reference type
        // Kentucky class has 2 methods (Tax, Kfc)

        States s2 = new Kentucky();
        s1.tax();
        // States is reference type
        // States is abstrcat we cannot create object out of it
        // States clas has 1 methods (tax)
        // tax methods exist in states class and also existin kentucky class
        // it prints overridden one which is in Kentcuky

        States s3 = new California();
        s3.tax();
        // it prints overridden one in cali class
        // Kentucky k1 = new States();
        // sub class cannot be reference type to super class object




    }
}

        interface A {

        }

        class B implements  A {

            public static void main(String[] args) {

                A obj = new B();
                // super-type can be reference to child class object
                // polymorhisim only super type can reference to object
                // We cannot do like below
                // B obj2 = new A(); // cannot create object from interface
                // if interface is reference , the object must be created from non-abstr sub class



                }
        }

        class C {

        }
        abstract class D extends C {
            public static void main(String[] args) {
                //   C obj = new D (); // abstract can't be sub class !!

            }

        }

package day55;

// We learned that super(..) always should be the first line of the constructor

// This(..) also always should be the first line of constructor -> line 16
// This() used to call current class's constructor to reuse it's code


public class ThisKeyword {

    // any object created using this constructor
    // should call (int x ) constructor with value 100  !!

    public ThisKeyword(){
        this(100);
        System.out.println(" no arg cons");
    }

    // Requirement -> any object you created using this constructor must call no arg cons first(line 21)
    public  ThisKeyword(int x ){
      //  this(); // How we use this() keyword here
        System.out.println("one arg cons " +x);
    }

    public ThisKeyword(String s ){
        this(100);
        System.out.println("one arg cons String " +s);
    }

    public static void main(String[] args) {

        ThisKeyword t = new ThisKeyword();
        // this object called the one parameter constructor when being created
        // because of this keyword on ine 16

        ThisKeyword t1 = new ThisKeyword(1);
        // it's called it's own one parameter constrct when being created
        // constructor execution is depends on the creation of the object

        ThisKeyword t2 = new ThisKeyword("S");
        // look at line 26


    }
}

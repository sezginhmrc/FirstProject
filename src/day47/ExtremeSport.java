package day47;

public class ExtremeSport extends Sport{


    // since my super class method is Final
    // it cannot be overriddden here
    //@Override
//public void doSomething(){
  //  System.out.println("doing extreme sport");
//}
    @Override
    public void doSomethingElse(){
        super.doSomething();
        System.out.println("Doing extreme sport");
    }

    public static void main(String[] args) {
        ExtremeSport e1 = new ExtremeSport();
        e1.doSomething(); // stil can be used as is in here (sub class)
        e1.doSomethingElse();
    }
}

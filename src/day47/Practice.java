package day47;

public class Practice {
    // working on Access Modifiers
    // String class doesn't have subclasses because it based on Final keyword

    private void doSomething(){


    }
}
class JavaPractice extends Practice{

   public   void doSomething(){
        System.out.println("not overriing");

    }

    public static void main(String[] args) {

           JavaPractice j1 = new JavaPractice();
           j1.doSomething();
    }
}



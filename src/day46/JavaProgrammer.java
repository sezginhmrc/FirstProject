package day46;

public class JavaProgrammer extends Programmer {
    //unique behavior;

    public void drinkCoffer() {
        System.out.println("Java programmer drinks a lot of coffe");
    }

    public void doRepl() {
        System.out.println("JP doint repls at the time");
    }

    public void doJavaDevelopment() {
        System.out.println("JP is developing the apps");
    }

    
    
    @Override
    void code() {
        System.out.println("coding as a Java programmer");
       super.code(); // getting the super class method
    }

    void test() {
        System.out.println("testing as a Java prgorammer");
        super.test(); // getting the super class method
    }

    public static void main(String[] args) {
        
        JavaProgrammer j1 = new JavaProgrammer();
        j1.code();
        j1.test();

        
    }
}

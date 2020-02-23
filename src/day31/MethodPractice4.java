package day31;

public class MethodPractice4 {

    public static void dailyActivities() {

        System.out.println("I usually wake up  at 9 o'clock and come to work around 9:30 ");
        System.out.println("First thing i have to do is check email if any meeting scheduled or not ");
        System.out.println("go to stand up meeting which starts at 10:30");
        System.out.println(" i come back my desk continue testing " +
                "(if i am doing manual testing i will write my test case and execute them ");
        System.out.println("i I'm doing automation i analyze test cases and user stories or AC and write my script");
        System.out.println("if i'm middle of automation testing i review my script or maintaining my script or frame work");



    }

    public  static  void wakeup(){

        System.out.println("Open your eye,only one");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm ? open it again!");
        System.out.println("------------");
    }

    public  static void drinkCoffee(){

        System.out.println("Put coffe in your coffe machine");
        System.out.println("Press the button make your coffe");
        System.out.println("------------");
    }


    public  static void goToWork(){

        System.out.println("Don't be late for stand up meeting");
        System.out.println("Be respect everyone in team");
        System.out.println("work hard pays off");
        System.out.println("-------------");

    }

    public static void studyJava(){
        System.out.println("Think about the Java");
        System.out.println("Think about java drinking coffee");
        System.out.println("Review Last classes, come ready for the class");
        System.out.println("-------------");
    }

    public static void sayILoveJava300Times(){

        for (int i = 0; i <=300 ; i++) {
            System.out.print("I Love Java | ");

        }
        System.out.println();
    }
    public static void main(String[] args) {

        wakeup();
        drinkCoffee();
        goToWork();
        studyJava();
        sayILoveJava300Times();
        dailyActivities();
        /*
        wake up
        drinkCoffe
        goToWork
        groceryShopping
        cooking
        strudyJava
        goToSleep
         */
    }
}

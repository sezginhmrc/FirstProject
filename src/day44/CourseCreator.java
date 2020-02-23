package day44;

public class CourseCreator {

    public static void main(String[] args) {


        Course c1 = new Course("Java","Foundation");
        System.out.println("Course,counter = " + c1.counter);
        Course c2 = new Course ("Selenium","Automation");
        Course c3 = new Course("SQL","Database");
        Course c4 = new Course ("API","Webservices");
        Course c5 = new Course("Agile","Soft Skills");
        Course c6 = new Course("SDLC","Testing Skills");

        System.out.println("Course.Counter = " +c5.counter);


    }
}

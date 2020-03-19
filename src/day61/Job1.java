package day61;

// Comparable interface is coming from java.lang.package
// in order to short a type, it has to be Comparable
// so the class of that type must implements Comparable<Type>
// to provide comparing logic, this will become natural order for shortin
public class Job1 implements Comparable <Job1>{
//Please create Job class
//	location
//	salary
//	companyName
//	encapsulate all the fields
//	add constructor to set all the fileds value
//	add toStirng method
//Let this class implements Comparable interface
//	and add comparing logic of by salary
//Create a class called JobHunter with main method
//Create a LinkedList of Jobs
//and store your favorite 5 Jobs
//assign it to jobList varibale with List<Job> reference
//sort them and print out before and after

   private String location ;
   private int salary ;
   private String companyName ;

    public Job1(String location, int salary, String companyName) {
        this.location = location;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Job1{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Job1 o) {
        if(this.salary > o.salary){
            return 1;
        } else if (this.salary<o.salary){
            return -1 ;
        } else {
            return 0;
        }
    }
}

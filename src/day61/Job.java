package day61;

public class Job implements Comparable<Job>  {
    // Compareable interface all about to compare two object


    //Please create Job class
    //	location
    //	salary
    //	companyName
    //	encapsulate all the fields
    //	add constructor to set all the filedd value
    //	add toStirng method
    //Let this class implements Comparable interface
    //	and add comparing logic of by salary
    //Create a class called JobHunter with main method
    //Create a LinkedList of Jobs
    //and store your favorite 5 Jobs
    //assign it to jobList varibale with List<Job> reference
    //sort them and print out before and after
 private    String location ;
 private    int salary ;
 private    String companyName ;


    public Job(String location, int salary, String companyName) {
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
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Job o) {
        if (this.salary > o .salary){
            return  1 ;
        } else if (this.salary < o.salary){
            return -1 ;
        } else {
            return  0 ;
        }
    }
}

package day48;

public class FullTimeEmployee extends Employee {

    double monthSalary ;


    public FullTimeEmployee(String name , int id ,double monthSalary) {
        super(name,id);
        this.monthSalary = monthSalary;
    }

    public void calculateSalary (){
        System.out.println("YearlySalary is : " + monthSalary * 12);
    }


    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthSalary=" + monthSalary +
                ", name='" + name + '\'' +
                ", id=" + id + "Yearly : " + monthSalary * 12 +
                '}';
    }
}



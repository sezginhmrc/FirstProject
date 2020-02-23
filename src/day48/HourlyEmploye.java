package day48;

public class HourlyEmploye extends Employee {
    //HourlyEmployee
    //instance fields :
    //	hourlyWage , numsOfHours ,
    //Constructor : to set all the fields
    //instance methods ;
    //	calculateAnualSalary
    //	toString

    double hourlyWage ;
    int numsOfHours ;

    public HourlyEmploye(String name, int id, double hourlyWage, int numsOfHours) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }

    @Override
    public void calculateSalary(){
        System.out.println("Hourly employe yearly : " + (hourlyWage *numsOfHours));
    }

    @Override
    public String toString() {
        return "HourlyEmploye{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id=" + id + " yearly salary = " + (hourlyWage *numsOfHours) +
                '}';
    }
}

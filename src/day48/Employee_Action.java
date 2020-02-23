package day48;

public class Employee_Action {

    public static void main(String[] args) {

        HourlyEmploye h1 = new HourlyEmploye("Sezgin",101,55,200);
        h1.calculateSalary();
        System.out.println("h1 = " + h1);

        HourlyEmploye h2 = new HourlyEmploye("Roksana",102,50,200);
        h2.calculateSalary();
        System.out.println("h2 = " + h2);

        FullTimeEmployee f1 = new FullTimeEmployee("Esma",103,10000);
        f1.calculateSalary();
        System.out.println("f1 = " + f1);

        FullTimeEmployee f2 = new FullTimeEmployee("Denis",104,12000);
        f2.calculateSalary();
        System.out.println("f2 = " + f2);
    }
}

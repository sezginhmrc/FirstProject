package day52;

public abstract class ScrumTeam {

    String employeeName = "Sezo";
    String jobTitle ;
    int salary ;

    public abstract void demo();

    public abstract void dailyStandUp();

    public void employeeInfo(){
        System.out.println("Empolye name is " + employeeName + " " +
                 "Job Tittle is " + jobTitle+"" +
                " Employe Salary is " + salary);
    }
}

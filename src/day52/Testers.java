package day52;

public class Testers extends ScrumTeam {
    // Inherited faeatures ;
    // Varaibles ; employeName, jobTittle, Salary
    // Methods ; employeeInfo

    @Override // how we check whether overridden or not
    public void  demo (){
        System.out.println("Tester " + this.employeeName + " is doing demo");
    }

    @Override
    public void dailyStandUp(){
        System.out.println("Tester " +this.employeeName + " is attenting stand up ");
    }

}



package day46;

public class SqlProgrammer extends Programmer{
    // unique behaviour

    public void writeSqlQuer(){
        System.out.println("SQL Programmer is about query");
    }
    public void createDataBase (){
        System.out.println("SQL Programmer is creating data base");
    }

    @Override
    void code(){
        System.out.println("Coding as a SQL Programmer");
    }
    @Override
    void test(){
        System.out.println("Testing as a SQL Programmre");
    }


    public static void main(String[] args) {

        SqlProgrammer s1 = new SqlProgrammer();
        // below overridden methods
        s1.code();
        s1.test();
    }
}

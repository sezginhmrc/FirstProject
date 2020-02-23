package day42;

public class UserInfo {

    //Attributes ->instance variables

    private String userName, password, ssn ; // James

    // These are setters and getters
    public String getUserName() {
        return userName;
    }
                            //this is local variable
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public void study(){
        System.out.println(userName + " Styduing JAVA");
    }
}

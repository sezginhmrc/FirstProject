package day52;

public class Account implements Transferable,Comparable<Account> {
// this class inherited INTERFACE of transferable, comparable

  protected  String name ;
   private int balance ;

   // add logic to compare by balance
    // we overridden this method from Comparable Interface
    // WE COMPARED SPECIFIC ORDER !!
    public int compareTo (Account otherAccount) {
        if (this.balance > otherAccount.balance) {
            return 1;
        } else if (this.balance < otherAccount.balance) {
            return -1;
        } else {
            return 0;
        }
    }

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }



    public void transferAll(Account otherAccount){
        // get the balance of current out
        // depsit to other account
        // set curent account balance to 0
     // otherAccount.balance += this.balance ;
      //  this.balance =  0;
        otherAccount.deposit(this.balance);
        this.withdraw(this.balance);
        }


    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public  void withdraw(int amount){
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    // add a method called isPalindrome and return if the name is palindrome ?
    public boolean isPolindrome(){
        // first store it into temp and replace all the space
        // and make it lowercase
       String nameTemp = this.name.toLowerCase().replace(" ","");
       String reversedResult = "" ;
       for(int i = nameTemp.length()-1 ; i >= 0 ; i--){
           reversedResult += nameTemp.charAt(i);
       }
       return nameTemp.equals(reversedResult);
    }


}

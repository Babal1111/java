
// - Create an abstract class Account with encapsulated fields accountNo, holderName, and balance.
// - Create SavingsAccount and CurrentAccount classes (extend Account and implement BankOperations).
// - Store multiple accounts in an ArrayList<Account>.
// Demonstrate runtime polymorphism while performing operations.
// 	Add features:
// 	Add a new account
// 	Remove an account by account number
// 	Search for an account
// 	Display all accounts
// 	Deposit/Withdraw money into/from a chosen account
interface BankOperations{
    public void deposit();
    public  void withdraw();
    public void checkBalance();

}

abstract class Account{
    protected  int accountNo;
    protected  String name;
    protected  double balance;

    public Account(int accountNo,String name,double balance){
        this.balance = balance;
        this.accountNo = accountNo;
        this.name = name;

    }


}
class SavingAccount extends Account implements BankOperations{

    public SavingAccount(int accountNo,String name,double balance){
        super(accountNo, name, balance);
    }
    @Override 
    public void checkBalance(){

    }
    @Override
    public void deposit(){

    }
    @Override
    public void withdraw(){

    }

}
class CurrentAccount extends Account implements BankOperations{
    public CurrentAccount(int accountNo,String name,double balance){
        super(accountNo, name, balance);
    }
    @Override
    public void checkBalance(){
        System.out.println("THe balance in "+accountNo+" is : "+balance);
    }
    @Override
    public void deposit(){

    }
    @Override
    public void withdraw(){

    }

}
public class Bank {
    public static void main(String[] args) {
     SavingAccount s1 = new SavingAccount(10234,"Babalpreet Singh",1000100);
     s1.checkBalance();   
    }
}
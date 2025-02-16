abstract class BankAccount{
    public abstract void deposit(int amount);
    public abstract void withdrawl(int amount);
    public abstract void displayBalance();
}
class SavingsAccount extends BankAccount{
    private long ac_no;
    private long available_bal;
    public SavingsAccount(long ac_no, long available_bal) {
        this.ac_no = ac_no;
        this.available_bal = available_bal;
    }
    public void deposit(int amount)
    {
          this.available_bal+= amount;
    }
    public void withdrawl(int amount) {
        this.available_bal-= amount;
    }
    public void displayBalance() {
        System.out.println("Account Number: "+this.ac_no);
        System.out.println("Available Balance: "+this.available_bal);
    }
}
class CheckingAccount extends BankAccount{
    private long ac_no;
    private long available_bal;
    public CheckingAccount(long ac_no, long available_bal) {
        this.ac_no = ac_no;
        this.available_bal = available_bal;
    }
    public void deposit(int amount)
    {
          this.available_bal+= amount;
    }
    public void withdrawl(int amount) {
        this.available_bal-= amount;
    }
    public void displayBalance() {
        System.out.println("Account Number: "+this.ac_no);
        System.out.println("Available Balance: "+this.available_bal);
    }
}
public class Bank_Ac {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(88132831821l,478427292l);
        savingsAccount.displayBalance();
        System.out.println("Depoist of 10..");
        savingsAccount.deposit(10);
        savingsAccount.displayBalance();
        System.out.println("Withdrawl of 5..");
        savingsAccount.withdrawl(5);
        savingsAccount.displayBalance();
        CheckingAccount checkingAccount = new CheckingAccount(2547575l,246757857l);
        checkingAccount.displayBalance();
        System.out.println("Withdrawl of 50..");
        checkingAccount.withdrawl(50);
        checkingAccount.displayBalance();
        System.out.println("Depoist of 30..");
        checkingAccount.deposit(30);
        checkingAccount.displayBalance();
    }
}

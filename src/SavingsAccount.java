public class SavingsAccount extends BankAccount {

    private double balance;


    public SavingsAccount(){
       this ("No Name",0,0);

    }

    public SavingsAccount(String name, int accnum, double balance){
        super(name, accnum);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String toString() {
        return "Name :"+name+"\nAccount Number : "+accnum+ "\nBalance : "+balance;
    }

    public double calcTax() {
        double tax = 0;
        double rate = 0.1;

        tax = this.balance * rate;
        return tax;
    }


    public void lodge(double amount) {

        this.balance += amount;
    }


    public void withdraw(double amount) {

        this.balance -= amount;

    }
}

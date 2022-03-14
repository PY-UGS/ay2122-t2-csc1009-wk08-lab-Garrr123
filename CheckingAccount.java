package Week8;

public class CheckingAccount {
    private double balance;
    private double accountNumber;

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception{
        if(this.balance < amount) throw new InsufficientFundsException(amount-this.balance);
        this.balance -= amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getAccountNumber(){
        return this.accountNumber;
    }

}

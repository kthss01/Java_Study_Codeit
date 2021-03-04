package intermediate.inheritance_practice;

public class BankAccount {
    protected int balance;

    public BankAccount() {}

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public boolean deposit(int amount) {
        balance += amount;

        return true;
    }
}

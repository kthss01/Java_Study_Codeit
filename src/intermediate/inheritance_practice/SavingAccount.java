package intermediate.inheritance_practice;

public class SavingAccount extends BankAccount {
    private double interest;

    public SavingAccount() {
        super();
    }

    public SavingAccount(int balance) {
        super(balance);
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void addInterest() {
         balance = (int) (balance * (1 + interest));
    }
}

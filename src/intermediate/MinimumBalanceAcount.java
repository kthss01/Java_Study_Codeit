package intermediate;

public class MinimumBalanceAcount extends BankAccount {
    private int minimum;

    public MinimumBalanceAcount(int balance) {
        super(balance);
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMinimum() {
        return minimum;
    }

    @Override
    public boolean withdraw(int amount) {
        if (balance - amount >= minimum) {
            System.out.println("적어도 " + minimum + "원은 남겨야 합니다.");
            return false;
        }

        balance -= amount;
        return true;
    }
}

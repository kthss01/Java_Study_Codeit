package intermediate.inheritance_practice;

public class TransferLimitAccount extends BankAccount {
    private int transferLimit;

    public TransferLimitAccount(int balance, int transferLimit) {
        super(balance);
        this.transferLimit = transferLimit;
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount > transferLimit) {
            return  false;
        }

        return super.withdraw(amount);
    }
}

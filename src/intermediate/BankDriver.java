package intermediate;

import java.util.ArrayList;

public class BankDriver {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        MinimumBalanceAcount mba = new MinimumBalanceAcount();
        SavingAccount sa = new SavingAccount();
        ba.deposit(1000);
        mba.deposit(1000);
        sa.deposit(1000);

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(ba);
        accounts.add(mba);
        accounts.add(sa);

        for (BankAccount account : accounts) {
            account.deposit(1000);

            // SavingAccount 인스턴인지 판별
            if (account instanceof SavingAccount)
                ((SavingAccount) account).addInterest(); // 그냥하면 오류 발생
        }

        BankAccount sa2 = new SavingAccount(); // upcasting
        BankAccount sa3 = sa;

        sa.addInterest();
        ((SavingAccount) sa3).addInterest(); // downcasting
    }
}

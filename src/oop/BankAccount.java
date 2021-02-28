package oop;

public class BankAccount {
    private int balance;
    private Person owner;

    public BankAccount(int balance) {
        if (balance < 0)
            this.balance = 0;
        else
            this.balance = balance;
    }

    public BankAccount(Person owner) {
        this(0, owner);
    }

    public BankAccount(int balance, Person owner) {
        if (balance < 0)
            this.balance = 0;
        else
            this.balance = balance;

        this.owner = owner;
        owner.setAccount(this);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    // 파라미터 : 입금할 액수 (정수)
    // 리턴 : 성공 여부 (불린)
    boolean deposit(int amount) {
        if (amount < 0 || amount > owner.getCashAmount()) {
            System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원\n",
                    balance, owner.getCashAmount());
            return false;
        }

        balance += amount;
        owner.setCashAmount(owner.getCashAmount() - amount);
        System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원\n",
                amount, balance, owner.getCashAmount());
        return true;
    }

    public boolean deposit(double amount, double exchangeRate) {
        return deposit((int) (amount * exchangeRate));
    }

    // 파라미터 : 출금할 액수 (정수)
    // 리턴 : 성공 여부 (불린)
    boolean withdraw(int amount) {
        if (amount < 0 || amount > balance) {
            System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원\n",
                    balance, owner.getCashAmount());
            return false;
        }

        balance -= amount;
        owner.setCashAmount(owner.getCashAmount() + amount);
        System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원\n",
                amount, balance, owner.getCashAmount());
        return true;
    }

    // 첫 번째 파라미터 : 받는 사람 (Person)
    // 두 번째 파라미터 : 이체할 액수 (정수)
    // 리턴 : 성공 여부 (불린)
    boolean transfer(BankAccount to, int amount) {
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success = true;
        }

        System.out.println(success + " - from: " + owner.getName()
                + ", to: " + to.owner.getName()
                + ", amount: " + amount
                + ", balance: " + balance);

        return success;
    }

    // account 간의 거래이므로, Person to의 정보를 to의 account 정보로 바꾸어 호출
    boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }
}

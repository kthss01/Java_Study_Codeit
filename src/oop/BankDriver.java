package oop;

public class BankDriver {
    public static void main(String[] args) {
        // 사람 선언
        Person p1 = new Person("김신의", 28, 30000);
        Person p2 = new Person("문종모", 25, 100000);

        // 은행 계좌 생성
        BankAccount a1 = new BankAccount(100000, p1);
        BankAccount a2 = new BankAccount(500000, p2);

        // 테스트
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}

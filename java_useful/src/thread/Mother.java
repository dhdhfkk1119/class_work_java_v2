package thread;

public class Mother extends Thread {

    BankAccount bankAccount;
    public Mother(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        // 계좌에 출금 요청
        bankAccount.withdraw(5_000);
    }
}

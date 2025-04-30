package thread;

public class Father extends Thread {
    
    
    // 입금 요청 --> 3초

    BankAccount bankAccount;

    public Father(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.deposit(10_000);
    }
}

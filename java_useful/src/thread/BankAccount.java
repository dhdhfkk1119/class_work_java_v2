package thread;

/*
* 각 스레드가 공유하는 자원 만들어 보기(shared Resource) - 공유 자원
* */

public class BankAccount {

    private int money = 100_000;

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    // 입금
    public synchronized void deposit(int money){
        int currentMoney = getMoney();
        // synchronized 블록 처리

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        setMoney(currentMoney + money);
        System.out.println("ATM 현재 잔액(입금) : " + getMoney());
    }

    // 출금
    // synchronized 메서드 처리
    public synchronized int withdraw(int money){
        int currentMoney = getMoney();

        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if(money > currentMoney){
            System.out.println("잔액이 부족합니다");
            return 0;
        } else {
            setMoney(currentMoney - money);
            System.out.println("ATM 현재 잔액(출금) : " + getMoney());
            return 0;
        }
    }

}

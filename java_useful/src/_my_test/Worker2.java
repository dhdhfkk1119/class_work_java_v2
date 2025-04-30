package _my_test;

import thread.Worker;

// 인터페이스 Runnable
public class Worker2 implements Runnable {

    public static void main(String[] args) {
        Worker2 t = new Worker2();
        Thread thread = new Thread(t);
        System.out.println("스레드 시작");

        t.run();
        thread.start();
        thread.run();

        System.out.println("스레드 끝");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Worker " + i);
        }
    }
}

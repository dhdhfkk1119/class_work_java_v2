package thread;


/*
* 쓰레드 만들어 보기 (생성)
* 1. 상속을 활용해서 쓰레드를 만들어 보자 ( 작업자 만들어 보기 )
* */

public class Worker extends Thread {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    // 서브 작업자 해야할 일을 run() 메서드안에 재정의 해주어야 한다
    // 약속된 부분 ! start() 메서드를 통해서 쓰레드한테 일을 시작해라고 명령을 줄 수 있다
    // 그러면 다른 쓰레드가 run() 안에 있는 부분을 수행 시킨다.
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("worker " + name + " " + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println("외부에서 신호를 받아서 예외가 발생 됐어!!");
                e.printStackTrace(); // 예외가 발생한 부분들 좀 더 상세히 출력해 (추적)
            }
        }
    }
}

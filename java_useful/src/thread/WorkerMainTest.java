package thread;

public class WorkerMainTest {

    // 메인 쓰레드
    public static void main(String[] args) {

        // 사용하는 방법
        System.out.println("-------------- main 쓰레드 시작 ---------------");
        // 현재 쓰레드가 누구인지 알아보는 명령어
        System.out.println(Thread.currentThread());

        // 작업자 하나 만들어 내기
        Worker worker1 = new Worker("워커(서브쓰레드)");
        worker1.start(); // 너가 위임 받은

    }

}

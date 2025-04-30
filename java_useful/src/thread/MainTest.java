package thread;

public class MainTest {

    public static void main(String[] args) {

        // Thread 란?
        // process : 프로그램이 실행이 되면 OS로 부터 메모리를 할당 받아 프로세스 상태가 된다
        // thread : 하나의 프로세스에는 하나 이상의 thread 를 가지게 되고 실제 작업을 수행하는
        // 단위는 thread 이다.

        // multi threading 이란?
        // 여러 쓰레드가 동시에 수행되는 프로그래밍을 말한다. 여러 작업이 동시에 실행되는
        // 효과를 만들어 낼수  있다.
        // Thread 는 각각 자시만에 변수, 메서드 등 작업 공간들을 가질 수 있다.

        // 단, 멀티 쓰레딩 프로그래밍을 할 때 주의점이 있다.
        // thread 사이에는 공유하는 자원을 가질 수 있다.
        // 여러 쓰레드가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는
        // race condition 이 발생할 수 있다.

    }

}

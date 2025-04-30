package ch08;

public class BusMainTest {
    public static void main(String[] args) {

        // 생정자를 사용하는 목적은
        // 강제성을 부여하기 위함이다.
        Bus b1 = new Bus(133,"시내버스","텐코");
        b1.showInfo();
    } // end of main
}

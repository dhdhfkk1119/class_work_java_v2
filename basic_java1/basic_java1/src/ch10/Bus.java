package ch10;

public class Bus {

    int busCount;
    int busNumber;
    int money;

    public Bus(int number) {
        busNumber = number;
    }

    // 승객을 태우다
    public void take (int pay){
        money += pay; // 복합 대입 연산자
        busCount++;
    }

    public void showInfo(){
        System.out.println("-----------상태창-----------");
        System.out.println("버스 승객 : " + busCount);
        System.out.println("버스 번호 :" + busNumber);
        System.out.println("버스 수익금 : "+ money);

    }
}

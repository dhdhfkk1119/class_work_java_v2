package ch08;

public class Bus {

    // 속성
    int busIdx; // 버스 ID
    String busType; // 버스 종류
    String company; // 운영 회사

    // 생성자
    // 생성자가 여러개 있으면 생성자 오버로딩이라 한다.
    // 매개 변수 1 받는 생성자
    public Bus() {
    }



    public Bus(int idx) {
        busIdx = idx;
    }

    public Bus(int idx,String type) {
        busIdx = idx;
        busType = type;
    }

    public Bus(int idx,String type,String com){
        busIdx = idx;
        busType = type;
        company = com;
    }

    // 메서드
    public void showInfo(){
        System.out.println("----------상태창-----------");
        System.out.println("버스 ID :" + busIdx);
        System.out.println("버스 busType :" + busType);
        System.out.println("버스 company :" + company);
    }
}

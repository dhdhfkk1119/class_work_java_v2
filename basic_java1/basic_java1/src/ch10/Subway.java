package ch10;

public class Subway {

    int lineNumber;
    int count;
    int money;

    // 생성자
    public Subway(int number){
        lineNumber = number;
    }

    // 승객을 태우다
    public void take(int num){
        count += num;
    }
    
    // 정보 보여주기
    public void showInfo(){
        System.out.println("--------------상태창-----------------");
        System.out.println("지하철 호선 : " + lineNumber + "호선");
        System.out.println("지하철 승객수 : " + count);
        System.out.println("지하철 수익금 : " + money);
    }
}

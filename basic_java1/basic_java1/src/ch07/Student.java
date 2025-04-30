package ch07;

// 학생 클래스를 설계하는 코드 측
public class Student {

    // 속성 ( 상태 )
    int studentId;
    String studetnName;
    String address;

    // 행위
    public void study() {
        System.out.println( studetnName + " 가 공부를 합니다.");
    }

    public void bradkTime() {
        System.out.println( studetnName + "가 휴식을 합니다");
    }

    public void studentTest() {
        System.out.println( studetnName + "가 시험을 칩니다");
    }

    public void studentClean() {
        System.out.println( studetnName + "가 청소를 합니다");
    }

    
    public void showInfo(){
        System.out.println("------------상태창------------");
        System.out.println("학생 ID : " + studentId);
        System.out.println("학생 이름 : " + studetnName);
        System.out.println("학생 주소 : " + address);
        
    }
}

package ch10;

public class GoingToSchool {

    public static void main(String[] args) {
        Bus bus1 = new Bus(133);
        Subway subway = new Subway(3);
        Student student = new Student("홍기돌",10000);
        Student student2 = new Student("티모",20000);
        student.takeBus(bus1);
        student2.takeBus(bus1);

        // bus1 -> 실제 값은 주소값이다


        student.showInfo();
        bus1.showInfo();

        student2.showInfo();
        bus1.showInfo();

        // 사전 기반 지식
        // 기본 데이터 , 참조 타입
        // int a; (값이 담긴다)
        // 대문자로 선언하는 데이터 타입은 (참조 타입이다)
        // Student s1; --> s1의 주소값

    }
}

package ch10;

public class GoingToSchool12 {

    public static void main(String[] args) {
        
        // 버스 객체를 3개 생성해 보시오
        Bus b1 = new Bus(113);
        Bus b2 = new Bus(16);
        Bus b3 = new Bus(288);

        // 학생 객체를 2명 생성해 보시오
        Student student1 = new Student("정우",10000);
        Student student2 = new Student("성준",20000);

        // 학생이 버스를 타는 행위를 만들어 보세요
        student1.takeBus(b1);
        student2.takeBus(b1);

        // 버스에 상태 창을 출력해서 결과를 확인해 보자
        b1.showInfo();
        b2.showInfo();
        b3.showInfo();
    }
}

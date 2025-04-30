package ch07;

public class StudentMainTest1 {
    public static void main(String[] args) {

        Student student = new Student();
        student.studentId = 1;
        student.studetnName = "정우";
        student.address = "푸른언덕";

        Student student1 = new Student();
        student1.studentId = 2;
        student1.studetnName = "성준";
        student1.address = "붉은언덕";
        
        // 객체에 동작을 시켜보자
        student.showInfo();
        student.study();
        student.studentTest();
        student.studentClean();
        student1.showInfo();
        student1.bradkTime();
        student1.studentTest();
        student1.studentClean();

        // 메서드란 ? 객체에 만든 기능
        // 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
        // 매서드는 맴버 메서드라고 부르기도 한다 .
        // ** 메서드는 함수와 다르게 멤버 변수를 활용해서 기능을 구현했다 **


    }
}

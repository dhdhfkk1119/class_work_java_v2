package exercise;

public class StudentMainTest {

    public static void main(String[] args) {
        Student student = new Student();
        Bus bus = new Bus();

        student.name = "조정우";
        student.sex = "male";
        student.age = 27;
        student.phone =  "123456789";

        bus.userName = student.name;
        bus.userAge = student.age;

    }

    // 객체지향 프로그램이란
    // 객체 와 객체간에 관계를 형성하고 상호작용하게 프로그래밍 하는 것

}

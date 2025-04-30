package com.asscoiation;

public class Student {
    private String name;
    private Course course; // 연관 관계

    public Student(String name) {
        this.name = name;
        course = null; // 초기에는 수강을 하지 않음!
    }

    // 수강을 듣다 (과목에 대한 정보는 course 에 있다)
    public void enroll(Course course) {
        this.course = course;
        System.out.println(name + "가" + course.getName() + "강의를 수강합니다");
    }


    // 학생의 현재 수강중인상태를 보여주는 기능
    public void showInfo() {
        System.out.println("------------상태---------------");
        if (this.course != null) {
            System.out.println(name + "이(가) " + this.course.getName() + "를 수강하고 있는중");
        } else {
            System.out.println("수강중인 강의가 없습니다");
        }
    }
    
    // 도전과제
    // 수강 종료 기능을 만들어 보시오. 
    public void end(){
        if(this.course == null){
            System.out.println("현재 수강중인 상태가 아닙니다");
        }else {
            System.out.println(course.getName() + "을 수강 취소 합니다");
            this.course = null;
        }
    }
}

package com.asscoiation;

public class MainTest1 {

    public static void main(String[] args) {
//        Course course = new Course("자바");
//        Course db = new Course("데이터베이스");
//
//        Student student = new Student("정우");
//        student.enroll(course);
//        student.end();
//        student.showInfo();
        
        Team team = new Team("SSG-Team");
        Player player = new Player("추신수");

        player.create(team);
        player.showInfo();

    }

}

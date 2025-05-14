package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 자바로 DB에 접근하는 기술을 습득해보자.
 * DB 접근 기술
 */
public class JDBCExample {
    public static void main(String[] args) {
        // MySQL 8 버전에 접근 하려고 함
        // DB 접근 기술을 정형화 되어 있다.
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";

        // 규칙1. Connection 객체를 힙 메모리에 올리기 위해서는 DriverManager 클래스가 필요하다.
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("데이터 베이스에 성공적으로 연결되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("데이터베이스에 연결을 실패 했습니다.");
        }


    } // end of main

} // end of class

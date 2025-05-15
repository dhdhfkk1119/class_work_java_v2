package ch02;

import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) {

        // 데이터 베이스 접근 주소
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";

        // JDBC 를 사용하기 위해서 필요한 클래스(구성요소)
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. 데이터 베이스 연결 요청
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("MySQL 테이터베이스 성공적으로 연결 되었습니다" + conn);

            // 2. Statement 생성
            stmt = conn.createStatement();

            // 2.1 - 쿼리 실행해 보기
            // executeQuery -> Select 사용시 메서드 호출해야 함
            // rs = stmt.executeQuery("select * from tb_student where no ='2017001'");
            rs = stmt.executeQuery("select * from tb_student");
            while(rs.next()){
                String no = rs.getString("no");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
                System.out.print("no : " + no + "\t");
                System.out.print("name : " + name + "\t");
                System.out.print("gender : " + gender + "\t");
                System.out.print("age : " + age + "\n");
            }

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            // JDBC 기술을 사용하면 데이터 베이스에서 자원을 얻기 위해
            // 객체가 계속 대기하고 있다 ---> 자원 해제를 해줘야함
            // 4. 자원 해제 하기
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("오류가 발생했습니다 : " + e);
            }
        }
    }

}

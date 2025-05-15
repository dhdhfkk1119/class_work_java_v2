package ch03;

import java.sql.*;

public class JDBCExample4 {
    public static void main(String[] args) {
        // MysQL 서버 접근 하기 위해 - 주소 , 계정 ,비밀번호
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String pwd = "asd1234";

        // 자바 ---> MySQL 서버에 접근하기 위한 준비물
        // JDBC 인터페이스를 보고 구현한 각 회사에 JDBC 구현 클래스들이 필요하다
        // 해당 제품에 lib 를 다운로드 받아서 우리 프로젝트 연결 처리
//        Connection connection;
//        PreparedStatement pstmt = null;
//        ResultSet resultSet = null;

        // try{} catch(){}
        // try(){} catch(){}
        try (
                Connection conn = DriverManager.getConnection(url,user,pwd);
                PreparedStatement pstmt = conn.prepareStatement("select * from tb_student ");
                ResultSet resultSet = pstmt.getResultSet();
        ){
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println(name + age);
            }
        }catch(Exception e){

        }
    }
}

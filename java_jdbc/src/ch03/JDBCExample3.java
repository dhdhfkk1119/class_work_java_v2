package ch03;

import java.sql.*;

public class JDBCExample3 {
    public static void main(String[] args) {
        // MysQL 서버 접근 하기 위해 - 주소 , 계정 ,비밀번호
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String pwd = "asd1234";

        // 자바 ---> MySQL 서버에 접근하기 위한 준비물
        // JDBC 인터페이스를 보고 구현한 각 회사에 JDBC 구현 클래스들이 필요하다
        // 해당 제품에 lib 를 다운로드 받아서 우리 프로젝트 연결 처리
        Connection connection = null;

        // Statement statement = null;
        // statement 보다 좋음 -> PreparedStatement
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;


        try {
            // Class.forName("com.mysql.cj.jdbc.Drive");
            // 1. 데이터 베이스에 연결 요청
            connection = DriverManager.getConnection(url,user,pwd);

            // 2. Statement 생성 해야 함 - (쿼리를 만들어서 실행기 위해)
            // statement = connection.createStatement();
            pstmt = connection.prepareStatement("select * from tb_student where no = ? ");
            // pstmt.setInt(); ? 를 순서 기준으로 해당하는 데이터 타입을 명시하는 것
            pstmt.setString(1,"20170001");


            // 3. 쿼리를 만들고 실행 요청을 해야 한다
            // resultSet = statement.executeQuery("select * from tb_student");
            resultSet = pstmt.executeQuery();
            // 4. 결과 (응용해서 프로그래밍 처리)

            // 결과 추출하는 기법(Set 자료구조에서)
            while (resultSet.next()){
                String no = resultSet.getString("no");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.print("번호 : " + no + "\t");
                System.out.print("이름 : " + name + "\t");
                System.out.println("나이 : " + age);
            }
        } catch (SQLException e2) {
            e2.printStackTrace();
        } finally {
            try {
                if(resultSet != null) resultSet.close();
                if(pstmt != null) pstmt.close();
                if(connection != null) connection.close();
            } catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
    }
}

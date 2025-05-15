package ch02;

import java.sql.*;

public class JDBCExample2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=Asia/Seoul";
        String user = "root";
        String password = "asd1234";
        Connection connection = null;
        Statement query = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("성공적으로 연결되었습니다 " + connection);

            // SQL 쿼리를 데이터베이스에 전송하는 데 사용
            query = connection.createStatement();
            query.executeUpdate(
                    "insert into student(id,name , grade , major , english_score) " +
                    "values (7,'정우',2,'컴퓨터공학과',80)"
            );

            query.executeUpdate(
                    " update student set english_score = 100 where id = 1; "
            );

            resultSet = query.executeQuery("select * from student");
            while (resultSet.next()){
                int idx = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int grade = resultSet.getInt("grade");
                String major = resultSet.getString("major");
                int english_score = resultSet.getInt("english_score");
                System.out.print("고유 번호 : " + idx);
                System.out.print("이름 : " + name);
                System.out.print("학년 : " + grade);
                System.out.print("전공 : " + major);
                System.out.println("점수 : " + english_score + "점");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
                query.close();
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

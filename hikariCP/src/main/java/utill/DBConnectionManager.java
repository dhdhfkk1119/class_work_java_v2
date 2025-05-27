package utill;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnectionManager {
    private static HikariDataSource dataSource;

    // 정적 초기화 블록 (Static Initialization Block)
    // 클래스가 로드될 때 한 번만 실행됩니다.
    static {
        // HikariCP 설정 구성
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul");
        config.setUsername("root");
        config.setPassword("asd123");
        config.setMaximumPoolSize(10); // 최대 연결 수 설정
        // HikariDataSource 객체 생성 및 설정
        dataSource = new HikariDataSource(config);
    }

    // 데이터베이스 연결을 반환하는 메서드
    // 각 호출 시 새로운 Connection 객체를 반환합니다.
    public static Connection getConnection2() throws SQLException {
        return dataSource.getConnection();
    }

    // 세션 연결 확인 테스트
    public static void main(String[] args) {
        try {
            Connection connection = DBConnectionManager.getConnection2();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

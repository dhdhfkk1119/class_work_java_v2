package ch04;

/*
 * JDBC 연습 , 메서드 분리 하는 방법 , 활용
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CageMenuManger {

    private static final String URL = "jdbc:mysql://localhost:3306/cafe?serverTimezone=Asia/Seoul";
    private static final String USER = "root";
    private static final String PWD = "asd1234";

    public static void insertMenu(String name, int price, String category) {
        // insert into menu (name,price,category) values ('아메리카노',2000,'커피');
        try (Connection connection = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "insert into menu (name,price,category) values (?,?,?) ";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, price);
            pstmt.setString(3, category);
            int rowsInsertedCount = pstmt.executeUpdate();
            System.out.println(rowsInsertedCount + "개의 메뉴가 추가 되었습니다.");

        } catch (Exception e) {
            System.err.println("메뉴 추가 중 오류가 발생 : " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static void updateMenuPrice(int price, String name) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "update menu set price = ? where name = ? ";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, price);
            preparedStatement.setString(2, name);
            int rowsUpdateCount = preparedStatement.executeUpdate();
            System.out.println(rowsUpdateCount + "개가 수정되었습니다");
        } catch (Exception e) {
            System.err.println("메뉴 가격 수정 중 오류 : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void deleteMenu(String name) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "delete from menu where name = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.err.println("메뉴 삭제 중 오류 : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void selectAllMenu() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
            String sql = "select * from menu";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String category = resultSet.getString("category");

                System.out.println("아이디 : " + id + "이름 : " + name + "가격 : " + price + "카테고리 : " + category);
            }
        } catch (Exception e) {
            System.err.println("메뉴 조회 중 오류 : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // insertMenu("코오피",2000,"커피");
        // updateMenuPrice(3000, "코오피");
        // deleteMenu("코오피");
        //selectAllMenu();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\\n=== 카페 메뉴 관리 시스템 ===");
            System.out.println("1. 메뉴 추가");
            System.out.println("2. 메뉴 가격 수정");
            System.out.println("3. 메뉴 삭제");
            System.out.println("4. 메뉴 목록 조회");
            System.out.println("5. 종료");
            System.out.print("선택 (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            // switch 사용해서 동작 흐름 만들어 보기
            switch (choice) {
                case 1:
                    System.out.println("메뉴 이름 : ");
                    String name = scanner.nextLine();

                    System.out.println("메뉴 가격 : ");
                    int price = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("카테고리 : ");
                    String category = scanner.nextLine();

                    insertMenu(name,price,category);
                    break;
                case 2:
                    System.out.println("수정할 메뉴 이름 : ");
                    String Update_name = scanner.nextLine();

                    System.out.println("수정할 메뉴 가격 : ");
                    int Update_price = scanner.nextInt();

                    updateMenuPrice(Update_price,Update_name);
                    break;
                case 3:
                    System.out.println("삭제할 메뉴 이름 : ");
                    String delete_menu = scanner.nextLine();
                    deleteMenu(delete_menu);
                    break;
                case 4:
                    selectAllMenu();
                    break;
                case 5:
                    System.out.println("종료되었습니다");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘모된 선택입니다");
            }
        }

    }
}

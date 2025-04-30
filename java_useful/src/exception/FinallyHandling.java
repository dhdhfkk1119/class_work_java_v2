package exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class FinallyHandling {

    public static void main(String[] args) {

        // try-catch-finally
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("숫자를 입력해 주세요 :");
            int result = sc.nextInt();
            System.out.println("입력한 숫자 : " + result);
            return;
        }catch (InputMismatchException el){
            System.out.println("잘못입력했어요 숫자입력해야 됨");
        } catch (Exception e) {
            System.out.println("입력 오류!!! ");
        } finally {
            // 반드시 수행 되어야 하는 코드를 입력하는 영역
            // finally -> return 키워드를 만나더라도 여기는 수행이 됩니다.
            sc.close();
            System.out.println("자원을 해제 했습니다");
        }

    }

}

package exception;

public class ArrayExceptionHandling {

    public static void main(String[] args) {

        // 배열 - 5
        // 인덱스의 길이 - 4
        int[] arr = {1, 2, 3, 4};

        // 예외 처리 try - catch 구문에 이해
        // 예외 처리 tyr-catch-finally 구문에 이해

        try {
            // 예외가 발생할 가능성이 있는 코드를 넣어준다
            for (int i = 0; i < 10; i++) {
                System.out.println("arr[" + i + "] =" + arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException el){
                System.out.println( " 배열에 범위를 넘었어요 ");

        } catch (Exception e2) {
            System.out.println(e2.getMessage());
            // 예외가 발생 했다면 예외 처리를 만들어줄수있다
            // System.out.println("나의 예외 처리 : " + e.getMessage());
        }


        System.out.println("비정상 종료되지 않았습니다");
    }

}

package _string;

public class ExceptionTest1 {

    public static void main(String[] args) {
        // 사용자 정의 예외 클래스 사용해 보기
        int result = 0;

        Calc2 calc = new Calc2();

        try {
            calc.divide(10,0);
        } catch (DivideByZeroException e) {
            throw new RuntimeException(e);
        }
    }

}

class Calc2 {
    public int divide(int a, int b) throws DivideByZeroException{
        int result = 0;

        try {
            result =  a / b;
        }catch (Exception e) {
            throw new DivideByZeroException("0으로 나누지 마세요");
        }
        return a / b;
    }
}

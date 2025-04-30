package _string;

public class ThrowsHandling {

    public static void main(String[] args){
        boolean flag = true;
        if(flag){
            // 피룡에 의해서 직접 미리 만들어 둔 예외 클래스를 생성할 수 있다.
            new ArithmeticException();
        }

    }

}

package ch03;

public class Operation1 {
    
    // 코드의 진입점
    public static void main(String[] args) {
        
        // 은행 계좌의 초기 잔액 설정
        double balance = 1000.0;
        System.out.println("초기 잔액 : "+ balance + "원" );
        
        // 1. 입금 : 5000원을 계좌에 추가해라 ( 원래 있던 금액에서 추가해야 한다 )

        // balance = balance + 5000;
        // 복합 대입 연산자를 사용해 보자.
        balance += 5000;
        // 실수 + 정수 = (실수형으로 반환 된다)
        System.out.println("계좌 잔액 확인 : "+ balance + "원" );

        // 2. 출금 : 2000원을 사용
        balance -= 2000;
        System.out.println("계좌 잔액 확인 : "+ balance + "원" );



        // 잔액을 1000원 단위로 나누어 몪 계산 ( 예 : 1000원 쿠폰으로 교환 가능한 횟수)
        int coupons = (int)(balance /1000);
        System.out.println("1000원으로 쿠폰 교환 가능한 개수 : " + coupons);
        balance %= 1000.0;
        System.out.println("쿠폰 교환 후 계좌 잔액 확인 : " + balance);

        // 곱하기
        // System.out.println(balance *= 2);

        // 정리
        // 복합 대입 연산자는 코드를 간결하게 만들고 변수에 값을 바로
        // 업데이트 하므로 실수 가능성을 줄일 수 있다


    }// end of main
}// end of class

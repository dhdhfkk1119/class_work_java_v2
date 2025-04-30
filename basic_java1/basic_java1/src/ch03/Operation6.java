package ch03;

/*
* 논리 연산자 복습
* */

public class Operation6 {

    public static void main(String[] args) {
        // 쇼핑몰 회원 정보를 설정

        int userAge = 20; // 사용자의 나이
        int cartTotal = 50_000; // 장바구니 총액(원)
        //System.out.println(cartTotal);
        boolean isMember = true; // 회원 여부
        int couponCount = 2; // 보유 쿠폰 개수

        // 1. 무료 배송 조건 : 장바구니 총액이 3만원 이상이고 회원이어야 한다.
        boolean freeShipping = (cartTotal >= 30_000) && isMember;
        System.out.println("무료 배송 가능 여부 : " + freeShipping);

        // 2. 할인 조건 : 나이가 19세 이상 이거나 쿠폰이 1개 이상 이어야 함
        boolean canDiscount = (userAge >= 19) || (couponCount >= 1);
        System.out.println("할인 적용 가능 여부 : " + canDiscount);

        // 3. 구매 제한 조건 : 나이가 19세 미만이고 회원이 아닌 경우에 구매를 불가
        boolean purchaseRestricted = ( userAge < 19 ) && !isMember;

        // 4. 이벤트 참여 조건 : 장바구니 총액이 5만원 미만이거나 쿠폰이 3개 미만이면 참여 가능
        boolean canJoinEvent = (cartTotal < 5000) || (couponCount < 3);
        System.out.println("이벤트 참여 가능 여부 : " + canJoinEvent);
        
        // 연습 문제 
        // 1. 직접 문제를 만들 식을 세워서 출력 하시오
        // 현재 로그인한 유저의 번호를 만들어주고 5를 넣으시오,
        // 만든 유저의 번호가 1번이지 체크하시오
        // 로그인한 유저의 성별을 만들고 male 를 넣으시오
        // 로그인한 유저가 남자 인지 여자인지 체크하시오
        // 로그인 번호 loginIdx, 로그인 한 유저의 성별 userSex ,
    }

}

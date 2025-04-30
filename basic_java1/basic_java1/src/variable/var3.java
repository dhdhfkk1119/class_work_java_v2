package variable;

public class var3 {

    public static void main(String[] args) {

        //변수를 선언하고 값을 넣는 방법과 사용하는 방법을 확인했다.
        // int -> 예약어 (자바 개발자 들이 선점해 둔 단어들)
        int a;

        //1.변수 ageBox ,telBox 를 선언해 주세요
        int ageBox;
        int telBox;

        //2.ageBox 에다가 값 50을 초기화 해보세요
        ageBox = 50;

        //3.콘솔에 ageBox 값을 출력 하시오
        System.out.println(ageBox);
        
        //정리
        //변수는 변할 수 있는 수이고 값을 저장할 수 있는 메모리공간이다 
        
        // 도전 문제 ageBox 라는 변수에 값을 100으로 변경하시오
        ageBox = 100;

        System.out.println(ageBox);

        // 값을 넣지 않았기 떄문에 오류가 발생
        //        System.out.println(telBox);
        

    } //end of main

} // end of class

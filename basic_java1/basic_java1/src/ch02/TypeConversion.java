package ch02;

/*
* 형변환 이란 ?
* 데이터의 타입을 다른 타입으로 변경하는 것
* 자동형 변환 , 강제 형 변환
 */

public class TypeConversion {

    public static void main(String[] args) {

        // 자동 형 변환 학인 하기
        int intDataBox = 50;

        // 자연스럽게 형 변환 (double,int 두개 형이다름) -> 작은 상자에서 큰 상자로는 자동 형 변환이 가능
        double doubleDataBox = intDataBox;
        System.out.println(doubleDataBox);

        // 강제 형 변환 확인하기
        final double PI = 3.14159;
        // int intBOx = PI; 큰거에서 작은거로는 형변환이 불가능하다  ( 컴파일 시점에 오류 발생)

        // 개발자가 컴파일러에게 "컴파일러야 괜찮으니깐 그냥 강제로 넣어?
        // 데이터 손실이 발생 할 수 있지만 괜찮아!
        int intBox = (int)PI;
        // 데이터손실이 발생했다 ( 소수점을 버림 )
        System.out.println(intBox);

        double interestRate;
        int dicount;
        interestRate = 15.5;
        // 4바이트 상자에 8바이트 상자를 넣을려고 하니깐 컴파일러가 이거 오류 발생!
        // dicount = intDataBoxn;
        //강제 형변환 ->
        dicount = (int)intDataBox;
        // 응용
        System.out.println((int)7.5); // -> 소수점 지워짐
        System.out.println((int)0.1234); // -> 소주점 지워짐
    }

}

package ch07;

// 코드를 실행시켜보는 측
public class FunctionMainTest1 {

    // main 함수
    public static void main(String[] args) {
        // 여기에서 함수를 호출해서 사용 할 수있어
        int subResult1 = sub(100,50);
        System.out.println("subResult1 : " + subResult1);
        int subResult2 = sub(5,1);
        System.out.println("subResult2 : " + subResult2);
        
        // add1 함수를 호출 하시오
        int add1Result = add1(100,200,-50);
        System.out.println("add1 :" + add1Result);
    }

    // 함수 선언 - 두 수를 받아서 뺼셈하는 함수를 설계해 보자
    static int sub(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }

    static int add1(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        System.out.println("add2 :" + result);
        return result; // 실행의 제어권을 반납 한다
    }

}

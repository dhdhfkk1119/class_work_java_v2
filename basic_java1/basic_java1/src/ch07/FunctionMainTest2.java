package ch07;


/*
* 함수 호출과 스택 메모리
* */
public class FunctionMainTest2 {

    // main 함수
    public static void main(String[] args) {

        mul(10,2);
    }

    // 곱셈 함수
    static int mul(int n1 , int n2){
        int result = n1 * n2;
        return result;
    }

}

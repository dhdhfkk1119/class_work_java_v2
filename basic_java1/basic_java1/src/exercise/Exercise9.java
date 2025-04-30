package exercise;

public class Exercise9 {
    public static void main(String[] args) {
        greet("정우");
        square(20);
        signOfNumber(1);

        int age = 20;
        int num1 = 10;
        int num2 = 20;
        System.out.println(checkAdult(age));
        System.out.println(findMax(num1,num2));
    }


    static void greet(String name) {
        System.out.println("안녕하셍 ," + name + "님!");
    }

    static int square(int n1){
        return n1 * n1;
    }

    // 수의 부호 판별
    static String signOfNumber(int num){
        if(num == 0){
            return "ZERO";
        }else if(num == 1){
            return "positive";
        }else{
            return "negative";
        }
    }
    
    // 나이 확인
    static boolean checkAdult(int age){
        return (age >= 18) ? true : false;
    }

    // 최대값 찾기 함수
    static int findMax(int num1, int num2){
        return num1 > num2 ? num2 : num2;
    }

    
    


}

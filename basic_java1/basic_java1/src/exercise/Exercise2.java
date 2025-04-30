package exercise;

public class Exercise2 {

    public static void main(String[] args) {
        // 연습문제

        // 1. 데이터 10 ,100, 100을 벼누 선언과 동시에 초기화 하고 화면에 출력
        int q = 10;
        int w = 100;
        int e = 100;
        System.out.println(q +"/"+ w +"/"+ e);

        //2. int ageBox 상자에 20개를 담기
        int ageBox = 20;
        //2.1 ageBox 상자의 값을 30으로 변경하고 기존에 담겨 있던 데이터를 다른 곳으로 옮기기
        int UpdateBox = ageBox;
        ageBox = 30;

        System.out.println("ageBox : " + ageBox);
        System.out.println("UpdateBox : " + UpdateBox);

        //3. int a= 1; int b =3; 선언하고 a와b에 담겨 있는 값을 서로 스위칭
        int a =1;
        int b =3;
        int c = a;
        a = b;
        b = c;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}

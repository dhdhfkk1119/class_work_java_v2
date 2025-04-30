package ch08;

public class DogMainTest1 {

    public static void main(String[] args) {
        // 사용자 정의 생성자 ( 만약 정의를 해주지 않으면 자바에서 자동으로 선언해줌)
        //          name = s;
        Dog d2 = new Dog("흰둥이");
        System.out.println(d2.name);
    }

}

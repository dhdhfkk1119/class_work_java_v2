package ch08;

public class Dog {

    String name;
    
    // 개발자 생성자를 직접 만들지 않았다면
    // 컴파일러가 자동으로 기본 생성자를 추가해 준다

    public Dog(String s){
        name = s;
        // 생성자는 객체가 만들어질 때 강제성이 부여된다
    }

}

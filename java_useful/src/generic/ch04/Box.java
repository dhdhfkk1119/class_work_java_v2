package generic.ch04;

/*
* 도전 과제
* 제네릭 클래스 Box 설계 <T> 대체 문자열을 설계해 보세요
* */

public class Box<T>{
    // 변수 선언
    T box;

    // 생성자 선언
    public Box(){

    }
    // 내용물 설정
    public void setBox(T box){
        this.box = box;
    }

    // 내용물 반환
    public T getBox() {
        return box;
    }

    // 내용물 출력
    public void showBox(){
        System.out.println("box 이름은 : " + box);
    }
}

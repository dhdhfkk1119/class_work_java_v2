package ch07;

// 모든 자바 코드는 클래스라는 영역 안에서 작성이 된다

// 클래스를 메모리에 올린다
public class FishBreadMainTest {
    
    // 코드에 진입점
    public static void main(String[] args) {
        
        int a = 10; // 메모리 주소 Stack 에 올린다
        
        // 인스턴스(객체)화 (메모리에 올린다)
        FishBread fishBread = new FishBread();
        // JVM 실행 -> Class Loader 실행 ->
        // 동적 메모리 공간 Heap Area 올라간(fushBread라는 객체가 하나 생성됨)


        FishBread fishBread2 = new FishBread();

        System.out.println(fishBread);
        System.out.println(fishBread2);


    } // end of main
}

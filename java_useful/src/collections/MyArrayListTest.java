package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {

        List mList; // 리스트 인터페이스 (계열)

        int[] arrInt = new int[10];

        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        // <T> <- 제네릭 추후 배워야 할 내용
        // Integer(참조타입), int(기본데이터 타입)
        // Integer - wrap 클래스 int 기본 데이터 타입을 클래스로 설계해 둔 데이터 타입이다.
        // ArrayList<Integer> list -> 정수값을 하나의 변수에 저장하는 리스트 계열에 자료구조를 생성

        // 1. 값을 추가 하는 방법
        list.add(100);
        list.add(null);

        // 2. 값 꺼내기
        System.out.println(list.get(0));
        
        // 3. 값 삭제하기
        list.remove(1);
        // 3.1 삭제후 전체 출력
        System.out.println(list);

        // 4. 인덱스 번호로 지정해서 값 추가 하기
        list.add(1,1000);
        System.out.println(list);

        // 5. 전체 삭제
        list.clear();
        System.out.println(list);

        // 6. 전체 길이 구하기
        System.out.println(list.size());

        // nums 참조 변수에 list 참조 변수에 주소값을 대입 시켰다
        System.out.println("list" + list);
        
        // ArrayList 라는 주소값을 만들었고 거기에 주소값에 해당하는 -> 주소값을 가르키는 nums 라는 변수를 선언
        // 얕은 주소 값
        ArrayList nums = list;

        System.out.println("새로 선언한 nums 에 값을 추가 했다.");
        nums.add(10);
        nums.add(500);
        // nums 라는 변수로 접근해서 add()를 했는데 왜 다시 list 출력하면 데이터가 존재하고 있?
        System.out.println("num" + nums);
        System.out.println("list" + list2);
        System.out.println(nums.contains(10)); // nums 배열안에 10라는 값이 있는가 true , false 로 나옴
        System.out.println(nums.indexOf(500)); // 500 이라는 값이 몇번째 배열에 있는지

        for(int i =0 ; i<nums.size();i++){
            // nums[i] <-- 배열 방식
            System.out.println(nums.get(i));
        }
    }
}

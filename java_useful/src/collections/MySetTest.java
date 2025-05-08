package collections;

import java.util.*;

public class MySetTest {

    public static void main(String[] args) {
        
        // 게층 구조 확인 (업캐스팅된 상태)
        Set<Integer> mTestSet = new HashSet<>();
        
        // 사용방법
        HashSet<Integer> numberSet = new HashSet<>();

        // HashSet : 중복된 요소를 허용하지 않고 , 순서가 없는 자료 구조
        numberSet.add(500);
        numberSet.add(11); // 중복 값 , 추가 되지 않음
        numberSet.add(220);
        numberSet.add(311);
        numberSet.add(32); // 중복 값 , 추가 되지 않음


        System.out.println(numberSet.size());

        // 요소 제거 remove 없는 요소 선택해도 오류가 발생하지 않음
        numberSet.remove(1);
        System.out.println(numberSet.size());

        // 자료구조는 반목분과 함께 많이 사용 된다
        
        
        
        for(Integer num : numberSet){
            System.out.println( "num 값 확인:" + num);
        }
        // 자료구조는 반복문과 함계 많이 사용이 된다
//        for (int i = 0; i < numberSet.size(); i++) {
//
//            System.out.println("numberSet 값 확인 ; " + numberSet[i]);
//        }


        // Set 계열을 Iterator 타입으로 변환해서 순회 시킬 수 있었다 지금도 가능
        Iterator<Integer> iter = numberSet.iterator(); // set ---> Iterator 형변환
        while (iter.hasNext()){
            System.out.println("값 : " + iter.next());
        }
        System.out.println("---------------------------------");
        // Set 계열 자료 구조 선언(정수값만 담을 수 있고 중복 허용 불가)
        HashSet<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() < 6){
            lottoNumbers.add(getRandomNumber());
        }
        System.out.println("무작위로 선택된 로또 번호 6개 :" + lottoNumbers.toString());
        // HashSet 데이터 타입을 ArrayList 객체 생성식에 즉, 생성자에 인자값을 넣을 수 있도록 설계 됨
        ArrayList<Integer> sortList = new ArrayList<>(lottoNumbers);
        Collections.sort(sortList);
        System.out.println("정렬된 로또 번호 확인 : " + sortList);
        

    }
    // 무작위 1 부터 45까지 랜덤 번호 생성 함수
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(45) +1;
    }
}

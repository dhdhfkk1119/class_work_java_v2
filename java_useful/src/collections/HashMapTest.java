package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        
        // 게층 구조 확인
        Map<String,String> map;
        
        // Map 계열 자료 구조 객체 선언과 동시에 초기화
        Map<String,String> books = new HashMap<>();
        books.put("해리포터","J.K. 롤링");
        books.put("어린왕자","베르베르");
        books.put("1984","미야자키하야오");
        
        // 데이터 조회 : 특정 키 값으로 value를 읽어 보기
        String value = books.get("해리포터");
        System.out.println(value);
        String value2 = books.get("해리포터2"); // null 값 등장
        System.out.println(value2);

        // 데이터 수정하기
        books.put("1984","업데이트 됨");
        System.out.println(books.get("1984"));

        // 데이터 삭제하기
        books.remove("어린왕자");
        // size() 확인
        System.out.println(books.size());
        // 키 값을 확인하는 메서드 제공 됨
        System.out.println("keySet() : " + books.keySet());

        for (String book : books.keySet()){
            System.out.println("books 의 key 값 확인 :" + book);
            System.out.println("books 의 value 값 확인 :" + books.get(book));
        }
        
        // Iterator 를 사용해서 순회 시켜 보자
        Iterator<Map.Entry<String,String>> Iter = books.entrySet().iterator();
        while (Iter.hasNext()){
            Map.Entry<String,String> entry = Iter.next();
            System.out.println(entry.getKey() + "<--Key  Value-->" + entry.getValue());
        }

        System.out.println("Map(books)의 크기를 반환 : " + books.size());


    }
}

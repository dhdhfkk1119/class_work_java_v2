package _string;

public class StringBufferTest1 {

    // StringBuffer <-- 클래스를 이야기 하기 위해서 String 특징 ...
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("World");

        // 새로 배우는
        StringBuffer buffer1 = new StringBuffer();

        buffer1.append(str1);
        System.out.println("수정 전 :" + System.identityHashCode(buffer1));

        // buffer1 에 값을 수정해 보자. 문자열 변경
        buffer1.append(str2);
        System.out.println("수정 후 :" + System.identityHashCode(buffer1));

        // 이전 버전은 hashCode() 해당 객체의 유일성 보장하는 정수 값
        // API 8 버전에서는 buffer1.toString() 해야 값을 확인 할수 있다;
        System.out.println(buffer1);

        // StringBuffer 데이터 타입을 String 으로 형 변환 하려면 .toString() 호출하면 된다
        String result = buffer1.toString();
        System.out.println(result);
    }

}

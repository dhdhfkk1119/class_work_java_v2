package _string;

public class StringTest1 {

    public static void main(String[] args) {
        String st11 = "문자열1";
        String str2 = new String("abc");
        String str3 = new String("abc");
        
        // 참조 비교 : 각각에 객체의 주소값을 비교한다 주소 == 주소
        System.out.println("str2 == str3 : " + (str2 == str3));

        String st14 = "abc";
        String st15 = "abc";
        String str6 = "abc";
        System.out.println("st14 == st15 : " + (st14 == st15));

        String str7 = str6 + "안녕";
        System.out.println("str7 == str6 : " + (str7));
    }

}

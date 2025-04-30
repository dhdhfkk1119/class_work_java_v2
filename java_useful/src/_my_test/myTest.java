package _my_test;

public class myTest {
    public static void main(String[] args) {
        String a = "Hello. WWWWW. HHHHH. ";
        // replace -> 자신이 바꾸고 싶은 문자열을에 해당하는 모든 문자열을 바꿈 '모든'
        String b = a.replace(".","/");
        System.out.println(b);

        // replacFirst -> 자신이 바꾸고 싶은문자열 regex 에 처음으로 해당하는 글자를 바꿈 '처음'
        String c = a.replaceFirst("l","z");
        System.out.println(c);

        // replace -> 자신이 바꾸고 싶은 문자열을에 해당하는 모든 문자열을 바꿈 '모든' 단 특수문자 치환은 어렵다
        String d = a.replaceAll(".","/");
        System.out.println(d);

        // 저장된 문자열에 index 값 에 해당하는 (6)번호까지 짜른뒤 뒤에 문자열만 출력이된다
        // 당연 문자열은 왼쪽부터 0 시작한다 
        String e = a.substring(6);
        System.out.println(e);
    }
}

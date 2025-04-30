package exercise;

public class TypeConversionExercises {
    public static void main(String[] args) {
        int a = 300;
        double b = a; // 자동 형 변환 (작은 상자에서 큰 상자로 자연스럽게 들어간다)
        // b 를 콘솔에 출력한다면 예상 결과는 ??
        System.out.println(b);

        // 문제
        double c = 5.67;
        int d = (int) c;

        // 문제
        float floatNum = 4.5f;
        int intNum = (int) floatNum;
        // intNum -> 4;
        System.out.println(intNum);

        // 문제
        double largeValue = 150.75;
        byte byteValue = (byte) largeValue;
        System.out.println(byteValue);

    }
}

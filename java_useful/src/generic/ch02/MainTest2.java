package generic.ch02;

import generic.Plastic;
import generic.Powder;

public class MainTest2 {

    public static void main(String[] args) {
        // 재료 선언
        Plastic plastic = new Plastic();
        Powder powder = new Powder();
        Water water = new Water();
        // 사용하는 시점에 T대신 어떤 자료형을 사용할지 지정해 주면된다
        GenericPrinter<Plastic> genericPrinter = new GenericPrinter<>();
        genericPrinter.setMeterial(plastic);
        System.out.println(genericPrinter.toString());
        // 재료 꺼내기
        Plastic usePlastic = genericPrinter.getMeterial();
        System.out.println(usePlastic);

        GenericPrinter<Water> genericPrinter2 = new GenericPrinter<>();
        genericPrinter2.setMeterial(water);
        System.out.println(genericPrinter2.toString());
        Water water1 = genericPrinter2.getMeterial();
        System.out.println(water1);

        // 컴파일 시점에 오류를 알려줘 안정적인 코드적업을 수행할 수 있다
        // Powder userPowder = genericPrinter.getMeterial();

    }

}

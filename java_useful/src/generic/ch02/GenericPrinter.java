package generic.ch02;

/*
* 제네릭 프로그래밍을 사용해 보자
* 문법 클래스, 변수 , 데이터 타입, 메서드 등 <T>*/

public class GenericPrinter<T> {
    // T 라는 대체 문자를 사용 , E, K , V (사실 아무 문자나 사용 가능하다)
    // 자료형 매개변수(type parameter)
    // 이 클래스는 사용하는 시점에 실제 사용될 자료형이 결정이 된다.
    T meterial;

    public T getMeterial() {
        return meterial;
    }

    public void setMeterial(T meterial) {
        this.meterial = meterial;
    }

    @Override
    public String toString() {
        return "GenericPrinter{" +
                "meterial=" + meterial +
                '}';
    }
}
